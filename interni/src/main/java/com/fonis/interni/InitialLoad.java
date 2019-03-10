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
        User user1 = new User("20160100","20160100","email1@gmail.com");
        User user2 = new User("Aleksa","Trampa","image","Android, Spring , Unity Game Dev", "member","20160100","20160100","alektramp@gmail.com");
        repositoryStorage.getUserRepository().save(user1);
        repositoryStorage.getUserRepository().save(user2);
        Post post1 = new Post("Tekst posta", "10/03/2019","Naslov","https//www.google.com");
        repositoryStorage.getPostRepository().save(post1);
    }

}
