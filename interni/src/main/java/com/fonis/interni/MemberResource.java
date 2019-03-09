package com.fonis.interni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberResource {

    private final
    RepositoryStorage repositoryStorage;

    @Autowired
    public MemberResource(RepositoryStorage repositoryStorage) {
        this.repositoryStorage = repositoryStorage;
    }



}
