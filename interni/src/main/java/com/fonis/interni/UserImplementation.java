package com.fonis.interni;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class UserImplementation implements CustomUserInterface {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> findMembersByName(String name) {
        TypedQuery<User> query = entityManager.createQuery(
                "SELECT u FROM User u WHERE u.name = :name", User.class);
        return query.setParameter("name", name).getResultList();
    }

    @Override
    public List<User> findMembersBySurname(String surname) {
        TypedQuery<User> query = entityManager.createQuery(
                "SELECT u FROM User u WHERE u.surname = :surname", User.class);
        return query.setParameter("surname", surname).getResultList();
    }
}
