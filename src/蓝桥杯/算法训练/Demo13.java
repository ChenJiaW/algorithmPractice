package 蓝桥杯.算法训练;

/*
    问题描述
    　　某国为了防御敌国的导弹袭击，发展出一种导弹拦截系统。但是这种导弹拦截系统有一个缺陷：
        虽然它的第一发炮弹能够到达任意的高度，但是以后每一发炮弹都不能高于前一发的高度。
        某天，雷达捕捉到敌国的导弹来袭。由于该系统还在试用阶段，所以只有一套系统，因此
        有可能不能拦截所有的导弹。
    　　输入导弹依次飞来的高度（雷达给出的高度数据是不大于30000的正整数），计算这套系统最
        多能拦截多少导弹，如果要拦截所有导弹最少要配备多少套这种导弹拦截系统。
    输入格式
    　　一行，为导弹依次飞来的高度
    输出格式
    　　两行，分别是最多能拦截的导弹数与要拦截所有导弹最少要配备的系统数
    样例输入
        389 207 155 300 299 170 158 65
    样例输出
        6
        2
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        //这个录入有问题，不符合题目的录入要求！！！  但是我想不到有什么好的方法。。。
        do {
            String temp = sc.nextLine();
            if(temp.equals(""))
                break;
            list.add(Integer.valueOf(temp));
        } while (true);


    }

}
