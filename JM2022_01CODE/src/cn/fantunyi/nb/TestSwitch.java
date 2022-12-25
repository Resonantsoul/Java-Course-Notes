package cn.fantunyi.nb;

import java.util.Scanner;

public class TestSwitch {
    public static void main(String[] args) {
        /**案例：练习数字匹配后输出里面的奖励*/
        //提示用户输入0-9的数
        System.out.println("请输入0-9，然后获得奖品");
        //定义一个变量来保存数字
        int a = new Scanner(System.in).nextInt();
        //用switch匹配用户输入的数字然后发送奖品

        /***switch小括号可以识别的类型：byte short char int string
        拿着变量a的值依次与case后的值做比较，如果不加break，那么会向后穿透后面的case，包括default
        如果设置了default保底选项，并且没有case匹配的话，就执行default*/

        switch (a) {
            case 0:
                System.out.println(0);break;
            case 1:
                System.out.println(1);break;
            case 2:
                System.out.println(2);break;
            case 3:
                System.out.println(3);break;
            case 4:
                System.out.println(4);break;
            case 5:
                System.out.println(5);break;
            case 6:
                System.out.println(6);break;
            case 7:
                System.out.println(7);break;
            case 8:
                System.out.println(8);break;
            case 9:
                System.out.println(9);break;

        }
    }
}
