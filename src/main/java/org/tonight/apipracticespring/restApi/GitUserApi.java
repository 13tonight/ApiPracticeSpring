package org.tonight.apipracticespring.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.tonight.apipracticespring.dto.GitUserDto;
import org.tonight.apipracticespring.service.GitUserService;

@RestController
@RequestMapping("git")
public class GitUserApi {

    @Autowired
    GitUserService gitUserService;

    @GetMapping("/user")
    public GitUserDto gitUserName(@RequestParam String userName){
        return gitUserService.getGitUserwithFeign(userName);
    }
}
