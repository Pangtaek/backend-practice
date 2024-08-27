package com.pangtaek.practice.chap04.section01.level04;

import java.io.*;
import java.io.IOException;

public class Application02 {
    public static void main(String[] args) throws IOException {
        /*
         * 영업사원의 월급을 계산하는 프로그램을 작성하려고 합니다.
         * 월 급여액과 월 매출액을 입력 받아 급여를 산정합니다.
         * 영업사원은 매출액 대비 보너스율에 명시된 보너스를 급여 외에 추가로 지급받습니다.
         * 
         * 단, 보너스율은 입력 받은 월 매출액에 비례하며,
         * 계산된 보너스 금액을 월 급여액에 더하여 총 급여를 계산한다.
         * 
         * 보너스율을 적용하여 출력 예시처럼 출력되도록 프로그램을 만들어보세요
         * 
         * -- 총 급여 계산식 --
         * 총 급여 = 월 급여 + (매출액 * 보너스율)
         * 
         * -- 매출액 대비 보너스율 --
         * 매출액 보너스율
         * 5천만원 이상 5%
         * 3천만원 이상 3%
         * 1천만원 이상 1%
         * 1천만원 미만 0%
         * 
         * -- 입력 예시 --
         * 월 급여 입력 : 3000000
         * 매출액 입력 : 20000000
         * 
         * -- 출력 예시 --
         * ======================
         * 매출액 : 20000000
         * 보너스율 : 1%
         * 월 급여 : 3000000
         * 보너스 금액 : 200000
         * ======================
         * 총 급여 : 3200000
         */

        new Application02().getTotalSalary();
    }

    public void getTotalSalary() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("월 급여 입력 : ");
        int salary = Integer.parseInt(br.readLine());

        System.out.print("매출액 입력 : ");
        int revenue = Integer.parseInt(br.readLine());

        System.out.println(
                "======================\n" +
                        "매출액 : " + revenue + "\n" +
                        "보너스율 : " + (int) (getBonusePercent(revenue) * 100) + "%\n" +
                        "월 급여 : " + salary + "\n" +
                        "보너스 금액 : " + (int) (revenue * getBonusePercent(revenue)) + "\n" +
                        "======================\n" +
                        "총 급여 : " + (int) (salary + revenue * getBonusePercent(revenue)));
    }

    public double getBonusePercent(int revenue) {
        /*
         * -- 매출액 대비 보너스율 --
         * 매출액 보너스율
         * 5천만원 이상 5%
         * 3천만원 이상 3%
         * 1천만원 이상 1%
         * 1천만원 미만 0%
         */

        if (revenue < 10000000)
            return 0;
        else if (revenue < 30000000)
            return 0.01;
        else if (revenue < 50000000)
            return 0.03;
        else
            return 0.05;
    }
}
