package 基础题;

/*
        输入N和P（P为质数），求N! Mod P = ? (Mod 就是求模 %)
        例如：n = 10， P = 11，10! = 3628800
        3628800 % 11 = 10
    Input
        两个数N,P，中间用空格隔开。(N < 10000, P < 10^9)
    Output
        输出N! mod P的结果。
    Input示例
        10 11
    Output示例
        10
*/


import java.util.Scanner;

public class Demo1008 {
    //程序超时
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int temp = 1;
        for(int i = N; i > 0; i--) {
            temp = temp * i;
        }

        System.out.println(temp % P);
    }
}
