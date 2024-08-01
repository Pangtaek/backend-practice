package com.pangtaek.practice.chap04.section01.level01;

import java.io.*;
import java.io.IOException;

public class Application02 {

    public static void main(String[] args) throws IOException {

        /*
         * 정수를 입력 받아 그 수가 짝수인지 홀수인지 판단해서 결과를 출력하세요
         * 짝수인 경우 "짝수다." 출력, 홀수인 경우 "홀수다." 출력
         * 
         * -- 입력 예시 --
         * 정수를 하나 입력하세요 : 5
         * 
         * -- 출력 예시 --
         * 홀수다.
         */

        new Application02().solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("정수를 하나 입력하세요 : ");
        int num = Integer.parseInt(br.readLine());

        br.close();

        checkNumber(num);
    }

    public void checkNumber(int num) {
        if (num % 2 == 0) {
            System.out.println("짝수다.");
        } else {
            System.out.println("홀수다.");
        }
    }
}
