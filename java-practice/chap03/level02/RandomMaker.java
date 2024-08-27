package com.pangtaek.practice.chap03.level02;

public class RandomMaker {
    /**
     * + randomNumber(min:int, max:int):int
     * + randomUpperAlpabet(length:int):String
     * + rockPaperScissors():String
     * + tossCoin():String
     */

    public static int randomNumber(int min, int max) {
        return (int) Math.random() * (max - min + 1) + min;
    }

    public static String randomUpperAlpabet(int length) {
        /**
         * 인자의 길이 만큼의
         * 랜덤한 대문자
         * 알파벳으로 이루어진
         * 문자열을 반환함
         */

        String str = "";

        for (int i = 0; i < length; i++) {
            str += (char) ((int) (Math.random() * (90 - 65 + 1) + 65));
        }
        return str;
    }

    public static String rockPaperScissors() {
        /**
         * 가위, 바위, 보 중 한
         * 가지를 반환함
         */
        String answer = "";
        int r = (int) (Math.random() * 3);
        switch (r) {
            case 0:
                answer = "가위";
                break;
            case 1:
                answer = "바위";
                break;
            case 2:
                answer = "보";
                break;
        }
        return answer;
    }

    public static String tossCoin() {
        String answer = "";
        int r = (int) (Math.random() * 2);
        switch (r) {
            case 0:
                answer = "앞면";
                break;
            case 1:
                answer = "뒷면";
                break;
        }
        return answer;
    }

}
