package cn.tedu.basic.oop.Static;
/**本类用于final的入门案例*/
public class TestFinal {
    public static void main(String[] args) {
        //创建父类的对象
        Father1 f = new Father1();
        f.play();
        //创建子类的对象进行测试
        Son1 s = new Son1();
        s.play();
    }
}
/**final可以修饰类，被修饰后不能被继承，因为是最终类*/
//创建父类
//final class Father1 {}
class Father1 {
    //定义属性
    /** final可修饰属性，修饰后叫做常量，因为常量的值不能被修改
     *  注意事项：常量定义时必须赋值
     * */
    final String name = "周杰伦";
    //定义普通方法
    /** final可以修饰方法，修饰后是方法的最终实现，子类不能重写 */
    final public void play() {
        //name = "陈昊燃"; final修饰属性后，值不能被修改
        System.out.println(name);
        System.out.println("爱玩");
    }
}

//创建子类并继承父类
class Son1 extends Father1 {
    //重写父类的方法
    //报错原因：父类用final修饰了该方法，所以子类不能重写
    //@Override
    //public void play() {
    //     System.out.println("爱玩原");
    //}
}
