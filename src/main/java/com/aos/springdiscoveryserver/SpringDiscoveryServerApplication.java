package com.aos.springdiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDiscoveryServerApplication.class, args);
    }

}
