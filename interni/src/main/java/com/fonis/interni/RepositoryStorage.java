package com.fonis.interni;

import org.springframework.stereotype.Component;

@Component
public class RepositoryStorage {


    private UserRepository userRepository;
    private PostRepository postRepository;

    public RepositoryStorage(UserRepository userRepository, PostRepository postRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public PostRepository getPostRepository() {
        return postRepository;
    }
}
