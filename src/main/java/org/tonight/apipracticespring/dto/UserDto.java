package org.tonight.apipracticespring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tonight.apipracticespring.entity.CompanyDetails;
import org.tonight.apipracticespring.entity.UserAccount;
import org.tonight.apipracticespring.entity.UserProjects;
import org.tonight.apipracticespring.entity.UserReview;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String designation;
    private UserAccount account;
    private List<UserReview> reviews;
    private List<UserProjects> projects;
    private CompanyDetails company;

}
