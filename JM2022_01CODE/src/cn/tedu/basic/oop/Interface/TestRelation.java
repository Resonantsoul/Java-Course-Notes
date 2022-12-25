package cn.tedu.basic.oop.Interface;
/** 本类用于测试接口与类之间的复杂关系 */
public class TestRelation {
}
//创建接口Inter1
interface Inter1 {
    void add();//添加功能
    void delete();//删除功能
}
//创建接口Inter2
interface Inter2 {
    void find();//查询功能
    void update();//更新功能

}
//创建接口Inter3
/** 接口之间可以建立继承关系，而且可以多继承，多个继承用逗号隔开 */
interface Inter3 extends Inter1,Inter2 {

}
//创建接口实现类InterImpl1 实现接口Inter1
/** 接口与类之间是实现关系，通过interface建立实现关系
 * 注意：对于Java的类而言，遵循"单继承，多实现"
 * 也就是说，一个子类只能有一个父类，但是一个类可以实现多个接口
 * */
class InterImpl1 implements Inter1,Inter3 {

    @Override
    public void add() {
        System.out.println("请稍等...正在删除");
    }

    @Override
    public void delete() {
        System.out.println("请稍等...正在删除");
    }

    @Override
    public void find() {
        System.out.println("正在查询");
    }

    @Override
    public void update() {
        System.out.println("正在更新");
    }
}