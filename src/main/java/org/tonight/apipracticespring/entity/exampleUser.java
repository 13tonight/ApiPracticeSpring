package org.tonight.apipracticespring.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.action.internal.OrphanRemovalAction;

import java.time.Instant;
import java.util.List;

@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class exampleUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String designation;

    @OneToOne
    private UserAccount account;

    @OneToMany(orphanRemoval = true)
    private List<UserReview> reviews;

    @ManyToMany
    private List<UserProjects> projects;

    @ManyToOne
    private CompanyDetails company;


    @Builder.Default
    private Instant timeNow = Instant.now();


}
