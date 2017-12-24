package 蓝桥杯.基础练习;

/*
*    问题描述
        对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
            00000
            00001
            00010
            00011
            00100
        请按从小到大的顺序输出这32种01串。
     输入格式
        本试题没有输入。
     输出格式
        输出32行，按从小到大的顺序每行一个长度为5的01串。
*/

public class Demo02 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0};

        while(true) {

            for (int a : arr) {
                System.out.print(a);
            }

            System.out.println();
            arr[arr.length - 1]++;    //注意-1，不然会数组越界

            for(int i = arr.length - 1; i > 0; i--) {   //注意-1，不然会数组越界
                if(arr[i] == 2) {
                    arr[i-1]++;
                    arr[i] = 0;
                }
            }

            if(arr[0] == 2) {
                break;
            }
        }

    }
}
