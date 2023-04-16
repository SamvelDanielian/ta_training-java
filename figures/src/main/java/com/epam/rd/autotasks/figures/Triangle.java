package com.epam.rd.autotasks.figures;

public class Triangle extends Figure {
    double x1, y1, x2, y2, x3, y3;

    public Triangle(Point a, Point b, Point c){
        x1 = a.getX();
        x2 = b.getX();
        x3 = c.getX();
        y1 = a.getY();
        y2 = b.getY();
        y3 = c.getY();
    }

    double ab = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    double bc = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
    double ac = Math.sqrt((x3-x1)*(x3-x1) + (y3-y1)*(y3-y1));
    double semicircle = (ab+bc+ac)/2;

    @Override
    public double area() {
        double area = ((x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))/2);
        return Math.abs(area);
    }

    @Override
    public String pointsToString() {
        return "(" + x1 + "," + y1 + ")(" + x2 + "," + y2 + ")(" + x3 + "," + y3 + ")";
    }

    @Override
    public String toString() {
        return "Triangle[(" + x1 + "," + y1 + ")(" + x2 + "," + y2 + ")(" + x3 + "," + y3 + ")]";
    }

    @Override
    public Point leftmostPoint() {
        if(x1<x2 && x1<x3){
            return new Point(x1, y1);
        }
        else if(x2<x1 && x2<x3){
            return new Point(x2, y2);
        }
        else if(x3<x1 && x3<x2){
            return new Point(x3, y3);
        }
        else if(x1 == x2 & x1<x3) {
            return new Point(x1, y1);
        }
        else if(x2 == x3 && x2<x1){
            return new Point(x2, y2);
        }
        else if(x1 == x3 && x1<x2){
            return new Point(x1, y1);
        }
        else {
            return new Point(x1, y1);
        }
    }
}
