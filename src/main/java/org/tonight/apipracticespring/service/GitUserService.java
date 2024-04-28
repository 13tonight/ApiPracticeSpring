package org.tonight.apipracticespring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.tonight.apipracticespring.dto.GitUserDto;

import java.time.Duration;

@Service
public class GitUserService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    WebClient webClient;

//    public GitUserDto getGitUserInfo(String username) {
//       return restTemplate.getForObject("https://api.github.com/users/" + username, GitUserDto.class);
//    }

    public GitUserDto getGitUserInfo(String username) {
        return webClient.get().uri("https://api.github.com/users/" + username).retrieve().bodyToMono(GitUserDto.class).timeout(Duration.ofMillis(1000)).block();
    }
}
