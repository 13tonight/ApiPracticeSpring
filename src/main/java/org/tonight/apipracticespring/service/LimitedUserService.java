package org.tonight.apipracticespring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.tonight.apipracticespring.dto.LimitedUserDetailsDto;
import org.tonight.apipracticespring.entity.exampleUser;
import reactor.core.publisher.Mono;

@Service
public class LimitedUserService {

    @Autowired
    WebClient webClient;


    public LimitedUserDetailsDto limitedUserDetails(Integer id) {
        return webClient.get().uri("http://localhost:8090/user/byId?id=" + id)
                .retrieve().bodyToMono(exampleUser.class).map(this::getLimitedUserDetails).block();


    }

    public LimitedUserDetailsDto getLimitedUserDetails(exampleUser user) {
        return LimitedUserDetailsDto.builder()
                .userId(user.getUserId())
                .firstName(user.getFirstName())
                .companyName(user.getCompany().getCompanyName())
                .designation(user.getDesignation())
                .membership(user.getAccount().getMembershipType())
                .build();
    }
}
