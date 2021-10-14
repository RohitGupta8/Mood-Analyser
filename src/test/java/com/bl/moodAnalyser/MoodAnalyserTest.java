package com.bl.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    // Test case to analyze sad mood of the user
    @Test
    public void givenMessageWhenProperShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actualResult = MoodAnalyser.analyseMood("User is Sad");
        Assert.assertEquals("Sad", actualResult);
    }

    // Test case to analyze happy mood of the user
    @Test
    public void givenMessageContainsAnyInitShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        String actualResult = MoodAnalyser.analyseMood("I am in Any Mood");
        Assert.assertEquals("Happy", actualResult);
    }
}
