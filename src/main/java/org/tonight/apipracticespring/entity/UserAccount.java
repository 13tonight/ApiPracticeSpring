package org.tonight.apipracticespring.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountId;
    private String accountType;
    private Integer amount;
    private String membershipType;

    @Builder.Default
    private Instant updatedTime = Instant.now();

}
