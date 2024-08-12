package com.pangtaek.practice.chap13.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Application06 {
    //    이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 홍길동010-1234-5678
    //    입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>
    //    이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 홍길동 010-1234-5678
    //    추가 완료 : 홍길동 010-1234-5678
    //    이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 유관순 010-9876-5432
    //    추가 완료 : 유관순 010-9876-5432
    //    이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): search
    //    검색 할 이름 : 유관순
    //    유관순씨의 전화번호 : 010-9876-5432
    //    이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): search
    //    검색 할 이름 : 이순신
    //    이순신씨의 번호는 등록 되어 있지 않습니다.
    //    이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): exit

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
                String input = br.readLine();

                // 입력이 비어있는 경우 처리
                if (input == null || input.trim().isEmpty()) {
                    System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                    continue; // 다음 루프 반복
                }

                String[] token = input.split(" ");
                try {
                    if (token[0].equals("search")) {
                        System.out.print("검색 할 이름 : ");
                        String name = br.readLine();
                        if (map.containsKey(name)) {
                            System.out.println(name + "의 전화번호 : " + map.get(name));
                        } else {
                            System.out.println(name + "씨의 번호는 등록 되어 있지 않습니다.");
                        }
                    } else if (token[0].equals("exit")) {
                        break;
                    } else {
                        if (token.length < 2) {
                            throw new ArrayIndexOutOfBoundsException(); // 예외 발생
                        }
                        map.put(token[0], token[1]);
                        System.out.println("추가 완료 : " + token[0] + " " + token[1]);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
