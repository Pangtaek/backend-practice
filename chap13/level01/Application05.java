package com.pangtaek.practice.chap13.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Application05 {
    //    단어 입력 ('exit' 입력 시 종료): 안녕
//    단어 입력 ('exit' 입력 시 종료): java
//    단어 입력 ('exit' 입력 시 종료): collection
//    단어 입력 ('exit' 입력 시 종료): 프로그래밍
//    단어 입력 ('exit' 입력 시 종료): exit
//    정렬 된 단어 : [collection, java, 안녕, 프로그래밍]
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while(true){
                System.out.print("단어 입력 ('exit' 입력 시 종료): ");
                String input = br.readLine();
                if (input.equals("exit")) {
                    if (!words.isEmpty()) {
                        System.out.println("정렬 된 단어 : " + words);
                    } else {
                        System.out.println("입력된 단어가 없습니다.");
                    }
                    break;
                } else {
                    words.add(input);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
