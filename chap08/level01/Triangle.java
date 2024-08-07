package com.pangtaek.practice.chap08.level01;

public class Triangle extends Shape implements Resizable {

    private double base;    // 밑변
    private double height;  // 높이
    private double side1;   // 첫 번째 변
    private double side2;   // 두 번째 변
    private double side3;   // 세 번째 변

    public Triangle(double base, double height, double side1, double side2, double side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        return this.getBase() * this.getHeight() / 2;
    }

    @Override
    double calculatePerimeter() {
        return this.getSide1() + this.getSide2() + this.getSide3();
    }

    @Override
    public void resize(double factor) {
        this.setBase(this.getBase() * factor);
        this.setHeight(this.getHeight() * factor);
        this.setSide1(this.getSide1() * factor);
        this.setSide2(this.getSide2() * factor);
        this.setSide3(this.getSide3() * factor);
    }
}
