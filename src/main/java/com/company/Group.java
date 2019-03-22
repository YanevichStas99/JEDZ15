package com.company;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<User> users=new ArrayList<User>();
    private String name;

    public Group(String name) {
        this.name = name;
    }

    public Group() {
    }

    public void addUser(User user){
        users.add(user);
    }
}
