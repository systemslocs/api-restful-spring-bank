package me.dio.project.service;

import me.dio.project.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
