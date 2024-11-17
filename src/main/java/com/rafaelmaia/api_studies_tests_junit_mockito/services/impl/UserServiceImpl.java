package com.rafaelmaia.api_studies_tests_junit_mockito.services.impl;

import com.rafaelmaia.api_studies_tests_junit_mockito.domain.User;
import com.rafaelmaia.api_studies_tests_junit_mockito.domain.dto.UserDTO;
import com.rafaelmaia.api_studies_tests_junit_mockito.repositories.UserRepository;
import com.rafaelmaia.api_studies_tests_junit_mockito.services.UserService;
import com.rafaelmaia.api_studies_tests_junit_mockito.services.exceptions.DataIntegratyViolationException;
import com.rafaelmaia.api_studies_tests_junit_mockito.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("User not found!"));
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User create(UserDTO obj) {
        findByEmail(obj);
        return repository.save(mapper.map(obj, User.class));
    }

    private void findByEmail(UserDTO obj) {
        Optional<User> user = repository.findByEmail(obj.getEmail());

        if (user.isPresent()) {
            throw new DataIntegratyViolationException("Email already registered in the system");
        }
    }
}
