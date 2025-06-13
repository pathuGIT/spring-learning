package com.wak.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;

public class Triangle implements InitializingBean, DisposableBean {
    private Point pointA;
    private Point pointB;
    private Point pointC;

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
        System.out.println(getPointA().getX() + ":" + getPointA().getY());
        System.out.println(getPointB().getX() + ":" + getPointB().getY());
        System.out.println(getPointC().getX() + ":" + getPointC().getY());
    }

    public void myInit(){
        System.out.println("Init callled");
    }
    public void cleanUp(){
        System.out.println("CleanUp called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy callled");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet callled");
    }
}
