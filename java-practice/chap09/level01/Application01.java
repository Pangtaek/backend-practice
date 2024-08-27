package com.pangtaek.practice.chap09.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application01 {
    public static void main(String[] args) throws IOException {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("문자열 입력 : ");
        String input = br.readLine();
        br.close();

        String[] token = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < token.length; i++) {
            if (token[i] != null && !token[i].isEmpty()) {
                token[i] = token[i].substring(0, 1).toUpperCase() + token[i].substring(1);
            }
            sb.append(token[i]);
            if (i < token.length - 1) {
                sb.append(" ");
            }
        }

        System.out.println("변환된 문자열 : " + sb.toString());
        System.out.println("총 단어 개수 : " + token.length);
    }
}
