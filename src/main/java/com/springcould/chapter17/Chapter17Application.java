package com.springcould.chapter17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 程序入口
 * <code>@EnableCircuitBreaker</code>开启断路器功能
 */
@EnableCircuitBreaker
@EnableEurekaClient
@SpringBootApplication
public class Chapter17Application {

    /**
     * 创建RestTemplate的Spring Bean实例，并开启客户端的负载平衡
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(Chapter17Application.class, args);
    }

}
