package 蓝桥杯.算法提高;
/*
问题描述
　　给定一个t，将t秒转化为HH:MM:SS的形式，表示HH小时MM分钟SS秒。HH,MM,SS均是两位数，如果小于10用0补到两位。
输入格式
　　第一行一个数T(1<=T<=100,000)，表示数据组数。后面每组数据读入一个数t，0<=t<24*60*60。
输出格式
　　每组数据一行，HH:MM:SS。
样例输入
    2
    0
    86399
样例输出
    00:00:00
    23:59:59
*/

import java.util.Scanner;

public class Demo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  //数据组数
        int[] time = new int[t];
        for(int i = 0; i < time.length; i++)
            time[i] = sc.nextInt();

        for (int i : time) {  //转换
            f(i);
        }
    }

    private static void f(int time) {  //转换
        int h = time / 3600;
        int m = time % 3600 / 60;
        int s = time % 3600 % 60;
        g(h);
        System.out.print(":");
        g(m);
        System.out.print(":");
        g(s);
        System.out.println();
    }

    private static void g(int time) {  //显示
        if(time < 10)
            System.out.print("0" + time);
        else
            System.out.print(time);
    }
}
