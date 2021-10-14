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
        } else if (message.toLowerCase().contains("happy")) {
            return "Happy";
        }
        return null;
    }

    public static void main(String[] args) {
        String mood = MoodAnalyser.analyseMood("User is Happy");
        System.out.println(mood);
        mood = MoodAnalyser.analyseMood("User is Sad");
        System.out.println(mood);
    }
}
