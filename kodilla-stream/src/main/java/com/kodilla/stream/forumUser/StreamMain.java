package com.kodilla.stream.forumUser;
import com.kodilla.stream.forumUser.Forum;
import java.util.Map;
import java.util.function.Function;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUserMap =forum.getForumUserList().stream()
                .filter((forumUser -> forumUser.getSex() =='M')
                .filter(forumUser -> forumUser.getBirthday().getYear() < 1990)
                .filter(forumUser -> forumUser.getPosts() >1)
                .collect(toMap(ForumUser ::getUserFB, Function.identity())));
        for (Map.Entry<Integer,ForumUser> entry : forumUserMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
