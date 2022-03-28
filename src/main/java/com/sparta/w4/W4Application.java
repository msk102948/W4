package com.sparta.w4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@ServletComponentScan("lecturer")
@EnableJpaAuditing
@SpringBootApplication
public class W4Application {

    public static void main(String[] args) {
        SpringApplication.run(W4Application.class, args);
    }
    @PostConstruct
    public void started(){ TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul")); }
}
