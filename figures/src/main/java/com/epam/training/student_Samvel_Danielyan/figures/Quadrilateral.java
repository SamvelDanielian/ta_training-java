package com.epam.training.student_Samvel_Danielyan.figures;

class Quadrilateral extends Figure{
    Point a, b, c, d;
    double x1, y1, x2, y2, x3, y3, x4, y4;

    public Quadrilateral(Point a, Point b, Point c, Point d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        x1 = a.getX();
        y1 = a.getY();
        x2 = b.getX();
        y2 = b.getY();
        x3 = c.getX();
        y3 = c.getY();
        x4 = d.getX();
        y4 = d.getY();
    }

    double ab = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))); //4
    double bc = Math.sqrt(((x3-x2)*(x3-x2))+((y3-y2)*(y3-y2))); //arm53
    double cd = Math.sqrt(((x4-x3)*(x4-x3))+((y4-y3)*(y4-y3))); //8
    double ad = Math.sqrt(((x1-x4)*(x1-x4))+((y1-y4)*(y1-y4))); //arm53
    double bd = Math.sqrt(((x4-x2)*(x4-x2))+((y4-y2)*(y4-y2))); //arm85
    double semicircle1 = (ab+bd+ad)/2; //
    double semicircle2 = (bc+cd+bd)/2; //

    @Override
    public double area() {
        double area1 = Math.abs(((x1*(y2-y4) + x2*(y4-y1) + x4*(y1-y2))/2));
        double area2 = Math.abs(((x4*(y2-y3) + x2*(y3-y4) + x3*(y4-y2))/2));
        double area = area1+area2;
        return area;
    }

    @Override
    public String pointsToString() {
        return "("+x1+","+y1+")("+x2+","+y2+")("+x3+","+y3+")("+x4+","+y4+")";
    }

    @Override
    public String toString() {
        return "Quadrilateral[("+x1+","+y1+")("+x2+","+y2+")("+x3+","+y3+")("+x4+","+y4+")]";
    }

    @Override
    public Point leftmostPoint() {
        if(x1<x2 && x1<x3 && x1<x4){
            return new Point(x1, y1);
        }
        else if(x2<x1 && x2<x3 && x2<x4){
            return new Point(x2, y2);
        }
        else if(x3<x1 && x3<x2 && x3<x4){
            return new Point(x3, y3);
        }
        else if(x4<x1 && x4<x2 && x4<x3){
            return new Point(x4, y4);
        }
        else if(x1 == x2 && x1<x3 && x1<x4){
            return new Point(x1, y1);
        }
        else if(x2 == x3 && x2<x1 && x2<x4){
            return new Point(x2, y2);
        }
        else if(x3 == x4 && x3<x1 && x3<x2){
            return new Point(x3, y3);
        }
        else if(x4 == x1 && x1<x2 && x1<x3){
            return new Point(x1, y1);
        }
        else if(x1 == x3 && x1<x2 && x1<x4){
            return new Point(x1, y1);
        }
        else if (x2 == x4 && x2<x1 && x2<x3){
            return new Point(x2, y2);
        }
        else {
            return new Point(x1, y1);
        }
    }
}
