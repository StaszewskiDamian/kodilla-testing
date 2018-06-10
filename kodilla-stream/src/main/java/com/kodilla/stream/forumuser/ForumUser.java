package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate dob;
    private final int postPublished;

    public ForumUser(final int userId, final String userName, final char sex, final LocalDate dob, final int postPublished) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.dob = dob;
        this.postPublished = postPublished;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDob() {
        return dob;
    }

    public int getPostPublished() {
        return postPublished;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dob=" + dob +
                ", postPublished=" + postPublished +
                '}';
    }
}
