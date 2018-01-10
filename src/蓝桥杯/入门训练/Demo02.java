package 蓝桥杯.入门训练;

/*
    问题描述
        求1+2+3+...+n的值。
    输入格式
        输入包括一个整数n。
    输出格式
        输出一行，包括一个整数，表示1+2+3+...+n的值。
*/

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long temp = sc.nextInt();
        long num = 0;
        for(int i = 1; i <= temp; i++) {
            num = num + i;
        }
        System.out.println(num);
    }
}
