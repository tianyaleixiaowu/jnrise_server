package com.jnrise.server.manager;

import com.jnrise.server.bean.BaseData;
import com.jnrise.server.bean.ContactUserData;
import com.jnrise.server.bean.HistoryData;
import com.jnrise.server.bean.RongUserData;
import com.jnrise.server.model.RongMessage;
import com.jnrise.server.model.RongUser;
import com.jnrise.server.repository.RongMessageRepository;
import com.jnrise.server.repository.RongUserRepository;
import io.rong.RongCloud;
import io.rong.methods.user.User;
import io.rong.models.response.TokenResult;
import io.rong.models.user.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wuweifeng wrote on 2018/8/22.
 */
@Service
public class KefuManager {
    @Resource
    private RongUserRepository rongUserRepository;
    @Resource
    private RongMessageRepository rongMessageRepository;
    @Value("${rong.appKey}")
    private String appKey;
    @Value("${rong.appSecret}")
    private String appSecret;

    public RongUserData findKefu(Integer kefu) {
        List<RongUser>  rongUsers = rongUserRepository.findByKefu(kefu);
        RongUserData rongUserData = new RongUserData();
        rongUserData.setCode(0);
        rongUserData.setData(rongUsers);
        return rongUserData;
    }

    /**
     * 启动时先注册客服
     */
    @PostConstruct
    public void registKefu() throws Exception {
        RongUser rongUser = rongUserRepository.findByUserId("rise");
        //用户已存在
        if (rongUser != null) {
            return;
        }
        String userId = "rise";
        RongCloud rongCloud = RongCloud.getInstance(appKey, appSecret);
        User user = rongCloud.user;
        UserModel userModel = new UserModel()
                .setId(userId)
                .setName(userId)
                .setPortrait("http://www.rongcloud.cn/images/logo.png");
        TokenResult result = user.register(userModel);
        String token = result.getToken();
        rongUser = new RongUser();
        rongUser.setName(userId);
        rongUser.setKefu(1);
        rongUser.setToken(token);
        rongUser.setUserId(userId);
        rongUserRepository.save(rongUser);
    }

    /**
     * 保存单聊消息
     * @param fromUserId
     * @param toUserId
     * @param content
     * @return
     */
    public BaseData send(String fromUserId, String toUserId, String content) {
        RongMessage rongMessage = new RongMessage();
        rongMessage.setFromUserId(fromUserId);
        rongMessage.setToUserId(toUserId);
        rongMessage.setMessage(content);

        rongMessageRepository.save(rongMessage);
        BaseData baseData = new BaseData();
        baseData.setCode(0);
        return baseData;
    }

    public ContactUserData contact(String kefuId) {
        List<String> rongMessages = rongMessageRepository.findByToUserId(kefuId);
        ContactUserData contactUserData = new ContactUserData();
        contactUserData.setData(rongMessages);
        contactUserData.setCode(0);
        return contactUserData;
    }


    public HistoryData history(String fromId, String toId) {
        List<RongMessage> rongMessages = rongMessageRepository.findMessages(fromId, toId);
        HistoryData historyData = new HistoryData();
        historyData.setRongMessages(rongMessages);
        historyData.setCode(0);

        return historyData;
    }

    /**
     * 向融云注册新用户
     * @param temp temp
     */
    public RongUserData regist(RongUser temp) throws Exception {
        RongUserData rongUserData = new RongUserData();
        rongUserData.setCode(0);
        List<RongUser> rongUsers = new ArrayList<>();
        rongUserData.setData(rongUsers);

        RongUser rongUser = rongUserRepository.findByUserId(temp.getUserId());
        //用户已存在
        if (rongUser != null) {
            rongUsers.add(rongUser);
            return rongUserData;
        }

        RongCloud rongCloud = RongCloud.getInstance(appKey, appSecret);
        User user = rongCloud.user;
        UserModel userModel = new UserModel()
                .setId(temp.getUserId())
                .setName(temp.getUserId())
                .setPortrait("http://www.rongcloud.cn/images/logo.png");
        TokenResult result = user.register(userModel);
        String token = result.getToken();
        rongUser = new RongUser();
        BeanUtils.copyProperties(temp, rongUser);
        rongUser.setName(temp.getUserId());
        rongUser.setKefu(0);
        rongUser.setToken(token);

        rongUsers.add(rongUserRepository.save(rongUser));
        return rongUserData;
    }

}
