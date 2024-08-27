package com.pangtaek.practice.chap09.level01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("문자열 입력 : ");
        StringBuilder input = new StringBuilder(br.readLine());
        br.close();

        for (int i = 0; i < input.length(); i++) {
            if ('A' <= input.charAt(i) && input.charAt(i) <= 'Z') {
                input.setCharAt(i, Character.toLowerCase(input.charAt(i)));
            }
            if (!('a' <= input.charAt(i) && input.charAt(i) <= 'z')) {
                input.setCharAt(i, ' ');
            }
        }

        System.out.println(input.toString());

        // 문자열을 공백을 기준으로 분할하여 배열로 변환
        String[] strArr = input.toString().split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();
        List<String> uniqueWords = new ArrayList<>();
        for (String word : strArr) {
            if (!word.isEmpty()) {
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                    uniqueWords.add(word);
                }
            }
        }

        // 각 단어의 빈도를 출력
        for (String word : uniqueWords) {
            System.out.println(word + ": " + wordCount.get(word));
        }

        // 가장 빈도 높은 단어 찾기
        String mostFrequentWord = null;
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostFrequentWord = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }

        // 가장 빈도 높은 단어 출력
        if (mostFrequentWord != null) {
            System.out.println("가장 빈도 높은 단어 : " + mostFrequentWord + " (" + maxFrequency + " 번)");
        }
    }
}
