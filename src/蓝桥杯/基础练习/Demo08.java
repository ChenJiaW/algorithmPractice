package 蓝桥杯.基础练习;

/*
    问题描述
　   　1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
    输出格式
　   　按从小到大的顺序输出满足条件的四位十进制数。
*/

import java.util.Stack;

public class Demo08 {
    public static void main(String[] args) {
        for(int i = 1000; i < 10000; i++) {
            if(f(i))
                System.out.println(i);
        }

    }

    private static boolean f(int x) {
        Stack<Character> stack = new Stack<>();  //这里用了Array类里的stack工具，这是java中封装好的栈类
        String temp1 = x + "";
        String temp2;
        char[] arr = temp1.toCharArray();
        char[] arr2 = new char[arr.length];

        for(int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);                  //进栈
        }
        for(int j = 0; j < arr2.length; j++) {
            arr2[j] = stack.pop();               //出栈
        }

        temp2 = String.valueOf(arr2);
        if(temp1.equalsIgnoreCase(temp2)) {
            return true;
        } else {
            return false;
        }
    }
}
