package cn.tedu.basic.oop.Extends;

import javax.jws.HandlerChain;

/**本类用于继承中方法的重写*/
public class ExtendsOverride {
    public static void main(String[] args) {
        //创建对象进行测试
        Father1 f = new Father1();
        Son1 s = new Son1();
        f.eat();
        f.play();
        s.eat();
        s.play();
    }
}
//创建父类
class Father1 {
    //在父类中定义普通方法
    public void eat() {
        System.out.println("爸爸爱吃肉");
    }

    public void play() {
        System.out.println("爸爸爱放风筝");
    }

}
//创建子类并继承
class Son1 extends Father1 {
    //如果子类对父类的方法不满意，可以重写父类的方法
    /**重写的原则：两同，两小，一大
     * 两同：子类方法的方法名和参数列表 与父类发方法名和参数列表相同
     * 两小：子类方法的返回值类型小于等于父类方法的返回值类型
     * 注意：这里所说的小于等于是指子类方法的返回值类型是父类返回值类型的子类
     *      或者可以选择与父类的返回值类型一致，如果父类方法的返回值类型是void，子类保持一致即可
     * 子类抛出的异常类型要小于等于父类抛出的异常类型
     * 一大：子类方法的方法修饰符权限 大于等于 父类方法的修饰符权限
     * */
    @Override //注解  标记 作用：用来加在方法上。表示这里是一个重写的方法
    public void eat() {
      System.out.println("儿子爱吃海鲜");
    }

    @Override
    public void play() {
        System.out.println("儿子爱玩游戏");
    }
}

