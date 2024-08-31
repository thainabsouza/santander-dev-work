package me.dio.santander_dev_work.service;

import me.dio.santander_dev_work.domain.model.User;

public interface UserService {
    User findById(Long id);

    User createUser(User userToCreate);

}
