package com.skorobagatiy.knowledgebackend.repository;

import com.skorobagatiy.knowledgebackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    // all CRUD database methods
}
