package com.pangtaek.practice.chap06.level02;

import com.pangtaek.practice.chap06.level02.dto.BookDTO;

public class Application01 {
    public static void main(String[] args) {
        BookDTO nullBook = new BookDTO();
        BookDTO javaBook =  new BookDTO("자바의 정석", "도우출판", "남궁", 0, 0.0);
        BookDTO hongilDongBook = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);

        nullBook.printInformation();
        javaBook.printInformation();
        hongilDongBook.printInformation();
    }
}
