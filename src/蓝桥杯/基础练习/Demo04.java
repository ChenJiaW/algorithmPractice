package 蓝桥杯.基础练习;

/*
*   问题描述
        给出n个数，找出这n个数的最大值，最小值，和。
    输入格式
        第一行为整数n，表示数的个数。
        第二行有n个数，为给定的n个数，每个数的绝对值都小于10000。
    输出格式
        输出三行，每行一个整数。第一行表示这些数中的最大值，第二行
        表示这些数中的最小值，第三行表示这些数的和。
    样例输入
        5
        1 3 -2 4 5
    样例输出
        5
       -2
       11
*/

import java.util.Arrays;
import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int[] arr = new int[numbers];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);        //Arrays类自带的排序函数，排成由小到大的顺序
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[0]);
        int temp = 0;
        for (int a : arr) {
            temp = temp + a;
        }
        System.out.println(temp);
    }
}
