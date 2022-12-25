package cn.tedu.basic.oop.Static;
/**本类用于测试静态中this和 super的使用*/
public class TestStatic2 {
    public static void main(String[] args) {
        //创建子类对象并测试方法
        Son s = new Son();
        s.Play();
        s.eat();
    }
}
//创建父类
class Father {
    //定义属性
    int sum = 10;
    int a = 666;
    //定义方法
    public void Play() {
        System.out.println("玩");
    }

}

//创建子类
class Son extends Father {
    //定义属性
    int sum = 100;
    @Override
    public void Play() {
        int sum = 1000;
        System.out.println(sum);
        //打印子类的成员变量
        System.out.println(this.sum);
        //打印父类的成员变量
        System.out.println(super.sum);
    }

    //创建静态方法
    public static void eat() {
        int sum = 1;
        System.out.println(sum);
        //打印子类的成员变量
        //System.out.println(this.sum);
        /**静态资源中不能使用this*/
        //打印父类的成员变量
        //System.out.println(super.sum);
        /**静态资源中不能使用super*/
    }
}
