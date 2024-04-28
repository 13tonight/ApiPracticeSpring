package org.tonight.apipracticespring.feginConsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.tonight.apipracticespring.dto.GitUserDto;

@FeignClient(value = "GitUserFeign", name = "GitUserFeign",url = "https://api.github.com/users")
public interface GitUserFeignClient {
    @GetMapping("/{username}")
    GitUserDto getGitHubUserwithFeignClient(@PathVariable String username);
}
