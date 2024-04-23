package org.tonight.apipracticespring.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tonight.apipracticespring.entity.UserReview;
import org.tonight.apipracticespring.entity.exampleUser;
import org.tonight.apipracticespring.repository.ExampleUserRepo;
import org.tonight.apipracticespring.repository.UserReviewRepo;
import org.tonight.apipracticespring.restApi.UserReviewApi;

import java.util.List;
import java.util.Optional;

@Service
public class UserReviewService {

    @Autowired
    UserReviewRepo userReviewRepo;
    @Autowired
    ExampleUserRepo exampleUserRepo;

    public UserReview addUser(UserReview review) {
        return userReviewRepo.save(review);
    }

    public List<UserReview> fetchUserReview(){
        return userReviewRepo.findAll();
    }

    public Optional<UserReview>  fetchUserById(Integer id){
        return userReviewRepo.findById(id);
    }
    public Optional<UserReview> updateUser(UserReview review){
        Optional<UserReview> updateReview = Optional.empty();
        Optional<UserReview> updateUserReview = fetchUserById(review.getUserId());
        if(updateUserReview.isPresent()){
            updateReview = Optional.ofNullable(addUser(review));
            return updateReview;
        }
        return updateReview;
    }
    public void deleteById(Integer id){
        Optional<exampleUser> optionalUser = exampleUserRepo.findById(id);
        if(optionalUser.isPresent()){
            exampleUser exaUser = optionalUser.get();
            List<UserReview> reviews = exaUser.getReviews();
            exaUser.setReviews(null);
            userReviewRepo.deleteAll(reviews);
            exampleUserRepo.save(exaUser);
        }
    }


}
