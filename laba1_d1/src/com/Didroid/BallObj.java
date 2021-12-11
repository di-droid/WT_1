package com.Didroid;

public class BallObj {

    private double weight;
    private String color;

    public BallObj (double weight,String color){
        this.weight = weight;
        this.color = color;
    }

    public double RecW(){
        return weight;
    }

    public String RecC(){
        return color;
    }
}
