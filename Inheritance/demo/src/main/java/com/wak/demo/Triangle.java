package com.wak.demo;

import java.util.List;

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void draw(){
        for(Point point : points){
            System.out.println(point.getX() + ":" + point.getY());
        }
    }
}
