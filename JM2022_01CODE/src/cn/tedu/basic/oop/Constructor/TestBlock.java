package cn.tedu.basic.oop.Constructor;
/**本类用于测试构造代码块*/
public class TestBlock {
    public static void main(String[] args) {
        //创建对象，完成构造方法的调用
        Pig p = new Pig();
        Pig p1 = new Pig("陈昊燃");
        Pig p2 = new Pig("陈昊燃",19);
        //通过创建的对象进行测试
        System.out.println(p.name);
        System.out.println(p1.name);
        System.out.println(p2.name);
        p.eat();
        p1.eat();
        p2.eat();

    }
}
//创建一个小猪类
class Pig {
    //属性--成员变量
    String name;
    int age;

    //创建本类的构造代码块
    {
        /**
         * 构造代码块：{}
         * 位置：类里方法外
         * 执行时机：每次创建对象时都会执行构造代码块，并且构造代码块优先于构造方法执行
         * 作用：用于提取所有方法的共性代码
         * */
        System.out.println("我是构造代码块");
    }

    //快捷：右键选中 Generate - Constructor -Sel None(无参构造)
    //无参构造
    public Pig() {
        System.out.println("我是无参构造");
    }
    //含参构造
    //快捷：右键选中 Generate - Constructor - 选中所要的属性
    public Pig(String name) {
        this.name = name;
        System.out.println("我是含参构造");
    }
    //全参构造
    public Pig(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("我是全参构造");
    }
    //方法
    public void eat() {
        //创建局部代码块
        {
            /**
             * 局部代码块：{}
             * 位置：方法里
             * 执行时机：随着方法的调用而调用
             * 作用：
             * */
            //在局部代码块中创建变量i
            int i = 1;
            System.out.println(i);
            System.out.println("局部代码块");
        }
        //System.out.println(i);局部变量i只能在局部代码块中使用
        System.out.println("小猪爱吃菜叶子");
    }
}
