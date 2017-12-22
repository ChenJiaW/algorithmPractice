package 蓝桥杯.入门训练;

/*
*    问题描述
        给定圆的半径r，求圆的面积。
     输入格式
        输入包含一个整数r，表示圆的半径。
     输出格式
        输出一行，包含一个实数，四舍五入保留小数点后7位，表示圆的面积。
*/

import java.util.Scanner;

import static java.lang.Math.atan;

public class Demo03 {
    public static void main(String[] args) {
        final double pi = atan(1.0)*4;     //因为需要高精度的数据，故PI的取值应这样
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        String s = Double.toString(r*r*pi);
        System.out.println(s);
        int a = s.indexOf(".");
        s = s.substring(0,a + 9);
        System.out.println(s);


    }
}
