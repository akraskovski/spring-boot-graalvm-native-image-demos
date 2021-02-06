package com.github.akraskovski.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisExampleRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(RedisExampleRunner.class);

    private final StringRedisTemplate redisTemplate;

    public RedisExampleRunner(StringRedisTemplate redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    @Override
    public void run(String... args) {
        var ops = redisTemplate.opsForHash();
        ops.put("test.redis.map.cache", "test.key", "test.value");
        log.info("Put [test.key]='test.value'");
        log.info("Removed by key [test.key]='{}'", ops.delete("test.redis.map.cache", "test.key"));
    }
}
