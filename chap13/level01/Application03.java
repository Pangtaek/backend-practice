package com.pangtaek.practice.chap13.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Application03 {
    //    대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): 유관순
//    유관순 고객님 대기 등록 되었습니다.
//    대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): 홍길동
//    홍길동 고객님 대기 등록 되었습니다.
//    대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
//    유관순 고객님 차례입니다.
//    대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): 신사임당
//    신사임당 고객님 대기 등록 되었습니다.
//    대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
//    홍길동 고객님 차례입니다.
//    대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
//    신사임당 고객님 차례입니다.
//    대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
//    대기 고객이 없습니다.
//    대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): exit
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        int index = 0;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            while(true){
                System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
                String input = br.readLine();
                if(input.equals("exit")){
                    break;
                } else if(input.equals("next")){
                    try{
                        System.out.println(list.get(index++) + " 고객님 차례입니다.");
                    } catch(IndexOutOfBoundsException e){
                        System.out.println("대기 고객이 없습니다.");
                    }
                } else{
                    list.add(input);
                    System.out.println(input + " 고객님 대기 등록 되었습니다.");
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
