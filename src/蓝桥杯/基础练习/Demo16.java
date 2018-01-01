package 蓝桥杯.基础练习;

/*
    问题描述
    　　求出区间[a,b]中所有整数的质因数分解。
    输入格式
    　　输入两个整数a，b。
    输出格式
    　　每行输出一个数的分解，形如k=a1*a2*a3...(a1<=a2<=a3...，k也是从小到大的)(具体可看样例)
    样例输入
        3 10
    样例输出
        3=3
        4=2*2
        5=5
        6=2*3
        7=7
        8=2*2*2
        9=3*3
        10=2*5
    提示
    　　先筛出所有素数，然后再分解。
    数据规模和约定
    　　2<=a<=b<=10000

    分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
    (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
    (2)如果n>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。
    (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
*/

import java.util.Scanner;

public class Demo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();
        for(int i = min; i <= max; i++) {
            System.out.println(resolvePrime(i));
        }
    }

    /**
     * 分解质因数
     * @param num 待分解的数字
     * @return 分解后的数字结果
     */
    public static String resolvePrime(int num) {

        // 定义结果字符串缓存对象，用来保存结果字符
        StringBuffer sb = new StringBuffer(num + "=");

        // 定义最小素数
        int i = 2;

        // 进行辗转相除法
        while (i <= num) {

            // 若num 能整除 i ，则i 是num 的一个因数
            if (num % i == 0) {

                // 将i 保存进sb 且 后面接上 *
                sb.append(i + "*");

                // 同时将 num除以i 的值赋给 num
                num = num / i;

                // 将i重新置为2
                i = 2;
            } else {

                // 若无法整除，则i 自增
                i++;
            }
        }

        // 去除字符串缓存对象最后的一个*，将结果返回
        return sb.toString().substring(0, sb.toString().length() - 1);
    }

}
