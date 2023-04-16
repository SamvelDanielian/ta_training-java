package com.epam.training.student_Samvel_Danielyan.segments;

import static java.lang.Math.abs;

class Segment {

    Point start, end;

    public Segment(Point start, Point end) {
        this.start = start;
        this.end = end;
        if(start.getX() == end.getX() && start.getY() == end.getY()){
            throw new IllegalArgumentException();
        }
    }

    double length() {
        double length = Math.sqrt((end.getX()-start.getX())*((end.getX()-start.getX())) + (end.getY()-start.getY())*(end.getY()-start.getY()));
        return length;
    }

    Point middle() {
        Point middle = new Point((end.getX() + start.getX())/2, (end.getY() + start.getY())/2);
        return middle;
    }

    Point intersection(Segment another) {
        double k1, k2, b1, b2;
        double x1 = this.end.getX();
        double x2 = this.start.getX();
        double x3 = another.end.getX();
        double x4 = another.start.getX();
        double y1 = this.end.getY();
        double y2 = this.start.getY();
        double y3 = another.end.getY();
        double y4 = another.start.getY();

        if((x1 == x2 && y1 == y2) || (x3 == x4 && y3 == y4)){
            return null;
        }

        double dx1 = x1 - x2;
        double dy1 = y1 - y2;
        double dx2 = x3 - x4;
        double dy2 = y3 - y4;
        double dxx = x2 - x4;
        double dyy = y2 - y4;
        double div, t, s;

        div = dy2*dx1-dx2*dy1;
        if (Math.abs(div) < 1.0e-10) {
            return null;
        }

        t = (dx1*dyy-dy1*dxx) / div;
        if (t < 0 || t > 1.0) {
            return null;
        }

        s = (dx2*dyy-dy2*dxx) / div;
        if (s < 0 || s > 1.0) {
            return null;
        }

        double pointXOfIntersection = x2 + s * dx1;
        double pointYOfIntersection = y2 + s * dy1;

        Point pointOfIntersection = new Point(pointXOfIntersection, pointYOfIntersection);
        return pointOfIntersection;
    }

}
