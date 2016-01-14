package com.hujiang.hjconfig.core.service.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by suncheng on 16/1/14.
 */
@Service
public class DemoService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List queryList(){
        List list = jdbcTemplate.queryForList("select * from demo");
        return list;
    }
}
