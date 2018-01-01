package 蓝桥杯.算法训练;

/*
    问题描述
        给定一个序列，每次询问序列中第l个数到第r个数中第K大的数是哪个。
    输入格式
        第一行包含一个数n，表示序列长度。
        第二行包含n个正整数，表示给定的序列。
        第三个包含一个正整数m，表示询问个数。
        接下来m行，每行三个数l,r,K，表示询问序列从左往右第l个数到第r个数中，
        从大往小第K大的数是哪个。序列元素从1开始标号。
    输出格式
        总共输出m行，每行一个数，表示询问的答案。
    样例输入
        5
        1 2 3 4 5
        2
        1 5 2
        2 3 2
    样例输出
        4
        2
    数据规模与约定
        对于30%的数据，n,m<=100；
        对于100%的数据，n,m<=1000；
        保证k<=(r-l+1)，序列中的数<=106。
*/

import java.util.Arrays;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // n代表序列长度
        int[] arr1 = new int[n];  // 存储该序列的数组
        for(int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();  // m代表询问次数
        int[][] arr2 = new int[m][3];
        for(int i = 0; i < m; i++) {
            arr2[i][0] = sc.nextInt();  // l
            arr2[i][1] = sc.nextInt();  // r
            arr2[i][2] = sc.nextInt();  // k
        }

        for(int i = 0; i < m; i++) {  //对序列进行多次查询
            int l = arr2[i][0];
            int r = arr2[i][1];
            int k = arr2[i][2];
            int[] arr3 = new int[r-l+1];

            for(int j = 0; j < arr3.length; j++) {
                arr3[j] = arr1[l-1];
                l++;
            }

            Arrays.sort(arr3);
            System.out.println(arr3[arr3.length - k]);
        }
    }
}
