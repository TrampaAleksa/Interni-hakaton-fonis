package com.fonis.interni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class PostResource {
    private final
    RepositoryStorage repositoryStorage;

    public PostResource(RepositoryStorage repositoryStorage) {
        this.repositoryStorage = repositoryStorage;
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts(){


        return repositoryStorage.getPostRepository().findAll();
    }

    @GetMapping("/posts/title")
    public Post getPostByTitle(@RequestParam String title){

        return repositoryStorage.getPostRepository().findByTitle(title);
    }

}
