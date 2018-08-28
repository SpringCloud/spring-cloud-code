package cn.springcloud.book.core;

import org.junit.Test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapTest {
    @Test
    public void test() {
        Map<String,String> map = new ConcurrentHashMap<>();
        System.out.println(map.put("test","test"));
        System.out.println(map.put("test","test2"));
    }
}
