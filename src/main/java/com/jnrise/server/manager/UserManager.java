package com.jnrise.server.manager;

import com.jnrise.server.bean.LoginData;
import com.jnrise.server.cache.UserCache;
import com.jnrise.server.model.User;
import com.jnrise.server.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wuweifeng wrote on 2018/4/16.
 */
@Service
public class UserManager {
    @Resource
    private UserRepository userRepository;
    @Resource
    private UserCache userCache;

    /**
     * 登录
     */
    public LoginData login(User user) {
        User temp = userRepository.findByAccount(user.getAccount());
        LoginData loginData = new LoginData();

        if (temp == null) {
            loginData.setCode(-1);
            loginData.setMessage("用户不存在");
        } else if (!temp.getPassword().equals(user.getPassword())) {
            loginData.setCode(-2);
            loginData.setMessage("密码错误");
        } else {
            //登录成功
            loginData.setCode(0);
            //保存token
            loginData.setToken(userCache.saveToken(temp.getId()));
        }
        return loginData;
    }


}
