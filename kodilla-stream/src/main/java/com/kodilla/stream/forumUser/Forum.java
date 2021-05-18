package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(0,"John Brawo", 'M', 1997,1));
        forumUserList.add(new ForumUser(1,"Myszka Micki",'M',1928,101)):
        forumUserList.add(new ForumUser(2,"Czerwony Kapturek",'F',1697,1001));
    }
    public List<ForumUser> getForumUserList() {
        return new ArrayList<ForumUser>(forumUserList);
    }
}
