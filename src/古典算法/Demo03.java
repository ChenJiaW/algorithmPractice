package 古典算法;

/*
* 【程序3】   题目：打印出所有的 "水仙花数 "，
*  所谓 "水仙花数 "是指一个三位数，其各位数字立
*  方和等于该数本身。例如：153是一个 "水仙花数 "，
*  因为153=1的三次方＋5的三次方＋3的三次方。
*/

public class Demo03 {
    public static void main(String[] args) {
        int g,s,b;
        for(int i = 100; i < 1000; i++) {
            g = i % 10;         //取出i的个位
            s = (i/10) % 10;    //取出i的十位
            b = (i/100) % 10;   //取出i的百位

            if(i == g*g*g + s*s*s + b*b*b)
                System.out.println(i);
        }
    }
}
