package com.example.demo.repository;

import com.example.demo.entity.Post;
import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    //SELECT * FROM POST as p WHERE User='user' SORT DESC
    Optional<Post> findAllByUserOrderByCreatedDateDesc(User user);

    Optional<Post> findByOrderByCreatedDateDesc();

    Optional<Post> findPostByIdAndUser(Long id, User user);
}
