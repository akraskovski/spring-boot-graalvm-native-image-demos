//todo: commented until build is not stable
//package com.github.akraskovski.redis;
//
//import org.redisson.api.RedissonClient;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//@Component
//public class RedissonExampleRunner implements CommandLineRunner {
//
//    private static final Logger log = LoggerFactory.getLogger(RedissonExampleRunner.class);
//
//    private final RedissonClient redissonClient;
//
//    public RedissonExampleRunner(RedissonClient redissonClient) {
//        this.redissonClient = redissonClient;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        var map = redissonClient.getMap("test.redisson.map.cache");
//        map.put("test.key", "test.value");
//        log.info("Put [test.key]='test.value'");
//        log.info("Removed by key [test.key]='{}'", map.remove("test.key"));
//    }
//}
