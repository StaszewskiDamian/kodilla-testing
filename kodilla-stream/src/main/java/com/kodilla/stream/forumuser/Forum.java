package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {

        theForumUserList.add(new ForumUser(3, "user3", 'm', LocalDate.of(1998, 10, 10), 6));
        theForumUserList.add(new ForumUser(6, "user6", 'f', LocalDate.of(2001, 11, 2), 3));
        theForumUserList.add(new ForumUser(9, "user9", 'f', LocalDate.of(1991, 1, 20), 9));
        theForumUserList.add(new ForumUser(18, "user18", 'm', LocalDate.of(1981, 8, 18), 19));
        theForumUserList.add(new ForumUser(23, "user23", 'f', LocalDate.of(1956, 1, 12), 12));
        theForumUserList.add(new ForumUser(666, "user666", 'm', LocalDate.of(1966, 6, 6), 666));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }

}
