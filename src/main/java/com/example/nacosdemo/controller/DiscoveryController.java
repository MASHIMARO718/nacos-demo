package com.example.nacosdemo.controller;

import com.alibaba.nacos.api.annotation.NacosInjected;
import com.alibaba.nacos.api.exception.NacosException;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import com.example.nacosdemo.config.NacosPropertiesTest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName DiscoveryController
 * @Description TODO
 * @Author mhJiang
 * @Date 2020/12/16 17:12
 * @Version 1.0
 */
@RestController
@RequestMapping("/discovery")
public class DiscoveryController {
    @GetMapping(value = "/get")
    public String get(@RequestParam String serviceName, HttpServletRequest request) throws NacosException {
        System.out.println("server port:"+request.getServerPort()+"response...");
        return "hello " + serviceName;
    }

}
