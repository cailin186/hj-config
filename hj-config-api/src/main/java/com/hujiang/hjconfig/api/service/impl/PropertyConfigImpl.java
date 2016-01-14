package com.hujiang.hjconfig.api.service.impl;

import com.hujiang.hjconfig.core.vo.HJConfigApp;
import com.hujiang.hjconfig.api.service.IPropertyConfigService;
import com.hujiang.hjconfig.api.util.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by suncheng on 11/23/15.
 */
@Service
public class PropertyConfigImpl implements IPropertyConfigService {
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Override
    public String setProperty(String key,String value,HJConfigApp app) {
        final String redisKey = RedisUtils.getKey(key, app);
        redisTemplate.opsForValue().append(redisKey,value);
        return key;
    }

    @Override
    public String getProperty(HJConfigApp app, String key) {
        final String redisKey = RedisUtils.getKey(key,app);
      //   (String)redisTemplate.opsForValue().get(redisKey);
        return redisTemplate.opsForValue().get(redisKey);
    }

    @Override
    public List getAllProperties(HJConfigApp app) {
        return null;
    }

    @Override
    public String deleteProperty(String key, HJConfigApp app) {
        final String redisKey = RedisUtils.getKey(key,app);
        redisTemplate.delete(redisKey);
        return key;
    }

    @Override
    public String updateProperty(String key, String value, HJConfigApp app) {
        final String redisKey = RedisUtils.getKey(key,app);
        redisTemplate.opsForValue().set(redisKey,value);
        return null;
    }
}
