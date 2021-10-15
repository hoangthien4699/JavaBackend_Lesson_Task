package Lesson2.javabackend.java;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        System.out.println("---- Menu bài tập lesson 2 ----");
        int choose;
        boolean check = false;
        float a, b ,c,x,delta;
        String nghiem;
        float electric, money;
        Scanner input = new Scanner(System.in);
        while (check == false){
            System.out.println();
            System.out.println("----Menu---- : ");
            System.out.println(" 1 : Tính phương trình bậc 1");
            System.out.println(" 2 : Tính phương trình bậc 2");
            System.out.println(" 3 : Tính tiền điện 1");
            System.out.println(" 4 : Tính tiền điện 2");
            System.out.println(" 5 : Thoát khỏi chương trình");
            System.out.printf(" Nhập lựa chọn : ");
            System.out.println();
            choose = Integer.parseInt(input.nextLine());
            switch (choose){
                case 1 :
                    System.out.println("---- Phương trình bậc 1: ax + b = 0 ----");
                    System.out.println("Nhập vào hệ số a: ");
                    a = Integer.parseInt(input.nextLine());
                    System.out.println("Nhập vào hệ số b:");
                    b = Integer.parseInt(input.nextLine());
                    nghiem = (b == 0) ? ((a == 0) ? "phương trình có vô số nghiệm" : "phương trình có 1 nghiệm x = " + 0) :
                            ((a == 0) ? "phương trình vô số nghiệm" : "phương trình có 1 nghiệm x = " + (x = (-b) / a));
                    System.out.println(nghiem);
                    break;
                case 2 :
                    System.out.println("---- Phương trình bậc 2: ax^2 + bx + c = 0 ----");
                    System.out.println("Nhập vào hệ số a: ");
                    a = Integer.parseInt(input.nextLine());
                    System.out.println("Nhập vào hệ số b:");
                    b = Integer.parseInt(input.nextLine());
                    System.out.println("Nhập vào hệ số c:");
                    c = Integer.parseInt(input.nextLine());
                    delta = b*b - (4*a*c);
                    nghiem = (delta < 0) ? ("Phương trình vô nghiệm") : ((delta ==0) ? "Phương trình có 1 nghiệm x = "
                            +((-b)/2*a) : "Phương trình có 2 nghiệm x1 = " + (((-b)+delta)/2*a) + " và x2 = " + (((-b)-delta)/2*a));
                    System.out.println(nghiem);
                    break;
                case 3 :
                    System.out.println("---- Tính số tiền điện trong tháng 1----");
                    System.out.println("Nhập vào số chữ điện khách hàng đã dùng : ");
                    electric = Integer.parseInt(input.nextLine());
                    money = (electric<=50)? electric*1000 : electric*1200;
                    System.out.println("Số tiền khách hàng cần phải trả là : " + money);
                    break;
                case 4 :
                    System.out.println("---- Tính số tiền điện trong tháng 2----");
                    System.out.println("Nhập vào số chữ điện khách hàng đã dùng : ");
                    electric = Integer.parseInt(input.nextLine());
                    money = (electric <= 50) ? electric*1678 : (electric<=100) ? electric*1734 : (electric<=200) ? electric*2014
                            : (electric<= 300) ? electric*2536 : (electric<=400)? electric*2834 : electric*2927;
                    System.out.println("Số tiền khách hàng cần phải trả là : " + money);
                    break;
                case 5 : check = true;
        }
        }
    }
}
