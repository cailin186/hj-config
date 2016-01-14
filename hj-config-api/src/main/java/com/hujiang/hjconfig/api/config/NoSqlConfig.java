package com.hujiang.hjconfig.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Created by suncheng on 11/23/15.
 */
@Configuration
public class NoSqlConfig{
    @Bean
    public RedisTemplate<String,Object> redisTemplate(JedisConnectionFactory jedisConnectionFactory){
        RedisTemplate<String,Object> redisTemplate = new RedisTemplate<String,Object>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new StringRedisSerializer());
        return redisTemplate;
    }
}
