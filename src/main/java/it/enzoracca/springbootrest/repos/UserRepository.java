package it.enzoracca.springbootrest.repos;

import it.enzoracca.springbootrest.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
