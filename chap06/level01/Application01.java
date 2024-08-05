package com.pangtaek.practice.chap06.level01;

import com.pangtaek.practice.chap06.level01.dto.StudentDTO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StudentDTO[] students = new StudentDTO[10];
        char ch = 'y';
        int cnt = 0;

        do{
            System.out.print("학년 : ");
            int grade = Integer.parseInt(br.readLine());
            System.out.print("반 : ");
            int classroom = Integer.parseInt(br.readLine());
            System.out.print("이름 : ");
            String name = br.readLine();
            System.out.print("국어점수 : ");
            int kor = Integer.parseInt(br.readLine());
            System.out.print("영어점수 : ");
            int eng = Integer.parseInt(br.readLine());
            System.out.print("수학점수 : ");
            int math = Integer.parseInt(br.readLine());

            students[cnt] = new StudentDTO(grade, classroom, name, kor, eng, math);
            cnt++;

            System.out.print("계속 추가할 겁니까 ? (y/n) : ");
            ch = br.readLine().charAt(0);

        } while(ch!='n' && ch!='N');

        for (int i = 0; i < cnt; i++) {
            System.out.println(students[i].getInformation());
        }
    }
}
