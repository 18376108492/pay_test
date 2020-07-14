package com.itdan.register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心服务启动类
 */
@EnableEurekaServer
@SpringBootApplication
public class RegisterApplication 
{
    public static void main( String[] args )
    {
        SpringApplication.run(RegisterApplication.class, args);
    }
}
