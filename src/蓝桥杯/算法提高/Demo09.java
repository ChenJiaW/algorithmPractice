package 蓝桥杯.算法提高;
/*
问题描述
　　完成一个递归程序，倒置字符数组。并打印实现过程
　　递归逻辑为：
　　当字符长度等于1时，直接返回
　　否则，调换首尾两个字符，在递归地倒置字符数组的剩下部分
输入格式
　　字符数组长度及该数组
输出格式
　　在求解过程中，打印字符数组的变化情况。
　　最后空一行，在程序结尾处打印倒置后该数组的各个元素。
样例输入
    Sample 1
    5 abcde
    Sample 2
    1 a
样例输出
    Sample 1
    ebcda
    edcba

    edcba
    Sample 2

    a
*/

import java.util.Scanner;

public class Demo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        String s = sc.next();
        char[] arr = s.toCharArray();
        if (length == 1) {
            System.out.println();
            toWatch(arr);
            return;
        }

        for (int i = 0; i < length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
            toWatch(arr);
        }

        System.out.println();
        toWatch(arr);
    }

    private static void toWatch(char[] arr) {  //显示数组元素
        for (char c : arr) {
            System.out.print(c);
        }
        System.out.println();
    }
}
