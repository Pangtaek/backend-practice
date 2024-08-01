package com.pangtaek.practice.chap04.section01.level02;

import java.io.*;
import java.io.IOException;

public class Application02 {
    public static void main(String[] args) throws IOException {

        /*
         * BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
         * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
         * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
         * 비만(30이상)인 경우 "당신은 비만 입니다." 를 출력하세요
         * 
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
         * 
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         */
        new Application02().solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("몸무게를 입력하세요(단위: kg): ");
        double weight = Double.parseDouble(br.readLine());

        System.out.print("키를 입력하세요(단위: m): ");
        double height = Double.parseDouble(br.readLine());

        br.close();

        double bmi = getBmi(weight, height);

        if (bmi < 20) {
            System.out.println("당신은 저체중입니다.");
        } else if (bmi < 25) {
            System.out.println("당신은 정상체중입니다.");
        } else if (bmi < 30) {
            System.out.println("당신은 과체중입니다.");
        } else {
            System.out.println("당신은 비만입니다.");
        }

    }

    public double getBmi(double weight, double height) {
        double bmi = weight / (Math.pow(height, 2));
        return bmi;
    }
}
