package com.rafaelmaia.api_studies_tests_junit_mockito.services;

import com.rafaelmaia.api_studies_tests_junit_mockito.domain.User;

public interface UserService {

    User findById(Integer id);
}
