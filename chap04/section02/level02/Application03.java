package com.pangtaek.practice.chap04.section02.level02;

import java.io.*;
import java.io.IOException;

public class Application03 {
    /*
     * 정수를 입력받아 1부터 입력받은 정수까지
     * 홀수이면 "수", 짝수이면 "박"이 정수만큼 누적되어 출력되게 작성하시오.
     * 
     * -- 입력 예시 --
     * 정수를 입력하세요 : 5
     * 
     * -- 출력 예시 --
     * 수박수박수
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("정수를 입력하세요 : ");
        int num = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0)
                System.out.print("박");
            else
                System.out.print("수");
        }
    }
}
