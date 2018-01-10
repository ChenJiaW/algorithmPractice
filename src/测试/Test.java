package 测试;

/*
    这个类是用来测试函数的！！！
*/

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i = 0; i < length; i++) {
            arr[i] = sc.nextInt(1);
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
