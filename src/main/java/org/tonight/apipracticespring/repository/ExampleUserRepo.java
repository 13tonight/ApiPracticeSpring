package org.tonight.apipracticespring.repository;

import lombok.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.tonight.apipracticespring.entity.exampleUser;

import java.util.List;
import java.util.Map;

@Repository
public interface ExampleUserRepo extends JpaRepository<exampleUser, Integer> {

    List<exampleUser> findAllByFirstNameAndEmailContaining(String firstName, String email);

    exampleUser findByUserId(Integer userId);

    @Query("SELECT user FROM exampleUser user where user.lastName=?1 and user.email LIKE %?2%")
    List<exampleUser> lastNameAndEmail(String lastName, String email);

    @Query(value = "SELECT u.first_name, u.last_name FROM example_user u WHERE u.first_name = ?1 AND u.last_name = ?2", nativeQuery = true)
    List<Map<String, String>> firstAndLastName(String firstName, String lastName);

    @Query(value = "SELECT u.first_name, acc.account_id, acc.membership_type, acc.account_type FROM example_user u " +
            "inner join user_account acc on u.account_account_id = acc.account_id where user_id = ?1", nativeQuery = true)
    List<String> limitedUserDetails(Integer userId);

}
