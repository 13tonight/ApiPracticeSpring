package org.tonight.apipracticespring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tonight.apipracticespring.entity.CompanyDetails;
import org.tonight.apipracticespring.entity.exampleUser;
import org.tonight.apipracticespring.repository.CompanyDetailsRepo;

@Service
@RequiredArgsConstructor
public class CompanyDetailsService {


    final CompanyDetailsRepo companyDetailsRepo;

//    public void addCompanyDetails(exampleUser user) {
//        if(companyDetailsRepo.findByCompanyNameContainsIgnoreCase(user.getCompany().getCompanyName())){
//            user.getCompany().setCompanyId(user.getCompany().getCompanyId());
//            companyDetailsRepo.save(user.getCompany());
//        }
//        else {
//            companyDetailsRepo.save(user.getCompany());
//        }
//
//    }
    public void addCompanyDetails1(exampleUser user) {
        CompanyDetails existingCompany = companyDetailsRepo.findByCompanyNameContainsIgnoreCase(user.getCompany().getCompanyName());

        if (existingCompany != null) {
            user.getCompany().setCompanyId(existingCompany.getCompanyId());
            companyDetailsRepo.save(user.getCompany());
        } else {
            companyDetailsRepo.save(user.getCompany());
        }
    }

}
