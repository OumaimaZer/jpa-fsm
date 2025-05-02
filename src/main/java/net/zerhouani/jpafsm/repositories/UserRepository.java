package net.zerhouani.jpafsm.repositories;

import net.zerhouani.jpafsm.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}
