package Lesson2.javabackend.java;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("---- Phương trình bậc 1: ax + b = 0 ----");
        float a, b, x;
        String nghiem;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào hệ số a: ");
        a = Integer.parseInt(input.nextLine());
        System.out.println("Nhập vào hệ số b:");
        b = Integer.parseInt(input.nextLine());
        nghiem = (b == 0) ? ((a == 0) ? "phương trình có vô số nghiệm" : "phương trình có 1 nghiệm x = " + 0) :
                ((a == 0) ? "phương trình vô số nghiệm" : "phương trình có 1 nghiệm x = " + (x = (-b) / a));
        System.out.println(nghiem);
    }
}
