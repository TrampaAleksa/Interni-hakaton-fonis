package com.fonis.interni;

import java.util.List;

public interface CustomUserInterface {

    List<User> findMembersByName(String name);
    List<User> findMembersBySurname(String surname);

}
