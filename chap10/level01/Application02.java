package com.pangtaek.practice.chap10.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Application02 {
    /* ----- 입력 예시 -----
     *
     * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2014-05-05
     *
     * ----- 출력 예시 -----
     *
     * 만 20세 미만은 입장 불가입니다.
     *
     * ----- 입력 예시 -----
     *
     * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 1994-05-05
     *
     * ----- 출력 예시 -----
     *
     * 입장하셔도 됩니다.
     *
     * ----- 입력 예시 -----
     *
     * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2000-14-15
     *
     * ----- 출력 예시 -----
     *
     * 날짜 양식을 잘못 입력하셨습니다.
     */
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
            String strBirthday = br.readLine();

            // 입력 날짜가 올바른 형식인지 확인
            LocalDate birthday;
            try {
                birthday = LocalDate.parse(strBirthday, DateTimeFormatter.ISO_LOCAL_DATE);
            } catch (DateTimeParseException e) {
                System.out.println("날짜 양식을 잘못 입력하셨습니다.");
                return;
            }

            LocalDate now = LocalDate.now();
            LocalDate thresholdDate = now.minusYears(20);

            if (birthday.isAfter(thresholdDate)) {
                System.out.println("만 20세 미만은 입장 불가입니다.");
            } else {
                System.out.println("입장하셔도 됩니다.");
            }

        } catch (IOException e) {
            System.out.println("입력 오류: " + e.getMessage());
        }
    }
}
