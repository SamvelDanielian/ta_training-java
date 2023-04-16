package com.epam.training.student_Samvel_Danielyan.intersection;

public class Line {

    private final int k, b;

    public Line(int k, int b) {

        this.k = k;
        this.b = b;

    }

    public Point intersection(Line other) {
        int x,y;
        if(!(this.k == other.k)){
            x = (other.b - this.b)/(this.k - other.k);
            y= this.k * x + this.b;
        }
        else {
            x = 0;
            y = this.b;
        }
        Point pointOfIntersection = new Point(x, y);

        if(this == other || this.k == other.k){
            return null;
        }
        else {
            return pointOfIntersection;
        }
    }

}
