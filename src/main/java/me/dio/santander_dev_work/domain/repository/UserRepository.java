package me.dio.santander_dev_work.domain.repository;

import me.dio.santander_dev_work.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByAccountNumber(String username);
}
