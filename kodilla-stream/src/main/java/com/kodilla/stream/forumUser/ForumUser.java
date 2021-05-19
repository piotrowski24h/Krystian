package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public class ForumUser {
    private final int userFB;
    private final String userName;
    private final char sex;
    private final LocalDate brirthday;
    private final int posts;

    public ForumUser(final int userFB,final String userName, final char sex,final LocalDate brirthday, final int posts) {
       this.userFB = userFB;
       this.userName = userName;
       this.sex = sex;

        this.brirthday = brirthday;
       this.posts = posts;
    }

    public int getUserFB() {
    return userFB;
}

    public String getUserName() {
    return userName;
    }

    public char getSex() {
    return sex;
    }

    public LocalDate getBrirthday() {
    return brirthday;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                ", userFB="+ userFB+
                ",user Name" + userName +
                ", posts=" + posts +
                '}';
    }
}