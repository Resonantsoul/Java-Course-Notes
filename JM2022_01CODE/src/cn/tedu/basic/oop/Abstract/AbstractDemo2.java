package cn.tedu.basic.oop.Abstract;
/**本类用于抽象类中的成员测试*/
public class AbstractDemo2 {

}
//创建父类对象Father
abstract class Father {
    /**抽象类中可以定义成员变量*/
    int a;
    /** 抽象类中可以定义成员常量*/
    final int b = 10;
    /**抽象类中可以定义静态成员变量*/
    static int c;
    /**抽象类中可以定义普通方法*/
    public void method() {
        System.out.println("method");
    }
    /**抽象类中可以定义静态方法*/
    public static void method1() {
        System.out.println("method1");
    }
    /**抽象类中可以定义抽象方法*/
    public abstract void method2();
}
//创建子类Son
class Son extends Father {
    @Override
    public void method2() {
        System.out.println("天气很好");
    }
}
