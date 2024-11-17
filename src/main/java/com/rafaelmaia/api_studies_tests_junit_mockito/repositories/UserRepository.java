package com.rafaelmaia.api_studies_tests_junit_mockito.repositories;

import com.rafaelmaia.api_studies_tests_junit_mockito.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
