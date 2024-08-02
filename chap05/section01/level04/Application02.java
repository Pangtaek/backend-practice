package com.pangtaek.practice.chap05.section01.level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Application02 {
    /* 숫자 야구게임 만들기
     * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
     * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
     * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
     * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
     *
     * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
     * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
     *
     * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
     * 횟수는 차감하지 않는다.
     *
     * -- 프로그램 예시 (난수 7416 의 경우) --
     *
     * 10회 남으셨습니다.
     * 4자리 숫자를 입력하세요 : 1234
     * 아쉽네요 0S 2B 입니다.
     * 9회 남으셨습니다.
     * 4자리 숫자를 입력하세요 : 5678
     * 아쉽네요 0S 2B 입니다.
     * 8회 남으셨습니다.
     * 4자리 숫자를 입력하세요 : 7416
     * 정답입니다.
     * */

    public static void main(String[] args) throws IOException {

        Application02 app = new Application02();

        int[] baseballGame = new int[4];
        baseballGame = app.init(baseballGame);

//        System.out.println(Arrays.toString(baseballGame));

        app.gamsStart(baseballGame);

    }

    public int[] init(int[] arr) {
        int[] baseballGame = arr;
        Random rand = new Random();

        for (int i = 0; i < baseballGame.length; i++) {
            baseballGame[i] = rand.nextInt(10);
            for (int j = 0; j < i; j++) {
                if (baseballGame[i] == baseballGame[j]) {
                    i--;
                }
            }
        }

        return baseballGame;
    }

    public void gamsStart(int[] baseballGame) throws IOException {
        int count = 0;
        boolean isGameOver = false;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (count <= 10 && !isGameOver) {
            System.out.println((10 - count) + "번 남으셨습니다.");
            System.out.print("4자리 숫자를 입력하세요 : ");
            int input = Integer.parseInt(br.readLine());
            count++;

            int[] arr = new int[4];
            int idx = 3;
            while (input > 0) {
                arr[idx--] = input % 10;
                input /= 10;
            }

            isGameOver = checkNumber(baseballGame, arr);
        }
    }

    public boolean checkNumber(int[] baseballGame, int[] arr) {
        int s = 0;
        int b = 0;
        for (int i = 0; i < baseballGame.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (baseballGame[i] == arr[j]) {
                    // 자리수가 동일하면 스트라이크
                    if (i == j) {
                        s++;
                    }
                    // 자리수가 다르면 볼
                    else {
                        b++;
                    }
                }
            }
        }

        if (s == 4) {
            gameOver();
            return true;
        } else {
            System.out.println("아쉽네요 " + s + "S " + b + "B 입니다.");
            return false;
        }

    }

    public void gameOver() {
        System.out.println("정답입니다.");
    }

}
