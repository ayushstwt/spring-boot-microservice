package com.ayshriv.redis_server.config;

import com.ayshriv.redis_server.binding.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {

    @Bean
    public JedisConnectionFactory jedisConnectionFactory()
    {
        JedisConnectionFactory jedisConnectionFactory=new JedisConnectionFactory();

        // redis server properties we write here if we are in same machine than there is no need to write properties

        // jedisConnectionFactory.setHostName("localhost");
        // jedisConnectionFactory.setPort(6379);

        return jedisConnectionFactory;
    }

    @Bean
    public RedisTemplate<String, Country> redisTemplate()
    {
        RedisTemplate<String, Country> redisTemplate=new RedisTemplate<>();
        redisTemplate.setConnectionFactory(jedisConnectionFactory());
        return redisTemplate;
    } 
}
