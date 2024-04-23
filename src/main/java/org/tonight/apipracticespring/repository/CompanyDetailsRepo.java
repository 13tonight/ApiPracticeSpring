package org.tonight.apipracticespring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tonight.apipracticespring.entity.CompanyDetails;

public interface CompanyDetailsRepo extends JpaRepository<CompanyDetails, Long> {

    CompanyDetails findByCompanyNameContainsIgnoreCase(String companyName);
}
