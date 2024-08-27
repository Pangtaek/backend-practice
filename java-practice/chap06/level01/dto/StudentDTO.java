package com.pangtaek.practice.chap06.level01.dto;

public class StudentDTO {
    private int grade;      // 학년
    private int classroom;  // 반
    private String name;    // 이름
    private int kor;        // 국어점수
    private int eng;        // 영어점수
    private int math;       // 수학점수

    public StudentDTO() {
    }

    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getInformation() {
        return "학년=" + this.grade + ", " + "반=" + this.classroom + ", "
                + "이름=" + this.name + ", " + "국어=" + this.kor + ", "
                + "영어=" + this.eng + ", " + "수학=" + this.math + ", "
                + "평균=" + (kor + eng + math) / 3;
    }
    // 학년=1, 반=5, 이름=홍길동, 국어=40, 영어=60, 수학=70, 평균=56
}
