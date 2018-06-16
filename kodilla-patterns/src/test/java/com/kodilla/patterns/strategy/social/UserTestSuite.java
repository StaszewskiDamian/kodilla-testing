package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {

        //given
        User ula = new Millenials("Ula");
        User ala = new YGeneration("Ala");
        User ola = new ZGeneration("Ola");

        //when
        String ulaPreference = ula.sharePost();
        String alaPreference = ala.sharePost();
        String olaPreference = ola.sharePost();

        //then
        Assert.assertEquals("Twitter", ulaPreference);
        Assert.assertEquals("Snapchat", alaPreference);
        Assert.assertEquals("Facebook", olaPreference);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //given
        User ula = new Millenials("Ula");
        //when
        ula.setSocialPublisher(new FacebookPublisher());
        String ulaSetPreference = ula.sharePost();
        //then
        Assert.assertEquals("Facebook", ulaSetPreference);
    }
}
