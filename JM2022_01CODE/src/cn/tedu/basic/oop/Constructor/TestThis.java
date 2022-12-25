package cn.tedu.basic.oop.Constructor;
/**本类用于this的测试1*/
public class TestThis {
    public static void main(String[] args) {
        //创建对象并调用方法
        Cat c = new Cat();
        c.eat();

    }
}
//创建一个小猫类
class Cat {
    //定义成员变量
    int sum = 100;

    //创建方法
    public void eat() {
        //定义一个局部变量
        int sum = 10;
        System.out.println(sum);//10，使用的局部变量，就近原则
        /**当成员变量与局部变量同名时，可以使用this指定类的成员变量
         * 如果不使用this指定，打印的就是近处的这个局部变量*/
        System.out.println(this.sum);

    }
}
