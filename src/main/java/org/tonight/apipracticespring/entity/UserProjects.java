package org.tonight.apipracticespring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserProjects {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long projectId;
    private String projectName;
    private double totalHours;
    private double salary;

}
