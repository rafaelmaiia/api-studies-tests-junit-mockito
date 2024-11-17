package com.rafaelmaia.api_studies_tests_junit_mockito.services;

import com.rafaelmaia.api_studies_tests_junit_mockito.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
}
