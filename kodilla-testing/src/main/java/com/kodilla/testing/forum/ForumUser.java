package com.kodilla.testing.forum;

import java.util.ArrayList;
import java.util.List;

public class ForumUser {

    private String user;
    private String realData;
    private List<Post> posts = new ArrayList<>();
    private List<Comment> comments = new ArrayList<>();


    public ForumUser(String user, String realData) {
        this.user = user;
        this.realData = realData;
    }

    public void add(Post post) {
        posts.add(post);
    }

    public void add(Comment comment) {
        comments.add(comment);
    }

}
