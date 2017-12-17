package 古典算法;

/*
*【程序1】   题目：古典问题：
* 有一对兔子，从出生后第3个月起每个月都生一对兔子，
* 小兔子长到第四个月后每个月又生一对兔子，假如兔子
* 都不死，问每个月的兔子总数为多少？
*/

public class Demo01 {
    public static void main(String[] args) {
        int month = 20;   //总月数
        for(int i = 1; i < month; i++) {
            System.out.println(num(i));
        }
    }

    private static int num(int i) {   //计算兔子的总数
        if(i == 1 || i == 2)
            return 1;
        else
            return num(i-1) + num(i-2);
    }
}
