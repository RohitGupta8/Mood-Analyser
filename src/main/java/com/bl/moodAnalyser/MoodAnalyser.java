package com.bl.moodAnalyser;

/**
 * Purpose  - “I am in Sad Mood” message Should Return SAD
 *
 * @author - Rohit Gupta
 * @version - 17.0
 * @since - 2021-10-14
 */

public class MoodAnalyser {
    public static String analyseMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        }
        return "Happy";
    }
}

