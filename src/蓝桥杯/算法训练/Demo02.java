package 蓝桥杯.算法训练;

/*
    问题描述
        已知一个正整数N，问从1~N中任选出三个数，他们的最小公倍数最大可以为多少。
    输入格式
        输入一个正整数N。
    输出格式
        输出一个整数，表示你找到的最小公倍数。
    样例输入
        9
    样例输出
        504
    数据规模与约定
        1 <= N <= 106。
*/

import java.util.Arrays;
import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

    }

    private static int f(int x,int y,int z) {  // 求最小公倍数
        int max = getMax(x,y,z);
        for(int i = max; ; i++) {
            if(i%x==0 && i%y==0 && i%z==0)
                return i;
        }
    }

    private static int getMax(int x,int y,int z) {  //求最大值
        int[] arr = {x,y,z};
        Arrays.sort(arr);
        return arr[2];
    }
}
