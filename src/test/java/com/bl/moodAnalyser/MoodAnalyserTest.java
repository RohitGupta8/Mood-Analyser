package com.bl.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.setMessage("I am in Sad Mood");
        String actualResult = MoodAnalyser.analyseMood();
        Assert.assertEquals("Sad", actualResult);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.setMessage("I am in happy Mood");
        String actualResult = MoodAnalyser.analyseMood();
        Assert.assertEquals("Happy", actualResult);
    }

    @Test
    public void givenMessage_Null_ShouldReturnMessage() throws MoodAnalysisException {
        MoodAnalyser moodanalyser = new MoodAnalyser();
        moodanalyser.setMessage(null);
        try {
            String actualResult = MoodAnalyser.analyseMood();
            Assert.assertEquals("Entered Invalid Mood ", actualResult);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }
}