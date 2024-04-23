package org.tonight.apipracticespring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.tonight.apipracticespring.entity.UserReview;

import java.util.List;
import java.util.Map;

@Repository
public interface UserReviewRepo extends JpaRepository<UserReview, Integer> {

    @Query(value = "SELECT ure.no_of_stars, ure.review FROM user_review ure " +
            "JOIN example_user_reviews eur ON eur.reviews_user_id = ure.user_id " +
            "WHERE eur.example_user_user_id = ?1", nativeQuery = true)
    List<Map<Integer, String>> getUserReviews(Integer userId);

}
