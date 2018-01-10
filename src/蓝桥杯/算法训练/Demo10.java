package 蓝桥杯.算法训练;

/*
    问题描述
    　　给出两个整数集合A、B，求出他们的交集、并集以及B在A中的余集。
    输入格式
    　　第一行为一个整数n，表示集合A中的元素个数。
    　　第二行有n个互不相同的用空格隔开的整数，表示集合A中的元素。
    　　第三行为一个整数m，表示集合B中的元素个数。
    　　第四行有m个互不相同的用空格隔开的整数，表示集合B中的元素。
    　　集合中的所有元素均为int范围内的整数，n、m<=1000。
    输出格式
    　　第一行按从小到大的顺序输出A、B交集中的所有元素。
    　　第二行按从小到大的顺序输出A、B并集中的所有元素。
    　　第三行按从小到大的顺序输出B在A中的余集中的所有元素。
    样例输入
        5
        1 2 3 4 5
        5
        2 4 6 8 10
    样例输出
        2 4
        1 2 3 4 5 6 8 10
        1 3 5
    样例输入
        4
        1 2 3 4
        3
        5 6 7
    样例输出
        1 2 3 4 5 6 7
        1 2 3 4
*/


import java.util.*;

public class Demo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //集合A的大小
        int[] arrA = new int[n];  //集合A的内容
        for(int i = 0; i < arrA.length; i++)
            arrA[i] = sc.nextInt();
        int m = sc.nextInt();  //集合B的大小
        int[] arrB = new int[m];  //集合B的内容
        for(int i = 0; i < arrB.length; i++)
            arrB[i] = sc.nextInt();

        ArrayList<Integer> list;
        list = jiaoJi(arrA,arrB);
        if(!list.isEmpty()) {
            int[] arr = new int[list.size()];
            int x = 0;
            for (int i : list) {
                arr[x] = i;
                x++;
            }
            Arrays.sort(arr);
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        Set<Integer> set;
        set = bingJi(arrA,arrB);
        if(!set.isEmpty()) {
            int y = 0;
            int[] arr = new int[set.size()];
            for (int i : set) {
                arr[y] = i;
                y++;
            }
            Arrays.sort(arr);
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        yuji(arrA,list);
        Arrays.sort(arrA);
        for(int i = 0; i < arrA.length; i++) {
            if(arrA[i] != -1)
                System.out.print(arrA[i] + " ");
        }
    }

    private static ArrayList jiaoJi(int[] arrA, int[] arrB) {
        //定义一个ArrayList来存储他们之间交集的结果
        ArrayList<Integer> list = new ArrayList<>();
        //A中每个元素依次与B中所有的元素比较，如果有相等的，则添加进list
        for(int i = 0; i < arrA.length; i++) {
            for(int j = 0; j < arrB.length; j++) {
                if(arrA[i] == arrB[j]) {
                    list.add(arrB[j]);
                    break;
                }
            }
        }

        return list;
    }

    private static Set bingJi(int[] arrA,int[] arrB) {
        //将A和B中的所有元素都压入Set，会自动删除相同元素
        Set<Integer> s = new HashSet();
        for(int i = 0; i < arrA.length; i++)
            s.add(arrA[i]);
        for(int i = 0; i < arrB.length; i++)
            s.add(arrB[i]);

        return s;
    }

    private static void yuji(int[] arrA,ArrayList<Integer> list) {
        //如果list为空，直接退出，结果为arrA中的元素
        if(list.isEmpty())
            return;

        int[] arr = new int[list.size()];
        int x = 0;
        for(int i : list) {
            arr[x] = i;
            x++;
        }

        for(int i = 0; i < arrA.length; i++) {
            for(int j = 0; j < arr.length; j ++) {
                if(arrA[i] == arr[j]) {
                    arrA[i] = -1;
                    break;
                }
            }
        }

    }
}
