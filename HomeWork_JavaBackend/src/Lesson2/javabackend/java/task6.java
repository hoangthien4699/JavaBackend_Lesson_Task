package Lesson2.javabackend.java;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        int a, b,c;
        String tamGiac;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào hệ số a: ");
        a = Integer.parseInt(input.nextLine());
        System.out.println("Nhập vào hệ số b:");
        b = Integer.parseInt(input.nextLine());
        System.out.println("Nhập vào hệ số c:");
        c = Integer.parseInt(input.nextLine());
        tamGiac = (a*a+b*b==c*c)? ((a==b)? "Đây là 3 cạnh tam giác vuông cân" : "Đây là 3 cạnh tam giác vuông")
                : (a*a+c*c==b*b)? ((a==c)? "Đây là 3 cạnh tam giác vuông cân" : "Đây là 3 cạnh tam giác vuông")
                : (b*b+c*c==a*a)? ((b==c)? "Đây là 3 cạnh tam giác vuông cân" : "Đây là 3 cạnh tam giác vuông")
                : (a==b)? ((b==c)? "Đây là 3 cạnh 1 tam giác đều" : "Đây là 3 cạnh một tam giác cân")
                : (a==c)? "Đây là 3 cạnh của  một tam giác cân" : ((b==c)? "Đây là 3 cạnh của một tam giác"
                : ((a+b<=c) ? "Đây không phải là tam giác" : ((a+c<=b)? "Đây không phải 3 cạnh của 1 tam giác"
                : (c+b<=a) ? "Đây không phải 3 cạnh của 1 tam giác" : "Đây là 3 cạnh của một tam giác thường")));
        System.out.println(tamGiac);
}
}
