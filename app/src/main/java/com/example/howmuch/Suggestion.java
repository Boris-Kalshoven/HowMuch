package com.example.howmuch;

public class Suggestion {

    private String mSuggestionText;

    public Suggestion(String mSuggestionText) {
        this.mSuggestionText = mSuggestionText;
    }

    public String getmSuggestionText() {
        return mSuggestionText;
    }

    public void setmSuggestionText(String mSuggestionText) {
        this.mSuggestionText = mSuggestionText;
    }

    @Override
    public String toString() {
        return mSuggestionText;
    }
}
