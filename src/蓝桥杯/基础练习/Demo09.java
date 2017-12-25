package 蓝桥杯.基础练习;

/*
    问题描述
    　　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
　　    输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
    输入格式
　　    输入一行，包含一个正整数n。
    输出格式
　　    按从小到大的顺序输出满足条件的整数，每个整数占一行。
    样例输入
        52
    样例输出
        899998
        989989
        998899
*/

import java.util.Scanner;
import java.util.Stack;

public class Demo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        f(temp);
    }

    private static void f(int x) {   //判断是否符合各个位数相加等于temp
        for(int i = 10000; i < 1000000; i++) {
            if(g(i)) {
                int num = 0;
                String temp = i + "";
                for(int j = 0; j < temp.length(); j++) {
                    char c = temp.charAt(j);
                    String s = String.valueOf(c);
                    int n = Integer.valueOf(s);
                    num = num + n;
                }
                if(x == num)
                    System.out.println(i);
            }
        }
    }

    private static boolean g(int x) {  //判断是否符合123321这种特性
        Stack<Character> stack = new Stack<>();  //这里用了Array类里的stack工具，这是java中封装好的栈类
        String temp1 = x + "";
        String temp2;
        char[] arr = temp1.toCharArray();
        char[] arr2 = new char[arr.length];

        for (char anArr : arr) {
            stack.push(anArr);                  //进栈
        }
        for(int j = 0; j < arr2.length; j++) {
            arr2[j] = stack.pop();              //出栈
        }

        temp2 = String.valueOf(arr2);
        return temp1.equalsIgnoreCase(temp2);
    }
}
