package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(0,"John Brawo", 'M', LocalDate.of(1998,1,5),1));
        forumUserList.add(new ForumUser(1,"Myszka Micki",'M',LocalDate.of(1925,2,2),101));
        forumUserList.add(new ForumUser(2,"Czerwony Kapturek",'F',LocalDate.of(1967,1,1),1001));
    }
    public List<ForumUser> getForumUserList() {
        return new ArrayList<ForumUser>(forumUserList);
    }
}
