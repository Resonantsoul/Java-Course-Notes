package cn.tedu.basic.oop;
import java.util.Scanner;
/**本类用作面向对象入门案例
 * 设计手机这一类事物
 * 分析属性：品牌、价格、尺寸、颜色
 * 分析功能：打电话 发短信 看直播*/
public class TestCreateClass {
    public static void main(String[] args) {
        //创建手机类变量
        Phone p = new Phone();
        //通过手机类对象调用手机类的功能
        p.call();
        p.message();
        p.video();
        //通过手机类对象打印查看属性值
        System.out.println(p.brand = "Apple iphone");
        System.out.println(p.color = "black");
        System.out.println(p.price = 8999);
        System.out.println(p.size = 6.1);
        //创建第二个手机类p1
        Phone p1 = new Phone();
        //给p1添加属性
        p1.brand = "XiaoMi";
        p1.price = 1999;
        p1.size = 6.28;
        p1.color = "pink";
        //查看p1属性
        System.out.println(p1.brand);
        System.out.println(p1.price);
        System.out.println(p1.size);
        System.out.println(p1.color);
        //创建匿名对象
        new Phone();
        Scanner sc = new Scanner(System.in);//普通对象
        int a = new Scanner(System.in).nextInt();//匿名对象
        int b = sc.nextInt();
        int c = sc.nextInt();

    }
}
//通过class关键字创建手机类--用来描述手机这一类事物--属性+功能

class Phone {
    //定义手机类的属性--用成员变量来描述--位置，类里方法外
    String brand;//品牌
    double price;//价格
    double size;//尺寸
    String color;//颜色

    //定义手机类的功能--用方法来描述--五要素：修饰符 返回值类型 方法名(参数列表) {方法名}
    public void call() {
        System.out.println("正在打电话");
    }

    public void message() {
        System.out.println("正在发短信");
    }

    public void video() {
        System.out.println("正在看直播");
    }
}
