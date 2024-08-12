package com.pangtaek.practice.chap13.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Application04 {
    //    학생 ID 입력('exit' 입력 시 종료): hello
//    ID가 추가 되었습니다.
//    학생 ID 입력('exit' 입력 시 종료): java
//    ID가 추가 되었습니다.
//    학생 ID 입력('exit' 입력 시 종료): programmer
//    ID가 추가 되었습니다.
//    학생 ID 입력('exit' 입력 시 종료): java
//    이미 등록 된 ID입니다.
//    학생 ID 입력('exit' 입력 시 종료): exit
//    모든 학생의 ID : [java, programmer, hello]

    public static void main(String[] args) {
        Set<String> idSet = new HashSet<String>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
                String input = br.readLine();
                if (input.equals("exit")) {
                    System.out.println("모든 학생의 ID : " + idSet);
                    break;
                } else {
                    if (idSet.add(input)) {
                        System.out.println("ID가 추가되었습니다.");
                    } else {
                        System.out.println("이미 등록 된 ID입니다.");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
