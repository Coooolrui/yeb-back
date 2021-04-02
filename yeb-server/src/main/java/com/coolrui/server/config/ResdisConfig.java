package com.coolrui.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @Author: Coolrui
 * @Date: Created in 21:36 2021/3/24
 * @Description redis配置类
 */
@Configuration
public class ResdisConfig {
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();

        //设置String类型key序列化
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        //设置String类型value序列化
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        //设置Hash类型key序列化
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        //设置String类型value序列化
        redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        return redisTemplate;
    }
}
