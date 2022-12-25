package cn.tedu.basic.oop.Static;

import com.sun.corba.se.impl.presentation.rmi.StubFactoryDynamicBase;

/**本类用于static的入门案例*/
public class TestStatic {
    public static void main(String[] args) {
        /**静态资源可以被类名直接调用*/
        /**静态资源是优先于对象进行加载，随着类的加载而加载*/
        //使用类名直接调用静态资源
        System.out.println(Student.name);
        Student.study();

        //创建对象进行测试
        Student s = new Student();
        //idea 不提示通过创建对象调用静态属性和静态方法
        s.study();
        s.name = "小明";
        s.gender = "男";
        s.id = 2125083004;
        s.age = 18;
        System.out.println(s.name);
        System.out.println(s.gender);
        System.out.println(s.id);
        System.out.println(s.age);
        //创建第二个对象并打印
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.gender);
        System.out.println(s1.id);
        System.out.println(s1.age);
        /**静态资源被全局所有对象共享，且只有一份*/
        s1.name = "雪";
        System.out.println(s.name);
        System.out.println(s1.name);
    }
}
//创建学生类
class Student {
    /**static静态可以把普通资源修饰为静态资源*/
    //定义属性
    //把普通成员变量修饰为静态成员变量
    static String name;
    String gender;
    int id;
    int age;
    //定义方法
    /**static静态可以用来修饰成员变量和方法，一般写在修饰符之后*/
    //把普通方法修饰成静态方法
    public static void study() {
        System.out.println("使劲学");
    }

    public void speak() {
        System.out.println("说");
    }
}
