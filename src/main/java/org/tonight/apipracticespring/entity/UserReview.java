package org.tonight.apipracticespring.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserReview {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    private String review;
    private Integer noOfStars;

}
