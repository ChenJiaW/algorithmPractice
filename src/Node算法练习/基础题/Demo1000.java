package Node算法练习.基础题;

/*
        给出2个整数A和B，计算两个数的和。
    Input
        2个整数A B，中间用空格分割。（0 <= A, B <= 10^9）
    Output
        输出A + B的计算结果。
    Input示例
        1 2
    Output示例
        3
*/


import java.util.Scanner;

public class Demo1000 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int num = A + B;
        System.out.println(num);
    }
}
