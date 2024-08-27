package com.pangtaek.practice.chap04.section02.level02;

public class Application02 {

    /*
     * 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요
     * 
     * -- 출력 예시 --
     * abcdefghijklmnopqrstuvwxyz
     */

    public static void main(String[] args) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch);
        }
    }

}
