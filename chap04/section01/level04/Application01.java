package com.pangtaek.practice.chap04.section01.level04;

import java.io.*;
import java.io.IOException;

public class Application01 {
    public static void main(String[] args) throws IOException {
        /*
         * 국어, 영어, 수학 점수를 입력받아
         * 평균 점수가 60점 이상이면서 각 과목이 40점 이상인 조건이 만족하면 "합격입니다!" 를 출력하세요,
         * 단, 합격이 아닌 경우 불합격 사유가 무엇인지를 모두 출력해주어야 합니다.
         * 평균점수 미달인 경우 "평균점수 미달로 불합격입니다." 라고 출력하고,
         * 과목당 과락 점수가 있는 경우 "xx 과목의 점수 미달로 불합격 입니다." 출력하세요
         * 
         * -- 입력 예시 --
         * 국어 점수를 입력하세요 : 60
         * 영어 점수를 입력하세요 : 30
         * 수학 점수를 입력하세요 : 20
         * 
         * -- 출력 예시 --
         * 평균 점수 미달로 불합격입니다.
         * 영어 점수 미달로 불합격입니다.
         * 수학 점수 미달로 불합격입니다.
         */

        new Application01().getResult();
    }

    public void getResult() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int koreanScore = 0;
        int englishScore = 0;
        int mathScore = 0;

        System.out.print("국어 점수를 입력하세요 : ");
        koreanScore = Integer.parseInt(br.readLine());

        System.out.print("영어 점수를 입력하세요 : ");
        englishScore = Integer.parseInt(br.readLine());

        System.out.print("수학 점수를 입력하세요 : ");
        mathScore = Integer.parseInt(br.readLine());

        double avg = getAverage(koreanScore, englishScore, mathScore);

        if (avg >= 60 && isOver40(koreanScore, englishScore, mathScore)) {
            System.out.println("합격입니다!!");
        }

        else if (avg < 60 && isOver40(koreanScore, englishScore, mathScore)) {
            System.out.println("평균점수 미달로 불합격입니다.");
        }

        else if (avg < 60 && !isOver40(koreanScore, englishScore, mathScore)) {
            System.out.println("평균점수 미달로 불합격입니다.");
            if (koreanScore < 40)
                System.out.println("국어 점수 미달로 불합격입니다.");

            if (englishScore < 40)
                System.out.println("영어 점수 미달로 불합격입니다.");

            if (mathScore < 40)
                System.out.println("수학 점수 미달로 불합격입니다.");
        }

    }

    public double getAverage(int score1, int score2, int score3) {
        return (score1 + score2 + score3) / 3;
    }

    public boolean isOver40(int score1, int score2, int score3) {
        if (score1 >= 40 && score2 >= 40 && score3 >= 40)
            return true;
        else
            return false;
    }
}
