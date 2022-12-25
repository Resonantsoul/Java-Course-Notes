package cn.tedu.basic.oop.Constructor;
/**本类用于测试面向对象三大特性之继承*/
public class TestExtends {
    public static void main(String[] args) {
        //创建对象进行测试
        Animal a = new Animal();
        Cat1 c = new Cat1();
        Dingdang d = new Dingdang();
        a.eat();
        //爷爷类调用自己的方法
        c.eat();
        //爸爸类调用爷爷的方法 爸爸继承爷爷的方法
        d.eat();
        //孙子类调用爸爸类的方法 孙子继承爸爸的方法
        //调用孙子类特有的方法
        d.studyJava();
        /**父类不能调用子类特有的方法*/
    }
}
//创建一个爷爷类--动物类
class Animal {
    //定义一个普通方法
    public void eat() {
        System.out.println("小动物吃啥都行");
    }
}

//创建一个爸爸类--小猫类
class Cat1 extends Animal {
    int a = 10;
    private int b = 20;
}

//创建一个孙子类--Dingdang
class Dingdang extends Cat1 {
    public void studyJava() {
        System.out.println("正在学习Java");
        System.out.println(a);
        /**子类不可以使用父类的私有资源，原因是自由资源不可见
         * 但是一定要注意：继承相当于子类把父类的所有功能都复制一遍，包括私有资源
         *
         * */
        //System.out.println(b);
        //父类的私有资源不可见，因此不可使用

    }
}
