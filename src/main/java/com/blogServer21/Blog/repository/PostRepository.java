package com.blogServer21.Blog.repository;

import com.blogServer21.Blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post,Long> {
    Optional<Post> getPostByTitle(String title);
    Optional<Post> getPostById(Long id);

}
