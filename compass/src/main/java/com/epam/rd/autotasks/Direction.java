package com.epam.rd.autotasks;

import java.util.Optional;

public enum Direction {
    N(0), NE(45), E(90), SE(135), S(180), SW(225), W(270), NW(315);

    Direction(final int degrees) {
        this.degrees = degrees;
    }

    private int degrees;

    public static Direction ofDegrees(int degrees) {
        Direction direction;
        while(degrees<0){
            degrees += 360;
        }
        if(degrees%360 == 0){
            direction = Direction.N;
        }
        else if(degrees%360 == 45){
            direction = Direction.NE;
        }
        else if(degrees%360 == 90){
            direction = Direction.E;
        }
        else if(degrees%360 == 135){
            direction = Direction.SE;
        }
        else if(degrees%360 == 180){
            direction = Direction.S;
        }
        else if(degrees%360 == 225){
            direction = Direction.SW;
        }
        else if(degrees%360 == 270){
            direction = Direction.W;
        }
        else if(degrees%360 == 315 || (degrees-360)%360 == 315){
            direction = Direction.NW;
        }
        else {
                return null;
        }
        return direction;
    }

    public static Direction closestToDegrees(int degrees) {
        Direction direction = null;
        int closestDegree;
        while(degrees<0){
            degrees += 360;
        }
        for(int k = 0; k<8; k++) {
            if ((degrees % 360) / 45 == k){
                if((k+1)*45-(degrees % 360) < (degrees%360)-k*45){
                    closestDegree = (k+1)*45;
                }
                else {
                    closestDegree = k*45;
                }
                switch (closestDegree){
                    case 0: direction = Direction.N;
                    break;
                    case 45: direction = Direction.NE;
                    break;
                    case 90: direction = Direction.E;
                    break;
                    case 135: direction = Direction.SE;
                    break;
                    case 180: direction = Direction.S;
                    break;
                    case 225: direction = Direction.SW;
                    break;
                    case 270: direction = Direction.W;
                    break;
                    case 315: direction = Direction.NW;
                    break;
                    default: return null;
                }
            }
        }
        return direction;
    }

    public Direction opposite() {
        Direction direction = null;
        switch (this.ordinal()){
            case 0: direction = Direction.S;
            break;
            case 1: direction = Direction.SW;
            break;
            case 2: direction = Direction.W;
            break;
            case 3: direction = Direction.NW;
                break;
            case 4: direction = Direction.N;
                break;
            case 5: direction = Direction.NE;
                break;
            case 6: direction = Direction.E;
                break;
            case 7: direction = Direction.SE;
                break;
        }
        return direction;
    }

    public int differenceDegreesTo(Direction direction) {
        int diff = 0;
        if(this.ordinal()>direction.ordinal()){
            diff = this.ordinal()*45 - direction.ordinal()*45;
            return diff;
        }
        else {
            diff = direction.ordinal()*45 - this.ordinal()*45;
        }
        if(diff>180){
            diff = 360-diff;
            return diff;
        }
        return diff;
    }
}
