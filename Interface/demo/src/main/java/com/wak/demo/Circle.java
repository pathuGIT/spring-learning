package com.wak.demo;

public class Circle implements Shape{
    private Point circle;

    public Point getCircle() {
        return circle;
    }

    public void setCircle(Point circle) {
        this.circle = circle;
    }

    @Override
    public void draw() {
        System.out.println(circle.getX() + " + " + circle.getY());
    }
}
