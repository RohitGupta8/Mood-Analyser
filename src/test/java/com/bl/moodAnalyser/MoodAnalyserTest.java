package com.bl.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenProperShouldReturnSad() {
        MoodAnalyser moodanalyser = new MoodAnalyser("I am in Sad Mood");
        String actualResult = moodanalyser.analyseMood();
        Assert.assertEquals("Sad", actualResult);
    }
    @Test
    public void givenMessageWhenProperShouldReturnHappy() {
        MoodAnalyser moodanalyser = new MoodAnalyser("I am in happy Mood");
        String actualResult = moodanalyser.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }
}