package cn.fantunyi.nb;

public class TestMethodOverload {
    /**方法重载的定义:在同一个类中定义多个方法名相同，但是参数列表不同
     * (指参数的个数和类型不同，个数相同但是类型先后顺序不同也是重载)*/
    //定义一个method方法，用来接收一个int类型的参数
    public  void method(int a) {
        System.out.println(a);
    }
    //定义一个method方法，用来接收两个int类型的参数
    public void method (int a,int b) {
        System.out.println(a+","+b);
    }
    //重载method方法,参数列表一个为String类型，一个为int类型
    public void method(String a ,int b) {
        System.out.println(a+","+b);
    }
    //类型的先后顺序不同也是重载的
    public void method(int a,String b) {
        System.out.println(a+","+b);
    }
}
