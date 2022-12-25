package cn.tedu.basic.oop.Polymorphism;

public class TestDemo {
    public static void main(String[] args) {
        //创建父类对象并进行测试
        Animal a = new Animal();
        a.eat();
        //创建子类对象并进行测试
        Cat c = new Cat();
        c.eat();
        c.jump();
        Dog d = new Dog();
        d.eat();
        d.run();
        //创建多态对象
        /** 口诀：父类引用 指向 子类对象 */
        Animal a1 = new Cat();
        Animal a2 = new Dog();
        a1.eat();
        a2.eat();
        /** 多态的出现是为了统一调用标准，子类向父类看齐
         *  父类中定义的功能才能用，子类的特有功能用不了
         * */
        //报错原因：多态对象不能调用子类的特有功能，只能调用父类定义的功能
        //a1.jump();
        //a1.run();
        /** 在多态中，成员变量的使用都是父类的 */
        System.out.println(a1.sum);
        /**在多态中，静态资源是那个类定义的，就用哪个类的静态*/
        a2.play();

    }
}
/** 口诀：多态的前提条件：继承 + 重写
 *  口诀2：编译(定义)看左边 运行看右边
 * */
//创建父类
class Animal {
    //创建父类的成员变量
    //创建父类的普通方法
    int sum = 100;
    public void eat() {
        System.out.println("小动物吃啥都行");
    }
    //创建父类的静态方法
    public static void play() {
        System.out.println("小动物玩啥都行");
    }
}

//创建子类并继承父类
class Cat extends Animal {
    //创建子类的成员变量
     int sum = 200;

    //重写父类eat方法
    @Override
    public void eat() {
        System.out.println("小猫爱吃小鱼干");
    }
    //创建特有的方法
    public void jump() {
        System.out.println("小猫跳的老高了");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("小狗爱吃肉骨头");
    }
    //创建特有方法
    public void run() {
        System.out.println("小狗跑的老快了");
    }
    //创建子类静态方法
    public static void play() {
        System.out.println("小狗爱打滚");
    }
}
