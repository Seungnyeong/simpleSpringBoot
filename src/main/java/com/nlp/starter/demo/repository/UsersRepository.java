package com.nlp.starter.demo.repository;

import com.nlp.starter.demo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
        public List<Users> findByName(String name);
        public List<Users> findByTel(String tel);
        public List<Users> findByNameLike(String keyword);
}
