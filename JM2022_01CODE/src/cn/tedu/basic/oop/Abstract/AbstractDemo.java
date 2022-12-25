package cn.tedu.basic.oop.Abstract;
/** 本类用作抽象的入门案例*/
public class AbstractDemo {
    public static void main(String[] args) {

    }
}

//创建父类Car
/**添加抽象方法以后，本类必须声明成一个抽象类
 * 被abstract修饰的类是抽象类
 * 如果一个类中有抽象方法，那么该类必须定义成一个抽象类
 * */

abstract class Car {
    //创建普通方法
    public void start() {
        System.out.println("启动");
    }

    public void stop() {
        System.out.println("停止");
    }
    //创建抽象方法
    /** 被abstract修饰的方法是抽象的，抽象方法没有方法体 */
    public abstract void fly();
    public abstract void fly1();
}

//创建子类BMW
/**当一个子类继承了抽象父类以后，有两种解决方案
 * 方案一：把自己变成一个抽象类
 * 方案二：实现抽象父类的所有抽象方法
 * */
abstract class BMW extends Car {
    @Override
    public void fly() {
        System.out.println("经过不断研究，汽车能够飞行了");
    }
    @Override
    public void fly1() {
        System.out.println("子类必须重写抽象父类的所有抽象方法");
    }
}


