package com.brandaostartup.webservicesSB.repositories;

import com.brandaostartup.webservicesSB.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
