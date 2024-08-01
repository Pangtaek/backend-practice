package com.pangtaek.practice.chap04.section01.level02;

import java.io.*;
import java.io.IOException;

public class Application01 {
    public static void main(String[] args) throws IOException {
        /*
         * 1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,
         * 홀수이면 "홀수다.", 홀수가 아니면 "짝수다." 라고 출력하세요.
         * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 를 출력하세요.
         */

        new Application01().solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        br.close();

        if (!(1 <= num && num <= 10)) {
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        } else {
            if (isOdd(num)) {
                System.out.println("홀수다.");
            } else {
                System.out.println("짝수다.");
            }
        }
    }

    public boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
