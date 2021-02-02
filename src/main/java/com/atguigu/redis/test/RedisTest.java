package com.atguigu.redis.test;

import org.junit.Test;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;

public class RedisTest {

    @Test
    public void testConnection(){
//        Jedis redis = new Jedis("java101", 6385);
        Jedis redis = new Jedis("192.168.6.101", 6385);
        System.out.println(redis);
//        redis.select(0);
        System.out.println(redis.keys("*"));
//        System.out.println(redis.lrange("k2",0,-1));
//        System.out.println(redis.smembers("k3"));
//        System.out.println(redis.hmget("k1", "name","email","address"));
        System.out.println(redis.zrangeWithScores("k1",0,-1));
    }

    @Test
    public void test02(){
        HashSet<HostAndPort> set = new HashSet<>();
        set.add(new HostAndPort("192.168.6.101",6379));
//        set.add(new HostAndPort("192.168.6.101",6380));
//        set.add(new HostAndPort("192.168.6.101",6381));
//        set.add(new HostAndPort("192.168.6.101",6389));
//        set.add(new HostAndPort("192.168.6.101",6390));
//        set.add(new HostAndPort("192.168.6.101",6391));
        JedisCluster jedisCluster = new JedisCluster(set);
        System.out.println(jedisCluster.get("k1"));
    }
    @Test
    public void test04(){
        System.out.println("test,hotfix");
    }

}
