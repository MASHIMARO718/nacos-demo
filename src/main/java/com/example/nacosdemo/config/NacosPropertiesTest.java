package com.example.nacosdemo.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @ClassName nacosProperties
 * @Description TODO
 * @Author mhJiang
 * @Date 2020/12/16 14:46
 * @Version 1.0
 */
@Data
@Component
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class NacosPropertiesTest {
    @NacosValue(value = "${serviceId:test}", autoRefreshed = true)
    private String serviceId;

}
