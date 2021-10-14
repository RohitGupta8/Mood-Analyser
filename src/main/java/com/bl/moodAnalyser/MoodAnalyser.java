package com.bl.moodAnalyser;

/**
 * Purpose  - “I am in Sad Mood” message Should Return SAD
 *
 * @author - Rohit Gupta
 * @version - 17.0
 * @since - 2021-10-14
 */

public class MoodAnalyser {
    public String message;

    // Constructor
    public MoodAnalyser(String message) {
        this.message = message;
        analyseMood();
    }

    //Getter
    public String getMessage() {
        return message;
    }

    //Setter
    public void setMessage(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        }
        return "Happy";
    }
}
