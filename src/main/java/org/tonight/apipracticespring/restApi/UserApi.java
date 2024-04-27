package org.tonight.apipracticespring.restApi;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tonight.apipracticespring.dto.UserDto;
import org.tonight.apipracticespring.entity.UserProjects;
import org.tonight.apipracticespring.entity.exampleUser;
import org.tonight.apipracticespring.service.UserProjectService;
import org.tonight.apipracticespring.service.UserService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserApi {

    @Autowired
    UserService userService;
    @Autowired
    UserProjectService userProjectService;

    @PostMapping("/addUser")
    public void addUser(@RequestBody exampleUser user){
        userService.addUser(user);
        System.out.println("user as been added");
    }

    @GetMapping("/fetchData")
    public List<exampleUser> fetchData(){
        return userService.fetchUser();
    }

    @GetMapping("/byId")
    public UserDto getById(@RequestParam Integer id){
        return userService.getUserById(id);
    }

    @PutMapping("/updateUser")
    public Optional<exampleUser> updateUser(@RequestBody exampleUser user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/deleteUser")
    public void deleteById(@RequestParam Integer id){
        userService.deleteById(id);
    }

    @GetMapping("/nameAndEmail")
    public List<exampleUser> firstNameAndEmail(@RequestParam String firstName, String email){
        return userService.findByNameAndEmail(firstName, email);
    }

    @GetMapping("/lastNameAndEmail")
    public List<exampleUser> lastNameAndEmail(@RequestParam String lastName, String email){
        return userService.lastNameAndEmail(lastName, email);
    }

    @GetMapping("/lastFirst")
    public List<Map<String,String>> firstLastName(@RequestParam String firstName, String lastName){
        return userService.firstAndLastName(firstName, lastName);
    }

    @GetMapping("/userReviewById")
    public List<Map<Integer, String>> userById(@RequestParam Integer userId){
        return userService.userReviewsById(userId);
    }

    @GetMapping("/userLimited")
    public List<String> userLimitedDetailsById(@RequestParam Integer userId){
        return userService.limitedUserDetails(userId);
    }

    @GetMapping("/userProject")
    public List<String[]> userProjectById(@RequestParam Integer userId){
        return userProjectService.userDetails(userId);
    }
}
