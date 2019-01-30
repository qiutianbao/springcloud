package com.jxtb.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by jxtb on 2019/1/30.
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudUtilApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudUtilApplication.class, args);
    }
}
