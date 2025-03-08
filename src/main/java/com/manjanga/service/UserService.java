package com.manjanga.service;

import com.manjanga.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
