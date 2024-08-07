package com.pangtaek.practice.chap08.level01;

public class Circle extends Shape implements Resizable {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * 2 * this.getRadius();
    }

    @Override
    public void resize(double factor) {
        this.setRadius(this.getRadius() * factor);
    }
}
