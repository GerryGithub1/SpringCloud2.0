package com.test.zipkin;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class TestZipkinApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(TestZipkinApplication.class).web(true).run(args);
    }
}
