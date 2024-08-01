package com.pangtaek.practice.chap04.section02.level03;

import java.io.*;

public class Application03 {

    /*
     * 문자열을 하나 입력 받고, 검색할 문자를 입력 하여
     * 입력받은 문자열에서 검색할 문자가 몇 개 포함되어 있는지를 출력하는 프로그램을 만드세요
     * 
     * 단, 문자열에 영문자가 아닌 문자가 섞여 있는 경우에는
     * 검색할 문자를 입력받지 않고 "영문자가 아닌 문자가 포함되어 있습니다." 출력 후 프로그램을 종료하세요
     * 
     * 또한 일치하는 문자의 경우 대소문자를 구분합니다.
     * 
     * -- 프로그램 예시 --
     * 
     * -- 정상 동작의 경우 --
     * -- 입력 예시 --
     * 문자열 입력 : apple
     * 문자 입력 : p
     * 
     * -- 출력 예시 --
     * 포함된 갯수 : 2개
     * 
     * --------------------
     * -- 영문자가 아닌 문자 포함된 경우 --
     * -- 입력 예시 --
     * 문자열 입력 : app2le
     * 
     * -- 출력 예시 --
     * 영문자가 아닌 문자가 포함되어 있습니다.
     */
    public static void main(String[] args) throws IOException {
        Application03 app = new Application03();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("문자열 입력 : ");
        String str = br.readLine();

        if (app.checkOnlyChar(str)) {
            System.out.print("문자 입력 : ");
            char ch = br.readLine().charAt(0);
            System.out.println("포함된 개수 : " + app.getCharCount(ch, str) + "개");

        } else {
            System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
        }

        br.close();
    }

    public boolean checkOnlyChar(String str) {
        String newStr = str.toLowerCase();
        for (int i = 0; i < newStr.length(); i++) {
            if (!(newStr.charAt(i) >= 'a' && newStr.charAt(i) <= 'z')) {
                return false;
            }
        }
        return true;
    }

    public int getCharCount(char ch, String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                count++;
        }

        return count;
    }
}
