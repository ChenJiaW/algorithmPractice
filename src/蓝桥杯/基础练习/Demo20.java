package 蓝桥杯.基础练习;

/*
    问题描述
    　　Tom教授正在给研究生讲授一门关于基因的课程，有一件事情让他颇为头疼：一条染色体上
        有成千上万个碱基对，它们从0开始编号，到几百万，几千万，甚至上亿。
    　　比如说，在对学生讲解第1234567009号位置上的碱基时，光看着数字是很难准确的念出来的。
    　　所以，他迫切地需要一个系统，然后当他输入12 3456 7009时，会给出相应的念法：
    　　十二亿三千四百五十六万七千零九
    　　用汉语拼音表示为
    　　shi er yi san qian si bai wu shi liu wan qi qian ling jiu
    　　这样他只需要照着念就可以了。
    　　你的任务是帮他设计这样一个系统：给定一个阿拉伯数字串，你帮他按照中文读写的规范转为汉语拼音字串，
        相邻的两个音节用一个空格符格开。
    　　注意必须严格按照规范，比如说“10010”读作“yi wan ling yi shi”而不是“yi wan ling shi”，
        “100000”读作“shi wan”而不是“yi shi wan”，“2000”读作“er qian”而不是“liang qian”。
    输入格式
　　    有一个数字串，数值大小不超过2,000,000,000。
    输出格式
　　    是一个由小写英文字母，逗号和空格组成的字符串，表示该数的英文读法。
    样例输入
        1234567009
    样例输出
        shi er yi san qian si bai wu shi liu wan qi qian ling jiu
*/


import java.util.Scanner;
import java.util.Stack;

public class Demo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int[] numbers = new int[number.length()];
        String[] weiShu = {"shi","bai","qian"};
        String[] shuZi = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu","shi"};
        Stack<String> stack = new Stack<>();

        int j = 0;
        for(int i = number.length() - 1; i >= 0; i--) {  //将number中的ASCII码转换成数字，存储在numbers中
            numbers[j] = number.codePointAt(i) - 48;
            j++;
        }

        for(int i = 0; i < numbers.length; i++) {  //将numbers中的数字转换成拼音
            int a = numbers[i];
            int b = i % 4;
            if(stack.empty()) {
                stack.push(shuZi[a]);  //将数字的拼音进栈
//                System.out.println(0);
            } else {
                String temp = shuZi[a];
                if(temp.equalsIgnoreCase("ling") && stack.peek().equalsIgnoreCase("ling"))
                    continue;
//                System.out.println(1);
                if(i == 4) {
                    stack.push("wan");
                } else if(i == 8) {
                    stack.push("yi");
                } else {
                    stack.push(weiShu[b-1]);
                }
                stack.push(temp);
//                System.out.println(2);
            }
        }

        while(!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

    }

}
