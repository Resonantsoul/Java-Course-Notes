package cn.tedu.basic.oop.Interface;
/** 本类用于运行测试接口实现类 */
public class InterTest {
    public static void main(String[] args) {
        /** 接口不能实例化 */
        //Inter i = new Inter();
        /** 创建多态对象进行测试--不尝使用(不推荐) */
        Inter i = new InterImpl();
        i.eat();
        i.play();
        /**推荐使用：创建纯纯的接口实现类对象进行测试*/
        InterImpl i2 = new InterImpl();
        i2.eat();
        i2.play();
    }
}
