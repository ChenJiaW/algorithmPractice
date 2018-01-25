package 蓝桥杯.算法训练;

/*
问题描述
    一个旅行家想驾驶汽车以最少的费用从一个城市到另一个城市（假设出发时油箱是空的）。
    给定两个城市之间的距离D1、汽车油箱的容量C（以升为单位）、每升汽油能行驶的距离D2、
    出发点每升汽油价格P和沿途油站数N（N可以为零），油站i离出发点的距离Di、
    每升汽油价格Pi（i=1，2，……N）。计算结果四舍五入至小数点后两位。如果无法到达目的地，
    则输出“No Solution”。
输入格式
    第一行为4个实数D1、C、D2、P与一个非负整数N；
    接下来N行，每行两个实数Di、Pi。
输出格式
    如果可以到达目的地，输出一个实数（四舍五入至小数点后两位），
    表示最小费用；否则输出“No Solution”（不含引号）。
样例输入
    275.6 11.9 27.4 2.8 2
    102.0 2.9
    220.0 2.2
样例输出
    26.95
*/

import java.util.Scanner;

public class Demo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double D1 = sc.nextDouble();        //两个城市之间的距离D1
        double C = sc.nextDouble();         //汽车油箱的容量C（以升为单位）
        double D2 = sc.nextDouble();        //每升汽油能行驶的距离D2
        double P = sc.nextDouble();         //出发点每升汽油价格P
        int N = sc.nextInt();               //沿途油站数N（N可以为零）

        double[][] price = new double[N + 1][2];
        price[0][0] = D1;
        price[0][0] = P;
        for(int i = 1; i < price.length; i++) {
            price[i][0] = sc.nextDouble();     //油站i离出发点的距离Di
            price[i][1] = sc.nextDouble();     //每升汽油价格Pi
        }

        double totalPrice;              //总费用

        if(N == 0) {
            if(D1 > C * D2) {
                System.out.println("No Solution");
                return;
            } else {
                double temp = D1 / D2;     //需要的最少油数
                totalPrice = temp * P;
                System.out.println(String.format("%.2f", totalPrice));
                return;
            }
        }
        //如果城市之间有加油站

    }
}
