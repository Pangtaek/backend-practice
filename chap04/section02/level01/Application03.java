package com.pangtaek.practice.chap04.section02.level01;

import java.io.*;
import java.io.IOException;

public class Application03 {
    public static void main(String[] args) throws IOException {
        /*
         * 1부터 입력받은 정수까지의 짝수의 합을 구하세요
         * 
         * -- 입력 예시 --
         * 정수를 입력하세요 : 10
         * 
         * -- 출력 예시 --
         * 1부터 10까지 짝수의 합 : 30
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("정수를 입력하세요 : ");
        int num = Integer.parseInt(br.readLine());
        br.close();

        System.out.println("1부터 " + num + "까지 짝수의 합 : " + new Application03().getEvenSum(num));
    }

    public int getEvenSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (!(i % 2 == 0))
                continue;
            sum += i;
        }

        return sum;
    }
}
