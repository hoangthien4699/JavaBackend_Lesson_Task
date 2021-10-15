package Lesson2.javabackend.java;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("---- Phương trình bậc 2: ax^2 + bx + c = 0 ----");
        float a, b,c,delta;
        String nghiem;
        Scanner input = new Scanner(System.in);
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
    }
}
