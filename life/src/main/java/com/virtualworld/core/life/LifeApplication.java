package com.virtualworld.core.life;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LifeApplication {

    public static void main(String[] args) {
        InitVirtualWorld initVirtualWorld=new InitVirtualWorld();
        initVirtualWorld.unkown();
        SpringApplication.run(LifeApplication.class, args);
    }
}
