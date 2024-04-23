package org.tonight.apipracticespring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.tonight.apipracticespring.entity.UserProjects;
import org.tonight.apipracticespring.entity.exampleUser;

import java.util.List;
import java.util.Map;

public interface UserProjectRepo extends JpaRepository<UserProjects, Long > {

    @Query(value = "SELECT exaUser.first_name, exaUser.email, up.project_name " +
            "FROM example_user exaUser " +
            "JOIN example_user_projects eup ON exaUser.user_id = eup.example_user_user_id " +
            "JOIN user_projects up ON eup.projects_project_id = up.project_id " +
            "WHERE eup.example_user_user_id = ?1", nativeQuery = true)
    List<String[]> firstNameProjectMap(Integer userId);
}
