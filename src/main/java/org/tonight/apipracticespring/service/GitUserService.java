package org.tonight.apipracticespring.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.tonight.apipracticespring.dto.GitUserDto;
import org.tonight.apipracticespring.feginConsumer.GitUserFeignClient ;

import java.time.Duration;

@Service
@RequiredArgsConstructor
@Data
public class GitUserService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    WebClient webClient;

    @Autowired
    GitUserFeignClient gitUserFeignClient;

//    public GitUserDto getGitUserInfo(String username) {
//       return restTemplate.getForObject("https://api.github.com/users/" + username, GitUserDto.class);
//    }

    public GitUserDto getGitUserInfo(String username) {
        return webClient.get().uri("https://api.github.com/users/" + username).retrieve().bodyToMono(GitUserDto.class).timeout(Duration.ofMillis(1000)).block();
    }
    public GitUserDto getGitUserwithFeign(String username){
        return gitUserFeignClient.getGitHubUserwithFeignClient(username);
    }
}
