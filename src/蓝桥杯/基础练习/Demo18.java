package 蓝桥杯.基础练习;

/*
    问题描述
    　　平面上有两个矩形，它们的边平行于直角坐标系的X轴或Y轴。对于每个矩形，我们给出它的一对
        相对顶点的坐标，请你编程算出两个矩形的交的面积。
    输入格式
    　　输入仅包含两行，每行描述一个矩形。
    　　在每行中，给出矩形的一对相对顶点的坐标，每个点的坐标都用两个绝对值不超过10^7的实数表示。
    输出格式
    　　输出仅包含一个实数，为交的面积，保留到小数后两位。
    样例输入
        1 1 3 3
        2 2 4 4
    样例输出
        1.00
*/

import java.util.Arrays;
import java.util.Scanner;

public class Demo18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a1x = sc.nextDouble();
        double a1y = sc.nextDouble();
        double a2x = sc.nextDouble();
        double a2y = sc.nextDouble();

        double b1x = sc.nextDouble();
        double b1y = sc.nextDouble();
        double b2x = sc.nextDouble();
        double b2y = sc.nextDouble();

        double[] arrX = {a1x,a2x,b1x,b2x};
        double[] arrY = {a1y,a2y,b1y,b2y};
        double[] arr = new double[2];

        Arrays.sort(arrX);
        Arrays.sort(arrY);
        //还差一个判断是否相交的条件,如果两个长方形不想交的话，程序会出错！！！


        getMiddle(arrX,arr);
        double grow = arr[1] - arr[0];
        getMiddle(arrY,arr);
        double wide = arr[1] - arr[0];

        getArea(grow,wide);

    }

    private static void getMiddle(double[] arr1,double[] arr2) {
        for(int i = 0; i < 2; i++)
            arr2[i] = arr1[i+1];
    }

    private static void getArea(double a,double b) {
        double area = a * b;
        String result = String.format("%.2f",area);
        System.out.println(result);
    }
}
