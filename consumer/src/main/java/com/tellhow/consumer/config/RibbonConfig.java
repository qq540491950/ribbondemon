package com.tellhow.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {

    @Bean
    // 开启负载均衡
    @LoadBalanced
    public RestTemplate restTemplate () {
        return new RestTemplate();
    }

    /**
     * Ribbon配置的优先级：属性配置 > JAVA配置>Netflix Ribbon默认配置
     * @return
     */
    @Bean
    public IRule getRule(){
        //使用随机的算法替换默认的轮询算法
        return new MyRule();
        //return new RandomRule();
    }
}
