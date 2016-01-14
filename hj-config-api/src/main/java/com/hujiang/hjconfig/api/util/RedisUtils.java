package com.hujiang.hjconfig.api.util;

import com.hujiang.hjconfig.core.vo.HJConfigApp;

/**
 * Created by suncheng on 11/23/15.
 */
public abstract class RedisUtils {
    private static final String REDIS_KEY_PREFIX = "hj:config";


    public static String getKey(String key,HJConfigApp app){
        return String.format("%s:%s:%s:%s:%s",REDIS_KEY_PREFIX
                ,app.getAppId(),app.getProfile(),app.getVersion(),key);
    }
}
