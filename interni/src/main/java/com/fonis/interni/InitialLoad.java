package com.fonis.interni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InitialLoad implements CommandLineRunner {


    private final RepositoryStorage repositoryStorage;

    @Autowired
    public InitialLoad(RepositoryStorage repositoryStorage) {
        this.repositoryStorage = repositoryStorage;
    }

    @Override
    public void run(String... args) throws Exception {
        Member member1 = new Member("20160100","20160100","email1@gmail.com");
        repositoryStorage.getMemberRepository().save(member1);
    }

}
