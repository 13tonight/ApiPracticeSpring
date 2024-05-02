package org.tonight.apipracticespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class ApiPracticeSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiPracticeSpringApplication.class, args);
    }

}
