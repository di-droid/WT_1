package com.Didroid;

public class BasketObj {
    private double sumWeight = 0;
    private int colorBlueNum;

    public double GetWeight(BallObj[] balls){
        int i;
        for (i=0;i < balls.length;i++){
            sumWeight += balls[i].RecW();
        }
        return sumWeight;
    }

    public int GetColor(BallObj[] balls) {
        int i;
        for (i=0;i < balls.length;i++){
            if (balls[i].RecC().equals("blue")){
                colorBlueNum++;
            }
        }

        return colorBlueNum;
    }

}
