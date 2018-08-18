package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForulm = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForulm.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForulm.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);
        //When
        javaHelpForulm.addPost("Hi everyone! Could you help me with for loop?");
        javaHelpForulm.addPost("Better try to use while loop in this case.");
        javaHelpForulm.addPost("Why whi8le? Is it better?");
        javaToolsForum.addPost("Help pls, my MySQL db doesnt't want to work :(");
        javaToolsForum.addPost("When I try to log in I got 'bad credentials' message.");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivoneEscobar.getUpdateCount());
        assertEquals(5, jessiePinkman.getUpdateCount());
    }
}