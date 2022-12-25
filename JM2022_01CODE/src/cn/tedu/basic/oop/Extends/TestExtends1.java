package cn.tedu.basic.oop.Extends;
/**本类用于测试继承的用法：super*/
public class TestExtends1 {
    public static void main(String[] args) {
        //创建子类的匿名对象进行测试
        new Son().eat();

    }
}
//创建一个爸爸类
class Father {
    int sum = 10;
    int a = 666;
}
//创建子类并继承爸爸类
class Son extends Father {
    //创建子类的成员变量sum
    int sum = 100;
    //创建子类的普通方法
    public void eat() {
        int sum = 10000;
        //子类的局部变量
        System.out.println(sum);
        //this代表父类，指向本类的成员变量
        System.out.println(this.sum);
        /**关键字super代表父类，Father super = new super();
         * 所以想指定同名的父类成员变量时，使用super来指定*/
        System.out.println(super.sum);
        //super调用
        System.out.println(a);
        //当子类和父类没有同名的变量时，直接使用变量
    }
}
