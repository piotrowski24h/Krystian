package com.kodilla.testing.user;

import com.kodilla.testing.user.SimpleUser:

public class TestingMain {

    public static void main (String[] agrs) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test Ok");
        }else{
            System.out.println("Error!");
        }
    }
}
