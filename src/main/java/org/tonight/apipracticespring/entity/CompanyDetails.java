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
public class CompanyDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long companyId;
    private String companyName;
    private String companyAddress;
    private String companyPhone;
}
