package com.jedify.feederservice;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.jedify.feederservice")
@EnableAutoConfiguration
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
    }
}
