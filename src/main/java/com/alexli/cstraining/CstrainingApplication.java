package com.alexli.cstraining;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.alexli.cstraining.mapper")
@SpringBootApplication
public class CstrainingApplication {
    public static void main(String[] args) {
        SpringApplication.run(CstrainingApplication.class, args);
    }

}
