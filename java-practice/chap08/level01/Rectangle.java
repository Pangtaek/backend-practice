package com.pangtaek.practice.chap08.level01;

public class Rectangle extends Shape implements Resizable {

    private double weight;
    private double height;

    public Rectangle(double width, double height) {
        this.weight = width;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double calculateArea() {
        return this.getHeight() * this.getWeight();
    }

    @Override
    double calculatePerimeter() {
        return 2 * (this.getHeight() + this.getWeight());
    }

    @Override
    public void resize(double factor) {
        this.setHeight(this.getHeight() * factor);
        this.setWeight(this.getWeight() * factor);
    }
}
