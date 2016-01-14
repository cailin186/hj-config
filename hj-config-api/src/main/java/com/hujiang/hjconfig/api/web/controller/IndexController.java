package com.hujiang.hjconfig.api.web.controller;

import com.hujiang.hjconfig.core.vo.HJConfigApp;
import com.hujiang.hjconfig.api.service.IPropertyConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by suncheng on 11/23/15.
 */
@Controller
public class IndexController {
    @Autowired
    private IPropertyConfigService propertyConfigService;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/config/save")
    public String save(String key,String value,HJConfigApp app){
        propertyConfigService.setProperty(key,value,app);
        return "index";
    }

    @RequestMapping("/config/find")
    @ResponseBody
    public String find(HJConfigApp app,String key){
        return propertyConfigService.getProperty(app,key);
    }
}
