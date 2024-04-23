package org.tonight.apipracticespring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.tonight.apipracticespring.entity.UserProjects;
import org.tonight.apipracticespring.entity.exampleUser;
import org.tonight.apipracticespring.repository.UserProjectRepo;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class UserProjectService {

    final UserProjectRepo userProjectRepo;


    public void userProjectSaved(exampleUser user){
        userProjectRepo.saveAll(user.getProjects());

    }

    public List<String[]> userDetails(Integer id){
        return userProjectRepo.firstNameProjectMap(id);
    }



}
