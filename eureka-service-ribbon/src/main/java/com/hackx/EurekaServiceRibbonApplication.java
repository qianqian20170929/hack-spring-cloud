package com.hackx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrix
@EnableHystrixDashboard
public class EurekaServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceRibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced /* 表明restTemplate开启负载均衡的功能 */
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


}
