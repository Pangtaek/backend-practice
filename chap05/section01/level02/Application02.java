package com.pangtaek.practice.chap05.section01.level02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application02 {
    /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
     * 성별 자리 이후부터 *로 가려서 출력하세요
     *
     * -- 입력 예시 --
     * 주민등록번호를 입력하세요 : 990101-1234567
     *
     * -- 출력 예시 --
     * 990101-1******
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("주민등록번호를 입력하세요 : ");
        String id = br.readLine();
        char[] chars = id.toCharArray();

        br.close();

        for(int i=7; i<id.length(); i++){
            chars[i] = '*';
        }

        id = String.valueOf(chars);

        System.out.println(id);
    }
}
