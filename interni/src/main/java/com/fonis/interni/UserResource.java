package com.fonis.interni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class UserResource {

    private final
    RepositoryStorage repositoryStorage;

    @Autowired
    public UserResource(RepositoryStorage repositoryStorage) {
        this.repositoryStorage = repositoryStorage;
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return repositoryStorage.getUserRepository().findAll();
    }

    @GetMapping("/users/id")
    public ResponseEntity<?> getUserWithId(@RequestParam long id){
        Optional<User> user = repositoryStorage.getUserRepository().findById(id);

        return user.isPresent()? new ResponseEntity<>(user.get(), HttpStatus.OK)
                :new ResponseEntity<>("No user with that id found", HttpStatus.NOT_FOUND);
    }

    @PostMapping("/users")
    public ResponseEntity<?> createUser(@RequestBody User user) {
        if(user.getPassword() == null){
            return new ResponseEntity<>("No password", HttpStatus.PARTIAL_CONTENT);
        }
        User savedStudent = repositoryStorage.getUserRepository().save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedStudent.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping("/users/name")
    public List<User> getUserByName(@RequestParam String name){
        //TODO error handling if returning null
        return (repositoryStorage.getUserRepository().findMembersByName(name));
    }

    @GetMapping("/users/surname")
    public List<User> getUserBySurname(@RequestParam String surname){
        return repositoryStorage.getUserRepository().findMembersBySurname(surname);
    }



}
