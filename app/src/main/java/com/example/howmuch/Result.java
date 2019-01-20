package com.example.howmuch;

public class Result   {

    private double amountOfGrams;
    private double amountOfJoints;
    private int Photo = R.drawable.result_img;

    public Result() {
    }

    public Result(double amountOfGrams, double amountOfJoints, int photo) {
        this.amountOfGrams = amountOfGrams;
        this.amountOfJoints = amountOfJoints;
        Photo = photo;
    }

    public double getAmountOfGrams() {
        return amountOfGrams;
    }

    public void setAmountOfGrams(double amountOfGrams) {
        this.amountOfGrams = amountOfGrams;
    }

    public double getAmountOfJoints() {
        return amountOfJoints;
    }

    public void setAmountOfJoints(double amountOfJoints) {
        this.amountOfJoints = amountOfJoints;
    }

    public int getPhoto() {
        return Photo;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }

    @Override
    public String toString() {
        return "Result{" +
                "amountOfGrams=" + amountOfGrams +
                ", amountOfJoints=" + amountOfJoints +
                ", Photo=" + Photo +
                '}';
    }


}
