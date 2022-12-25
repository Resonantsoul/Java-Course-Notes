package cn.fantunyi.nb;

import java.util.Random;
import java.util.Scanner;

/**本类用于练习while循环*/
public class TestWhile {
    public static void main(String[] args) {
        /**案例：猜数字游戏
         * 产生一个随机数，与用户一直输入的数字作比较，直到用户猜对*/
        //调用可以生产随机数的方法，并且接收生成的随机数
        int b = createNum();

        guessNum(b);
    }

    public static void guessNum(int a) {
        int c = 0;
        while (true) {
            c++;
            //接收用户输入的值
            System.out.println("请输入1-100的整数：");
            int input = new Scanner(System.in).nextInt();
            //判断是否猜对（拿用户猜的数字和生成的随机数做比较）
            if (input == a) {
                System.out.println("恭喜你答对了");
                System.out.println("猜了"+c+"次");
                break;
            }else if (input > a){
                System.out.println("猜大了");
            } else if (input < a) {
                System.out.println("猜小了");
            }
        }
    }

    public static int createNum() {//public 公共的 static 静态的 void 空的（无返回值类型）
        //让程序生产一个随机数
        //100是自定义的参数，生产的随机数范围是[0,100) [1,100]
        int a = new Random().nextInt(100)+1;
        //返回参数
        return a;
    }
}
