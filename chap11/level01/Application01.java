package com.pangtaek.practice.chap11.level01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Application01 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * (존재하는 파일명을 입력한 경우)
         * 파일 이름을 입력하세요 : hello.txt
         *
         * ----- 출력 예시 -----
         *
         * ===== 파일 내용 출력 =====
         * 안녕하세요. 반갑습니다. 제 이름은 홍길동입니다.
         *
         * ----- 입력 예시 -----
         *
         * (존재하지 않는 파일명을 입력한 경우)
         * 파일 이름을 입력하세요 : unknown.txt
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 해당 이름을 가진 파일이 없습니다.
         *
         */

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName = br.readLine();

            try (FileReader fr = new FileReader(fileName)) {
                int ch;
                System.out.println("===== 파일 내용 출력 =====");
                while ((ch = fr.read()) != -1) {
                    System.out.print((char) ch);
                }

            } catch (Exception e) {
                System.out.println("오류 : 해당 이름을 가진 파일이 없습니다.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
