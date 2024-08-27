package com.pangtaek.practice.chap04.section01.level01;

import java.io.*;
import java.io.IOException;

public class Application01 {
    public static void main(String[] args) throws IOException {
        /**
         * 정수를 하나 입력 받아 그 수가 양수이면 "양수다." 라고 출력하고,
         * 양수가 아닌 경우 "양수가 아니다." 라고 출력하세요
         * 
         * -- 입력 예시 --
         * 정수를 하나 입력하세요 : 5
         * 
         * -- 출력 예시 --
         * 양수다.
         * 
         */

        new Application01().solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("정수를 하나 입력하세요 : ");
        int num = Integer.parseInt(br.readLine());

        br.close();

        checkNumer(num);
    }

    public void checkNumer(int num) {
        if (num > 0) {
            System.out.println("양수다.");
        } else if (num < 0) {
            System.out.println("음수다.");
        } else {
            System.out.println("0이다.");
        }
    }
}
