package cn.tedu.basic.oop.Extends;
/**本类用于测试继承中构造方法的使用*/
public class TestExtends2 {
    public static void main(String[] args) {
        //创建子类对象触发无参构造
        Son2 s = new Son2();
        //创建子类对象触发含参构造
        Son2 s1 = new Son2("各位都是弟弟");
    }
}
//创建父类
class Father2 {
    //创建父类的无参构造
    public Father2() {
        System.out.println("我是父类的无参构造");
    }
    //创建父类的含参构造
    public Father2(String s) {
        System.out.println("我是父类的含参构造");
    }

}

//创建子类，并继承父类
class Son2 extends Father2 {
    //创建子类的无参构造
    /**子类的构造方法会默认调用父类的构造方法，没有写调用父类的构造方法时，调用的就是父类的无参构造*/
    public Son2() {
        System.out.println("我是子类的无参构造");
    }

    //创建子类的含参构造
    public Son2(String s) {
        super(s);
        System.out.println("我是子类的含参构造");
    }
}