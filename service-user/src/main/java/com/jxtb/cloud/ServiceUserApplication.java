package com.jxtb.cloud;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jxtb on 2019/1/30.
 */
@SpringBootApplication
@EnableEurekaClient
public class ServiceUserApplication {
    public static ApplicationContext ctx;

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /***
     * 获取数据源
     * @param dataSourceName
     * @return
     */
    public static DruidDataSource getDataSource(String dataSourceName)
    {
        DruidDataSource dataSource=(DruidDataSource)ctx.getBean(dataSourceName);
        return dataSource;
    }

    /***
     * 组件服务启动
     * @throws Exception
     */
    public static ApplicationContext start()throws Exception
    {
        ctx=(ApplicationContext) SpringApplication.run(ServiceUserApplication.class);
        //SysProperties.init();
        return ctx;
    }
    public static void main(String[] args)throws Exception {
        //start();
        SpringApplication.run(ServiceUserApplication.class, args);
    }
}
