package org.tonight.apipracticespring.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.tonight.apipracticespring.entity.UserAccount;
import org.tonight.apipracticespring.entity.exampleUser;

@Repository
public interface UserAccountRepo extends JpaRepository<UserAccount, Long> {


}
