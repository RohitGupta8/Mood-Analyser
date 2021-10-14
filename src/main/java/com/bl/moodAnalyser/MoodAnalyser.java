package com.bl.moodAnalyser;

/**
 * Purpose  - “I am in Sad Mood” message Should Return SAD
 *
 * @author - Rohit Gupta
 * @version - 17.0
 * @since - 2021-10-14
 */

public class MoodAnalyser {
    private static String message;


    // Constructor
    public MoodAnalyser(String message) {
        MoodAnalyser.message = message;
        analyseMood();
    }

    //Getter
    public String getMessage() {
        return message;
    }

    //Setter
    public void setMessage(String message) {
        MoodAnalyser.message = message;
    }

    public static String analyseMood() {
        try {
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        } catch (NullPointerException e) {
            return "Exception Handled";
        }
    }
}