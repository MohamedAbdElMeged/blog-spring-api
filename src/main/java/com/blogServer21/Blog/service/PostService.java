package com.blogServer21.Blog.service;

import com.blogServer21.Blog.entity.Post;
import com.blogServer21.Blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService implements IPostService {
    @Autowired
    private PostRepository postRepository;


    @Override
    public Post createPost(Post post) {
        post.setLikeCount(0);
        post.setLikeCount(0);
        return postRepository.save(post);
    }

    @Override
    public List<Post> GetAll() {
        return postRepository.findAll();
    }

    @Override
    public Post GetPostByID(Long id) {

        Optional<Post> optionalPost =  postRepository.getPostById(id);
        if (optionalPost.isPresent()){
            Post post = optionalPost.get();
            post.setViewCount(post.getViewCount() + 1);
            return postRepository.save(post);
        }else{
            return null;
        }
    }

}
