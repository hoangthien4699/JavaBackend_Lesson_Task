package Lesson2.javabackend.java;

import java.util.Scanner;

public class Task3_2 {
    public static void main(String[] args) {
        System.out.println("---- Tính số tiền điện trong tháng ----");
        int electric, money;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số chữ điện khách hàng đã dùng : ");
        electric = Integer.parseInt(input.nextLine());
        money = (electric <= 50) ? electric*1678 : (electric<=100) ? electric*1734 : (electric<=200) ? electric*2014
                : (electric<= 300) ? electric*2536 : (electric<=400)? electric*2834 : electric*2927;
        System.out.println("Số tiền khách hàng cần phải trả là : " + money);
    }
}
