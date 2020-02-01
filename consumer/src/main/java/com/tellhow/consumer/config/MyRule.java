package com.tellhow.consumer.config;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

// 必须继承AbstractLoadBalanceRule类
@Slf4j
public class MyRule extends AbstractLoadBalancerRule {

    int i = 0;

    public Server choose(ILoadBalancer lb, Object key) {

        //获取所有微服务
        List<Server> allList = lb.getAllServers();
        //获取所有可用的微服务
        List<Server> reachableServers = lb.getReachableServers();
        return null;
    }

    @Override
    public void initWithNiwsConfig(IClientConfig iClientConfig) {
    }

    @Override
    public Server choose(Object o) {
        return choose(this.getLoadBalancer(), o);
    }

}
