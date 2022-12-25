/**本类用于测试方法的封装*/
public class TestPrivate2 {
    public static void main(String[] args) {
        //创建苹果类对象
        Apple a = new Apple();
        //调用对象的方法
        a.clean();
        //封装报错
        //a.eat();

    }
}
//创建苹果类
class Apple{
    //定义方法1
    public void clean() {
        System.out.println("洗苹果");
        //在已有的公共方法clean()中调用被封装的eat()方法的功能
        eat();
    }
    //定义方法2
    //封装eat方法--把public修饰符改为private修饰符
    private void eat() {
        System.out.println("吃苹果");
    }
    //定义方法2
}