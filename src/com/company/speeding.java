package com.company;

public class speeding {

    public static int caughtSpeeding (int speed, boolean isBirthday) {

        if(isBirthday){
            if(speed >= 0 && speed <= 65){
                return 0;
            }else if(speed > 65 && speed <= 85){
                return 1;
            }else if(speed >= 86){
                return 2;
            }else {return -1;}
        } else {
            if(speed >= 0 && speed <= 60){
                return 0;
            }else if(speed > 60 && speed <= 80){
                return 1;
            }else if(speed >= 81){
                return 2;
            }else {return -1;}
        }




    }


}
