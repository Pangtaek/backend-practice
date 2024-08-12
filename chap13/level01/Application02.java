package com.pangtaek.practice.chap13.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Application02 {
    //    방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.google.com/
    //    최근 방문 url : [https://www.google.com/]
    //    방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://github.com/
    //    최근 방문 url : [https://github.com/, https://www.google.com/]
    //    방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.notion.so/
    //    최근 방문 url : [https://www.notion.so/, https://github.com/, https://www.google.com/]
    //    방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.naver.com/
    //    최근 방문 url : [https://www.naver.com/, https://www.notion.so/, https://github.com/, https://www.google.com/]
    //    방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://github.com/
    //    최근 방문 url : [https://github.com/, https://www.naver.com/, https://www.notion.so/, https://github.com/, https://www.google.com/]
    //    방문 URL을 입력하세요 (단, exit를 입력하면 종료) : https://www.google.com/
    //    최근 방문 url : [https://www.google.com/, https://github.com/, https://www.naver.com/, https://www.notion.so/, https://github.com/]
    //    방문 URL을 입력하세요 (단, exit를 입력하면 종료) : exit
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
                String input = br.readLine(); // 한 번만 호출하여 입력을 받음

                if (!input.equals("exit")) { // 문자열 비교를 equals()로 수정
                    list.add(input); // 입력된 URL을 리스트에 추가
                    System.out.println("최근 방문 url : " + list);
                } else {
                    break; // "exit" 입력 시 루프 종료
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
