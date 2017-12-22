package 蓝桥杯.入门训练;

import java.util.Scanner;

/*
*    问题描述
        Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
        当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
     输入格式
        输入包含一个整数n。
     输出格式
        输出一行，包含一个整数，表示Fn除以10007的余数。
*/
public class Demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        temp = f(temp);
        temp = g(temp);
        System.out.println(temp);
    }

    private static int f(int i) {  //求出Fibonacci数列的第i项
        if(i == 1 || i == 2)
            return 1;
        else
            return f(i-1)+f(i-2);
    }

    private static int g(int i) {  //求余数,这样求cpu会超出要求！！！
        i = i % 10007;
        return i;
    }
}
