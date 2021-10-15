package Lesson2.javabackend.java;

import java.util.Scanner;

public class Task3_1 {
    public static void main(String[] args) {
        System.out.println("---- Tính số tiền điện trong tháng ----");
        float electric, money;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số chữ điện khách hàng đã dùng : ");
        electric = Integer.parseInt(input.nextLine());
        money = (electric<=50)? electric*1000 : electric*1200;
        System.out.println("Số tiền khách hàng cần phải trả là : " + money);
    }
}
