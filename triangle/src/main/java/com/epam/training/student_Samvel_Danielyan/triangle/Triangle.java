package com.epam.training.student_Samvel_Danielyan.triangle;

class Triangle {

    Point a;
    Point b;
    Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;

        double ab, bc, ac;
        ab = Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX()) + (a.getY()-b.getY())*(a.getY()-b.getY()));
        bc = Math.sqrt((c.getX()-b.getX())*(c.getX()-b.getX()) + (c.getY()-b.getY())*(c.getY()-b.getY()));
        ac = Math.sqrt((a.getX()-c.getX())*(a.getX()-c.getX()) + (a.getY()-c.getY())*(a.getY()-c.getY()));

        if((a.getX() == b.getX() && a.getX() == c.getX()) || (a.getY() == b.getY() && a.getY() == c.getY())){
            throw new IllegalArgumentException();
        }

        if(!(ab+bc>ac) || !(ab+ac>bc) || !(ac+bc>ab)){
            throw new IllegalArgumentException();
        }
    }

    public double area() {
        double ab, bc, ac;
        ab = Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX()) + (a.getY()-b.getY())*(a.getY()-b.getY()));
        bc = Math.sqrt((c.getX()-b.getX())*(c.getX()-b.getX()) + (c.getY()-b.getY())*(c.getY()-b.getY()));
        ac = Math.sqrt((a.getX()-c.getX())*(a.getX()-c.getX()) + (a.getY()-c.getY())*(a.getY()-c.getY()));
        double semicircle = (ab+bc+ac)/2;
        double area = Math.sqrt(semicircle*(semicircle-ab)*(semicircle-bc)*(semicircle-ac));
        return area;
    }

    public Point centroid(){
        double centroidX = (this.a.getX() + this.b.getX() + this.c.getX())/3;
        double centroidY = (this.a.getY() + this.b.getY() + this.c.getY())/3;
        Point centroid = new Point(centroidX,centroidY);
        return centroid;
    }

}
