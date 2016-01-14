package com.hujiang.hjconfig.api;

import com.hujiang.hjconfig.api.config.NoSqlConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * Created by suncheng
 */
@SpringBootApplication(scanBasePackages = {"com.hujiang.hjconfig"})
public class HJConfigApplication {
    public static void main(String[] args){
        SpringApplication.run(HJConfigApplication.class,args);
    }
}
