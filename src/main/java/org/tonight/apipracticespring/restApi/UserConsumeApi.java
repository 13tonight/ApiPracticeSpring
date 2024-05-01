package org.tonight.apipracticespring.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tonight.apipracticespring.dto.LimitedUserDetailsDto;
import org.tonight.apipracticespring.service.LimitedUserService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/consumeApi")
public class UserConsumeApi {

    @Autowired
    LimitedUserService limitedUserService;

    @GetMapping("/limitedUser")
    public LimitedUserDetailsDto limitedUser(Integer id) {
        return limitedUserService.limitedUserDetails(id);
    }

}
