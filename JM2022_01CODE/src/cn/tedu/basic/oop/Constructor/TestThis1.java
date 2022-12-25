package cn.tedu.basic.oop.Constructor;
/**本类用于this的测试2*/
public class TestThis1 {
    public static void main(String[] args) {
        //创建对象，触发无参构造
        //Dog d = new Dog();
        //System.out.println(d.name);
        //创建对象，触发含参构造
        Dog d1 = new Dog("小黑");
        
    }
}

//创建小狗类
class Dog {
    //成员变量
    String name;
    int age;
    //创建无参构造
    //创建含参构造

    public Dog() {
        //在无参构造中调用含参构造的功能
        //注意：调用是单向的，不能来回双向调用，否则会死循环
        //this("小黑");
        System.out.println("无参构造");
    }

    public Dog(String name) {
        //含参构造中调用无参构造
        //规定：this关键字调用构造方法必须在第一行
        this();
        this.name = name;
        System.out.println("含参构造");
    }
}
