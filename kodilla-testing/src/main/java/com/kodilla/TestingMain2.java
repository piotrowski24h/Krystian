package com.kodilla;

import com.kodilla.testing.user.SimpleUser;

public class TestingMain2 {

    public static void main (String[] agrs) {
        SimpleUser simpleUser = new SimpleUser("theForumUser", "theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test Ok");
        }else{
            System.out.println("Error!");
        }
    }
}
