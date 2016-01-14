package com.hujiang.hjconfig.api.web.controller.demo;

import com.hujiang.hjconfig.core.service.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by suncheng on 16/1/14.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/list")
    public List list(){
        return demoService.queryList();
    }
}
