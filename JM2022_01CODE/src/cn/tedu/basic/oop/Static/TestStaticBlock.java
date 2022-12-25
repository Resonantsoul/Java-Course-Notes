package cn.tedu.basic.oop.Static;
/**本类用于测试静态代码块的执行*/
/**执行顺序：
 * 1 静态代码块
 * 2 构造代码块
 * 3 构造方法（对象创建成功）
 * 4 局部代码块*/
public class TestStaticBlock {
    public static void main(String[] args) {
        //创建对象进行测试
        Person p = new Person();
        Person p1 = new Person();
        //触发局部代码块
        p.play();
    }
}

class Person {
    //创建构造代码块
    /**位置：类里方法外
     * 执行时间：每次创建对象时执行
     * 作用：用于提取所有构造方法的共性代码
     * */

    {
        System.out.println("构造代码块");
    }

    /**静态代码块
     * 位置：类里方法外
     * 执行时机：静态代码块也属于静态资源，随着类的加载而加载，优先于对象加载
     *          并且静态代码块只会加载一次
     * 作用：用于加载那些第一时间就需要加载，并且只加载一次的资源
     * */

    static {
        System.out.println("静态代码块");
    }
    //构造方法
    //无参构造
    public Person() {
        System.out.println("无参构造");
    }

    //创建普通方法
    public void play() {
        System.out.println("普通方法");
        /**局部代码块
         * 位置：方法里
         * 执行时机：随着局部代码块所在的方法调用时才会执行
         * 作用：限制变量的作用范围
         * */
        {
            System.out.println("局部代码块");
        }
    }
}