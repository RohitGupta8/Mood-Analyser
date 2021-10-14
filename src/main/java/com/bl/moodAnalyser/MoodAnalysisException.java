package com.bl.moodAnalyser;

public class MoodAnalysisException extends Exception {
    public String message;

    public MoodAnalysisException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
