package org.tonight.apipracticespring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.tonight.apipracticespring.entity.UserAccount;
import org.tonight.apipracticespring.entity.exampleUser;
import org.tonight.apipracticespring.repository.ExampleUserRepo;
import org.tonight.apipracticespring.repository.UserAccountRepo;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserAccountService {

    final UserAccountRepo userAccountRepo;
    final ExampleUserRepo exampleUserRepo;

    public void deleteUserAccounts(Integer id) {
        Optional<exampleUser> optionalUser = exampleUserRepo.findById(id);
        if(optionalUser.isPresent()) {
            exampleUser exampluser = optionalUser.get();
            UserAccount userAccount = exampluser.getAccount();
            exampluser.setAccount(null);
            userAccountRepo.delete(userAccount);
             exampleUserRepo.save(exampluser);
        }
    }


}
