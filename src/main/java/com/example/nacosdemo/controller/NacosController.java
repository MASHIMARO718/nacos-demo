package com.example.nacosdemo.controller;

import com.example.nacosdemo.config.NacosPropertiesTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName NacosController
 * @Description TODO
 * @Author mhJiang
 * @Date 2020/12/16 14:45
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/nacos")
public class NacosController {
    @Resource
    private NacosPropertiesTest nacosPropertiesTest;
    @Resource
    public RestTemplate restTemplate;

    @GetMapping(value = "/getConfig")
    public String getConfig(){
        String serviceId = nacosPropertiesTest.getServiceId();
        System.out.println(serviceId);
        return restTemplate.getForEntity("http://"+serviceId+"/discovery/get?serviceName=service-provider",String.class).toString();
    }

}
