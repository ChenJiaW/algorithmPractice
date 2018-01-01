package 蓝桥杯.基础练习;

/*
    问题描述
    　　给定一个N阶矩阵A，输出A的M次幂（M是非负整数）
    　　例如：
    　　A =
    　　1 2
    　　3 4
    　　A的2次幂
    　　7 10
    　　15 22
    输入格式
    　　第一行是一个正整数N、M（1<=N<=30, 0<=M<=5），表示矩阵A的阶数和要求的幂数
    　　接下来N行，每行N个绝对值不超过10的非负整数，描述矩阵A的值
    输出格式
    　　输出共N行，每行N个整数，表示A的M次幂所对应的矩阵。相邻的数之间用一个空格隔开
    样例输入
        2 2
        1 2
        3 4
    样例输出
        7 10
        15 22
*/

import java.util.Scanner;

public class Demo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int number = sc.nextInt();
        int[][] arr = new int[length][length];  //原始矩阵
        int[][] arr1 = new int[length][length];  //相乘之后的矩阵
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                arr[i][j] = sc.nextInt();
                arr1[i][j] = arr[i][j];
            }
        }

        if(number == 0) {  //0次幂的结果是单位矩阵
            for(int i = 0; i < length; i++) {
                for(int j = 0; j < length; j++) {
                    if(i == j) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(0 + " ");
                    }
                }
                System.out.println();
            }
            return;
        }

        for(int i = 0; i < number-1; i++) { //n次幂的计算
            f(length,arr,arr1);
        }

        for(int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static void f(int length,int[][] arr,int [][] arr1) {   //矩阵相乘
        int[][] arr2 = new int[length][length];   //暂时存储的矩阵
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                int temp = 0;
                for(int k = 0; k < length; k++)
                    temp = temp + arr1[i][k] * arr[k][j];
                arr2[i][j] = temp;
            }
        }

        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                arr1[i][j] = arr2[i][j];
            }
        }
    }
}
