package com.pangtaek.practice.chap04.section02.level04;

import java.io.*;

public class Application01 {

    /*
     * 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서
     * 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
     * 
     * A를 3만큼 밀면 D가 되고, z를 1만큼 밀면 a가 됩니다.
     * 또한 공백문자는 변경되지 않습니다.
     * 
     * 문자열 1개를 입력 받고, 얼마나 문자를 밀지 알려주는 0보다 큰 정수를 1개 입력 받아
     * 암호문을 작성하는 프로그램을 만들어보세요
     * 단, 숫자가 27인 경우는 1칸을 밀게 됩니다. (알파벳은 26글자 이기 때문)
     * 
     * -- 입력 예시 --
     * 문자열을 입력하세요 : a B z
     * 숫자를 입력하세요 : 4
     * 
     * -- 출력 예시 --
     * e F d
     * 
     * -- 입력 예시 --
     * 문자열을 입력하세요 : a B z
     * 숫자를 입력하세요 : 27
     * 
     * -- 출력 예시 --
     * b C a
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("문자열을 입력하세요 : ");
        String str = br.readLine();
        StringBuilder result = new StringBuilder();

        System.out.print("숫자를 입력하세요 : ");
        int num = Integer.parseInt(br.readLine());

        // 숫자가 26을 초과할 경우 26으로 나눈 나머지를 사용
        num %= 26;

        br.close();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                char newChar = (char) (ch + num);
                if (newChar > 'z') {
                    newChar -= 26;
                }
                result.append(newChar);
            } else if ('A' <= ch && ch <= 'Z') {
                char newChar = (char) (ch + num);
                if (newChar > 'Z') {
                    newChar -= 26;
                }
                result.append(newChar);
            } else {
                result.append(ch);
            }
        }

        System.out.println(result.toString());
    }
}
