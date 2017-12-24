package 蓝桥杯.基础练习;

/*
*       问题描述
            利用字母可以组成一些美丽的图形，下面给出了一个例子：
            ABCDEFG
            BABCDEF
            CBABCDE
            DCBABCD
            EDCBABC
            这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
        输入格式
            输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
        输出格式
            输出n行，每个m个字符，为你的图形。
*/

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        char[] a = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                'O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //这里记录的是行数
        int m = sc.nextInt();   //这里记录的是列数

        char[] arr = new char[m];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = a[i];
        }
        /*
        *     最开始的思路是把数组进行变换，在A之后的依次往后推，然后根据根据对称复制过来，
        *   后来发现如果A超过了中心，则不能复制，故换一种思路，即数组不变，变的只是输出位置。
        */
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(j >= i) {
                    System.out.print(arr[j-i]);
                } else if(j < i) {
                    System.out.print(arr[i-j]);
                }
            }
            System.out.println();
        }

    }
}
