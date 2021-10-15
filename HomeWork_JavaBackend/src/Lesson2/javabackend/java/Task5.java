package Lesson2.javabackend.java;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("---- Tìm số ngày trong tháng ----");
        int year, month, day;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào năm bạn mong muốn : ");
        year = Integer.parseInt(input.nextLine());
        System.out.println("Nhập tháng bạn muốn : ");
        month = Integer.parseInt(input.nextLine());
        day = (year%4 ==0)? ((month ==2)? 29 : ((month % 2==0)? ((month<8) ?  30 : 31) : ((month<8) ? 31 : 30))) :
                ((month ==2)? 28 : ((month % 2==0)? ((month<8) ?  30 : 31) : ((month<8) ? 31 : 30)));
        System.out.println("Tháng "+month+ " năm " + year + " có "+ day+ " ngày");
    }
}
