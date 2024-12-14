package com.blogServer21.Blog.service;

import com.blogServer21.Blog.entity.Post;

import java.util.List;
import java.util.Optional;

public interface IPostService {
    public Post createPost(Post post);
    public List<Post> GetAll();;
    public Post GetPostByID(Long id);
}
