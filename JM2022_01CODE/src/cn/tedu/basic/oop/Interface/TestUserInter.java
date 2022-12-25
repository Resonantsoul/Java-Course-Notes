package cn.tedu.basic.oop.Interface;
/** 本类用于接口的成员测试 */
public class TestUserInter {
    public static void main(String[] args) {
        UserInter i = new UserInterImpl();
        //创建子类对象
        /** 查看继承的结构 Ctrl + O */
        UserInterImpl i2 = new UserInterImpl();
        //可以用接口调用a
        System.out.println(UserInter.a);
        //可以用实现类来调用a
        System.out.println(UserInterImpl.a);
        //不可以用实现类来调用b
        //System.out.println(UserInterImpl.b);
    }
}
//创建接口UserInter
interface UserInter {
    /** 接口不可以创建构造方法 */
    //public UserInter() {}

    //测试接口中是否有成员变量
    /** 接口中的变量实际上是静态常量,因为静态可以通过类名直接调用 */
    /** 接口中的变量实际是静态常量，因为final在定义时必须赋值，且后面不能被赋值 */
    /** 接口中的变量都是静态常量，static 与 final 可以简写,Java会自动拼接 */
    int a = 10; //实际上是：static final int age = 10;

    //测试接口中的抽象方法
    void eat();
    /** Java 8 版本之前，接口中的方法都是抽象方法,所以接口中的public和abstract可以简写 */
    void play();
    /** Java 8 版本之后添加了默认方法和静态方法 */
    //默认方法要写default修饰符，否则会认为是一个普通方法，所以接口中不允许使用普通方法
    default void sleep() {
        System.out.println("放假就回家");
    }
    //静态方法
    static void study() {
        System.out.println("学Java");
    }
}

//创建接口的实现类
class UserInterImpl implements UserInter {
    int b = 100;
    //创建构造方法
    /** 如果一个类没有明确指定它的父类，那么它默认继承顶级父类Object */
    public UserInterImpl() {
        super(); /** 此处调用的是父类的无参构造，是Object的无参构造 */
        System.out.println("我是接口实现类的无参构造");
    }

    @Override
    public void eat() {
        System.out.println("放假");
    }

    @Override
    public void play() {
        System.out.println("回家");
    }
}