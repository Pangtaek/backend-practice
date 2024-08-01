package com.pangtaek.practice.chap04.section01.level03;

import java.io.*;
import java.io.IOException;

public class Application01 {

    public static void main(String[] args) throws IOException {
        /*
         * 두 개의 정수를 입력 받아 변수에 저장하고,
         * 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요.
         * 단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램 종료
         * 
         * -- 입력 예시 --
         * 첫 번째 정수 : 4
         * 두 번째 정수 : 3
         * 연산 기호를 입력하세요 : +
         * 
         * -- 출력 예시 --
         * 4 + 3 = 7
         */
        new Application01().solution();
    }

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("첫 번째 정수 : ");
        int num1 = Integer.parseInt(br.readLine());

        System.out.print("두 번째 정수 : ");
        int num2 = Integer.parseInt(br.readLine());

        System.out.print("연산 기호를 입력하세요 : ");
        String operator = br.readLine();

        getCalcuator(num1, num2, operator);
    }

    public void getCalcuator(int num1, int num2, String op) {
        if (op.equals("+")) {
            System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 + num2));

        } else if (op.equals("-")) {
            System.out.println(num1 + " " + op + " " + num2 + " = " + (num1 - num2));

        } else if (op.equals("*")) {
            System.out.println(num1 + " " + op + " " + num2 + " = " + num1 * num2);

        } else if (op.equals("/")) {
            System.out.println(num1 + " " + op + " " + num2 + " = " + num1 / num2);

        } else if (op.equals("%")) {
            System.out.println(num1 + " " + op + " " + num2 + " = " + num1 % num2);

        } else {
            System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
        }
    }
}
