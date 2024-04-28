package org.tonight.apipracticespring.config;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.tonight.apipracticespring.dto.GitUserDto;
import org.tonight.apipracticespring.feginConsumer.GitUserFeignClient;


@Component
public class ApplicationConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    @Bean
    public WebClient webClient() {
        return WebClient.builder().build();
    }
    @Bean
    public Feign.Builder getFeignBuilder(){
        return Feign.builder();
    }
    @Bean
    public GitUserFeignClient gitUserFeignClient() {
        return new GitUserFeignClient() {
            @Override
            public GitUserDto getGitHubUserwithFeignClient(String username) {
                return null;
            }
        };
    }
}
