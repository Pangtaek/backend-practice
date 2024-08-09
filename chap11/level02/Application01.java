package com.pangtaek.practice.chap11.level02;

import java.io.*;

public class Application01 {

//    병합할 파일의 개수 입력 : 3
//    1 번째 파일 이름 입력 : test.txt
//    2 번째 파일 이름 입력 : test2.txt
//    3 번째 파일 이름 입력 : test3.txt
//    병합 될 파일명 입력 : result.txt
//    파일 병합이 완료 되었습니다.
//
//    병합할 파일의 개수 입력 : 2
//    1 번째 파일 이름 입력 : test.txt
//    2 번째 파일 이름 입력 : test4.txt
//    병합 될 파일명 입력 : result.txt
//    오류 : test4.txt (지정된 파일을 찾을 수 없습니다)

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("병합할 파일의 개수 입력 : ");
            int n = Integer.parseInt(br.readLine());
            String[] fileName = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.print((i + 1) + " 번째 파일 이름 입력 : ");
                fileName[i] = br.readLine();
            }

            System.out.print("병합 될 파일명 입력 : ");
            String mergedFileName = br.readLine();

            // 병합할 파일 열기
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(mergedFileName, true))) {
                boolean allFilesMerged = true;
                for (int i = 0; i < fileName.length; i++) {
                    File file = new File(fileName[i]);
                    if (!file.exists()) {
                        System.out.println("오류 : " + fileName[i] + " (지정된 파일을 찾을 수 없습니다)");
                        allFilesMerged = false;
                        continue;
                    }

                    try (BufferedReader fileReader = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = fileReader.readLine()) != null) {
                            bw.write(line);
                            bw.newLine();
                        }
                    } catch (IOException e) {
                        System.out.println("오류 : " + fileName[i] + " (파일을 읽는 중 오류가 발생했습니다)");
                        allFilesMerged = false;
                    }
                }
                if (allFilesMerged) {
                    System.out.println("파일 병합이 완료되었습니다.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
