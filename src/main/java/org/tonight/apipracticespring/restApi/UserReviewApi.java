package org.tonight.apipracticespring.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tonight.apipracticespring.entity.UserReview;
import org.tonight.apipracticespring.service.UserReviewService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/userReview")
public class UserReviewApi {

    @Autowired
    UserReviewService userReviewService;

    @PostMapping("/addReview")
    public void addReview(@RequestBody UserReview review){
        userReviewService.addUser(review);
    }

    @GetMapping("/allReview")
    public List<UserReview> allUserReview(){
        return userReviewService.fetchUserReview();
    }

    @GetMapping("/reviewById")
    public Optional<UserReview> userById(@RequestParam Integer id){
        return userReviewService.fetchUserById(id);
    }

    @PutMapping("/updateReview")
    public Optional<UserReview> updateUser(@RequestBody UserReview review){
        return userReviewService.updateUser(review);
    }

    @DeleteMapping("/deleteReview")
    public void deleteReview(@RequestParam Integer id){
        userReviewService.deleteById(id);
    }
}
