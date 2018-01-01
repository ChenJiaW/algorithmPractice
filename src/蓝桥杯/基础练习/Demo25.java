package 蓝桥杯.基础练习;

/*
    问题描述
    　　回形取数就是沿矩阵的边取数，若当前方向上无数可取或已经取过，则左转90度。一
        开始位于矩阵左上角，方向向下。
    输入格式
    　　输入第一行是两个不超过200的正整数m, n，表示矩阵的行和列。接下来m行每行n个
        整数，表示这个矩阵。
    输出格式
    　　输出只有一行，共mn个数，为输入矩阵回形取数得到的结果。数之间用一个空格分隔，
        行末不要有多余的空格。
    样例输入
        3 3
        1 2 3
        4 5 6
        7 8 9
    样例输出
        1 4 7 8 9 6 3 2 5
    样例输入
        3 2
        1 2
        3 4
        5 6
    样例输出
        1 3 5 6 4 2
*/


import java.util.Scanner;

public class Demo25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();  //矩阵的行数
        int n = sc.nextInt();  //矩阵的列数
        int[][] arr = new int[m+2][n+2];
        //给矩阵赋初值
        for(int i = 0; i < m+2; i++) {
            for(int j = 0; j < n+2; j++)
                arr[i][j] = -1;
        }
        //录入数据
        for(int i = 1; i < m+1; i++) {
            for(int j = 1; j < n+1; j++)
                arr[i][j] = sc.nextInt();
        }

        int x = 1; //当前位置的行数
        boolean xUp = false; //当前位置往上移动
        boolean xDn = true; //当前位置往下移动
        int y = 1; //当前位置的列数
        boolean yR = false; //当前位置往右移动
        boolean yL = false; //当前位置往左移动

        while(true) {
            //判断当前光标是否有东西，有则输出，无则退出
            if(arr[x][y] == -1) {
                break;
            } else {
                System.out.print(arr[x][y] + " ");
                arr[x][y] = -1;
            }

            //转换方向
            if(xDn == true && arr[x+1][y] == -1) {
                //当光标向下没有数的时候，则光标向右转
                xDn = false;
                yR = true;
            } else if(xUp == true && arr[x-1][y] == -1) {
                //当光标向上没有数的时候，则光标向左转
                xUp = false;
                yL = true;
            } else if(yR == true && arr[x][y+1] == -1) {
                //当光标向右没有数的时候，则光标向上转
                yR = false;
                xUp = true;
            } else if(yL == true && arr[x][y-1] == -1) {
                //当光标向左没有数的时候，则光标向下转
                yL = false;
                xDn = true;
            }

            //光标移动
            if(xDn == true) {
                x++;
            } else if(xUp == true) {
                x--;
            } else if(yR == true) {
                y++;
            } else if(yL == true) {
                y--;
            }

        }
    }
}
