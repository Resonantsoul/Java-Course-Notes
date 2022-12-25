package cn.fantunyi.nb;

import java.util.Scanner;

public class TestCircleArea {
    public static void main (String[] args) {
        /**等号右边的值赋值给等号左边的变量来保存*/
        /**先打印输出，提示用户输入数据*/
        System.out.println("请输入圆的半径：");
        /**1.调用工具类Scanner，接收从控制台输入的数据*/
        Scanner sc = new Scanner(System.in);
        /**调用工具类定义的sc的变量r赋值，但是得确定工具类的数据类型*/
        double r = sc.nextDouble();
        System.out.println("圆的面积为:"+ 3.14*r*r);
        /**3.定义r用来保存圆的半径*/

        /**第二种Scanner的方式*/
        System.out.println("请输入圆的半径：");
        /**定义r用来保存圆的半径*/
        double r1 = new Scanner(System.in).nextDouble();
        /**定义圆的圆周率*/
        double a = 3.14;
        System.out.println(a*r1*r1);




    }
}
