package com.zking.springboot01.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author
 * @Company zking
 * @create 2019年11月10日
 **/
@RestController
public class ControllerTest {

   /* @RequestMapping(value = "/hello",method = RequestMethod.GET)*/
    @GetMapping("/hello")
    public Object hello(String name){
        System.out.println("hello controller+     name="+name);

        List<String> d= Arrays.asList("a","b","c");

        Map<String,Object> map=new HashMap<>();
        map.put("code",1);
        map.put("msg","操作成功");
        map.put("data",d);
        return map;
    }

    //从uri中获取参数
    @GetMapping("/pathvar/{id}")
    public Object testPathVar(@PathVariable("id") String id){
        System.out.println("id="+id);
        Map<String,Object> map=new HashMap<>();
        map.put("code",1);
        map.put("msg","操作成功");
        map.put("data",id);
        return map;
    }



    @Resource
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/redis")
    public Object redis() {

        String name = "redis test";
        redisTemplate.opsForValue().set("redisTest", name);

        Map<String,Object> map = new HashMap<>();
        map.put("code", 1);
        map.put("msg", "操作成功");

        return map;
    }


}
