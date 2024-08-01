package com.pangtaek.practice.chap04.section02.level01;

import java.io.*;
import java.io.IOException;

public class Application02 {
    public static void main(String[] args) throws IOException {
        /*
         * 정수 한 개를 입력 받고, 1부터 입력 받은 정수까지의 합을 계산해서 출력하세요
         * 
         * -- 입력 예시 --
         * 정수를 입력하세요 : 5
         * 
         * -- 출력 예시 --
         * 1부터 5까지의 합 : 15
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("정수를 입력하세요 : ");
        int num = Integer.parseInt(br.readLine());
        br.close();

        System.out.println("1부터 " + num + "까지의 합 : " + new Application02().getSum(num));
    }

    public int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
