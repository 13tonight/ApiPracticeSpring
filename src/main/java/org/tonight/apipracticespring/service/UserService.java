package org.tonight.apipracticespring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tonight.apipracticespring.entity.UserAccount;
import org.tonight.apipracticespring.entity.UserReview;
import org.tonight.apipracticespring.entity.exampleUser;
import org.tonight.apipracticespring.repository.ExampleUserRepo;
import org.tonight.apipracticespring.repository.UserAccountRepo;
import org.tonight.apipracticespring.repository.UserProjectRepo;
import org.tonight.apipracticespring.repository.UserReviewRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserService {


    //@Autowired
    final ExampleUserRepo exampleUserRepo;
    final UserAccountRepo userAccountRepo;
    final UserReviewRepo userReviewRepo;
    final UserReviewService userReviewService;
    final UserAccountService userAccountService;
    final UserProjectRepo userProjectRepo;
    final UserProjectService userProjectService;
    final CompanyDetailsService companyDetailsService;

    public void addUser(exampleUser user) {

        userAccountRepo.save(user.getAccount());
        userReviewRepo.saveAll(user.getReviews());
        userProjectService.userProjectSaved(user);
        companyDetailsService.addCompanyDetails1(user);
        exampleUserRepo.save(user);
        //userProjectRepo.saveAll(user.getProjects());
    }

    public List<exampleUser> fetchUser() {
        return exampleUserRepo.findAll();
    }

    public Optional<exampleUser> getUserById(Integer id) {
        return exampleUserRepo.findById(id);
    }
    public Optional<exampleUser> updateUser(exampleUser user){
        Optional<exampleUser> updatedUser = Optional.empty();
        Optional<exampleUser> optionalUpdateUser = getUserById(user.getUserId());
        if(optionalUpdateUser.isPresent()){
            updatedUser = Optional.of(exampleUserRepo.save(user));
            return updatedUser;
        }
        return updatedUser;
    }
    public void deleteById(Integer id) {
        userAccountService.deleteUserAccounts(id);
        userReviewService.deleteById(id);
        exampleUserRepo.deleteById(id);

    }

    public List<exampleUser> findByNameAndEmail(String firstName, String email){

        return exampleUserRepo.findAllByFirstNameAndEmailContaining(firstName, email);
    }

    public List<exampleUser> lastNameAndEmail(String lastName, String email){

        return exampleUserRepo.lastNameAndEmail(lastName, email);
    }

    public List<Map<String,String>> firstAndLastName (String firstName, String lastName){
        return  exampleUserRepo.firstAndLastName(firstName, lastName);
    }

    public List<Map<Integer, String>> userReviewsById(Integer userId){

        return userReviewRepo.getUserReviews(userId);
    }

    public List<String> limitedUserDetails(Integer userId){

        return exampleUserRepo.limitedUserDetails(userId);
    }

}
