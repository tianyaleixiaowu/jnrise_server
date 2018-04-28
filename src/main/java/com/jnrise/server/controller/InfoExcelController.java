package com.jnrise.server.controller;

import cn.afterturn.easypoi.entity.vo.NormalExcelConstants;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import cn.afterturn.easypoi.view.PoiBaseView;
import com.jnrise.server.bean.InfoListData;
import com.jnrise.server.excel.InfoExcel;
import com.jnrise.server.manager.InfoManager;
import com.jnrise.server.requestbody.InfoQuery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author wuweifeng wrote on 2018/4/16.
 */
@Controller
@RequestMapping("/excel")
public class InfoExcelController {
    @Resource
    private InfoManager infoManager;
    
    @RequestMapping("download")
    public void downloadByPoiBaseView(@RequestBody InfoQuery infoQuery, ModelMap map, HttpServletRequest request,
                                      HttpServletResponse response) {
        List<InfoExcel> list = infoManager.excel(infoQuery);
        ExportParams params = new ExportParams("瑞思数据导出", "数据", ExcelType.XSSF);
        params.setFreezeCol(2);
        map.put(NormalExcelConstants.DATA_LIST, list);
        map.put(NormalExcelConstants.CLASS, InfoExcel.class);
        map.put(NormalExcelConstants.PARAMS, params);
        PoiBaseView.render(map, request, response, NormalExcelConstants.EASYPOI_EXCEL_VIEW);
    }

    /**
     * 查询
     *
     * @param infoQuery
     *         infoQuery
     */
    @RequestMapping("query")
    @ResponseBody
    public InfoListData query(@RequestBody InfoQuery infoQuery) {
        return infoManager.query(infoQuery);
    }
}
