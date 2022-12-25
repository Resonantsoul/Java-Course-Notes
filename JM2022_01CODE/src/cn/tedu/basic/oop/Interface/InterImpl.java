package cn.tedu.basic.oop.Interface;
/** 本类作为Inter接口的实现类 */
/** 实现类如果想要实现接口定义的功能，需要与接口建立联系
 * 通过关键字implements来建立实现类，实现接口的关系
 */
/**
 * 方案一：如果实现类与接口建立实现关系以后，
 * 可以选择不实现接口中的抽象方法，把自己变成一个抽象类
 */
//public abstract class InterImpl implements Inter {}
/**方案二：如果实现类与接口建立实现关系后，
 * 还可以选择实现接口中的抽象方法，把自己变成一个普通子类
 */
//    @Override
//    public void eat() {
//        System.out.println("天气冷，适合吃火锅");
//    }
public  class InterImpl implements Inter {
    @Override
    public void eat() {

    }

    @Override
    public void play() {

    }
}
