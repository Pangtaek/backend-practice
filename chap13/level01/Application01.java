package com.pangtaek.practice.chap13.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Application01 {

    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        char ifAdd;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("학생 성적 : ");
                list.add(Double.parseDouble(br.readLine()));

                System.out.print("추가 입력하려면 y : ");
                ifAdd = br.readLine().charAt(0);
                if (!(ifAdd == 'y' || ifAdd == 'Y')) {
                    double sum = 0;
                    for (Double aDouble : list) {
                        sum += aDouble;
                    }
                    System.out.println("학생 인원 : " + list.size());
                    System.out.println("평균 점수 : " + sum / list.size());
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
