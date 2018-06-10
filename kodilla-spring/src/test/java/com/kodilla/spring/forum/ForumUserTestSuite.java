package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ForumUserTestSuite {

    @Test
    public void testGetUsername() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(ForumUser.class);
        //when
        ForumUser user = context.getBean(ForumUser.class);
        //then
        Assert.assertEquals("John Smith", user.getUser());
    }
}






