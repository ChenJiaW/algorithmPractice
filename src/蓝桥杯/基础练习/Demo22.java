package 蓝桥杯.基础练习;

/*
    问题描述
    　　FJ在沙盘上写了这样一些字符串：
    　　A1 = “A”
    　　A2 = “ABA”
    　　A3 = “ABACABA”
    　　A4 = “ABACABADABACABA”
    　　… …
    　　你能找出其中的规律并写所有的数列AN吗？
    输入格式
　　    仅有一个数：N ≤ 26。
    输出格式
　　    请输出相应的字符串AN，以一个换行符结束。输出中不得含有多余的空格或换行、回车符。
    样例输入
        3
    样例输出
        ABACABA
*/


import java.util.Scanner;

public class Demo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] letter = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N",
                "O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String text = "A";
        //这道题的规律就是第n道等于第n-1道+字母+第n-1道
        for(int i = 0; i < N; i++) {
            if(i != 0) {
                String temp = text + letter[i] + text;
                text = temp;
            }
        }

        System.out.println(text);
    }
}