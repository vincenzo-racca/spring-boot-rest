package com.vincenzoracca.springbootrest.repos;

import com.vincenzoracca.springbootrest.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
