package com.pangtaek.practice.chap04.section02.level04;

import java.io.*;
import java.io.IOException;

public class Application02 {

    /*
     * 받은 금액을 입력 받고, 상품 가격을 입력 받아 거스름돈을 계산하는 프로그램을 작성하세요
     * 
     * 단, 거스름돈은 대한민국 화폐 단위 별 필요 수량이 출력되도록 작성하고,
     * 지폐외 동전을 구분하여 단위를 표기하세요
     * 
     * -- 입력 예시 --
     * 받으신 금액을 입력하세요 : 100000
     * 상품 가격을 입력하세요 : 22340
     * 
     * -- 출력 예시 --
     * ============================
     * 50000원권 지폐 1장
     * 10000원권 지폐 2장
     * 5000원권 지폐 1장
     * 1000원권 지폐 2장
     * 500원권 동전 1개
     * 100원권 동전 1개
     * 50원권 동전 1개
     * 10원권 동전 1개
     * ============================
     * 거스름돈 : 77660원
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("받으신 금액을 입력하세요 : ");
        int money = Integer.parseInt(br.readLine());

        System.out.print("상품 가격을 입력하세요 : ");
        int price = Integer.parseInt(br.readLine());

        int num = money - price;

        int[] arr = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

        System.out.println("============================");

        for (int i = 0; i < arr.length; i++) {
            String status;
            if (arr[i] >= 1000)
                status = "지패";
            else
                status = "동전";

            System.out.println(arr[i] + "원권 " + status + (num / arr[i]) + "개");
            num %= arr[i];
        }

        System.out.println("============================");
        System.out.println("거스름돈" + (money - price));
    }
}
