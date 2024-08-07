package com.pangtaek.practice.chap08.level01;

import java.util.Arrays;

public class ShapeManager{
    private Shape[] shapes = new Shape[10];
    private int index;


    public void addShape(Shape shape) {
        /* 배열에 전달 된 Shape를 추가. 단, 배열의 크기가 부족할 경우 2배로 늘려서 추가. */
        shapes[index++] = shape;
    }

    public void removeShape(Shape shape) {
        /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i].equals(shape)) {
                shapes[i] = null;
            }
        }

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null) {
                for (int j = i; j < index; j++) {
                    shapes[j] = shapes[j + 1];
                }
            }
        }
    }

    public void printAllShapes() {
        /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i] == null) {
                break;
            }

            if (shapes[i] != null && shapes[i] instanceof Circle) {
                System.out.println("Shape: Circle");
            } else if (shapes[i] != null && shapes[i] instanceof Rectangle) {
                System.out.println("Shape: Rectangle");
            } else if (shapes[i] != null && shapes[i] instanceof Triangle) {
                System.out.println("Shape: Triangle");
            }
            System.out.println("Area: " + shapes[i].calculateArea());
            System.out.println("Perimeter: " + shapes[i].calculatePerimeter());
        }


    }

    public double getTotalArea() {
        /* 배열에 저장 된 모든 도형의 넓이를 더해서 반환 */
        double sumOfArea = 0.0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                sumOfArea += shapes[i].calculateArea();
            }
        }

        return sumOfArea;
    }

    public double getTotalPerimeter() {
        /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */
        double sumOfPerimeter = 0.0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                sumOfPerimeter += shapes[i].calculatePerimeter();
            }
        }

        return sumOfPerimeter;
    }
}
