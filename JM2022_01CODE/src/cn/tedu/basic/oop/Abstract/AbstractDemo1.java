package cn.tedu.basic.oop.Abstract;
/**本类用于抽象类不能实例化和构造函数的测试
 * 实例化：创建对象*/
/**抽象类是否有构造函数
 * 既然抽象类不能实例化，为什么要有构造方法
 * 不是为了自己使用，而是为了子类创建对象时使用super();*/
public class AbstractDemo1 {
    public static void main(String[] args) {
        //Animal a = new Animal();
        //创建子类对象进行测试
        Pig p = new Pig();
    }
}

//创建抽象父类Animal
abstract class Animal {
    //创建构造函数
    public Animal() {
        System.out.println("我是Animal的无参构造");
    }
}

//创建子类Pig
class Pig extends Animal {
    //创建构造方法
    public Pig() {
        super();//表示调用父类的无参构造
        System.out.println("我是Pig的无参构造");
    }
}
