package com.xl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MySelfRule {

	@Bean
    public IRule myRule() {
        //return new RoundRobinRule();//轮询算法
        //return new RandomRule();//随机算法
        return new RandomRule();
    }
}
