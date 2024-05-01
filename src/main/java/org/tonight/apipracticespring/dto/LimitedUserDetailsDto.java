package org.tonight.apipracticespring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tonight.apipracticespring.entity.CompanyDetails;
import org.tonight.apipracticespring.entity.UserAccount;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LimitedUserDetailsDto {

     private Integer userId;
    private String firstName;
    private String designation;
    private String membership;
    private String companyName;

}
