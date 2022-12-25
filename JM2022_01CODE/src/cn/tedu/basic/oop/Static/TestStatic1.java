package cn.tedu.basic.oop.Static;

/**本类用于测试静态的调用关系*/
/**普通资源可以调用普通资源和静态资源
 * 静态资源只可以调用静态资源
 * */
public class TestStatic1 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.Teach();//调用普通方法
        t.eat();//调用静态方法
    }
}
//创建老师类
class Teacher {
    //定义普通资源
    //定义普通属性
    String name;
    //定义普通方法Teach
    public void Teach() {
        //普通资源可以调用静态资源
        System.out.println(age);//普通资源能调用静态属性
        eat();//普通资源能调用静态方法
        System.out.println("教学");
    }

    //定义静态资源
    //定义静态属性
    static int age;
    static String gender;

    //定义静态方法
    public static void eat() {
        //在静态资源中不能调用普通资源
        //Teach();
        //System.out.println(name);;
        System.out.println("吃饭");
    }

    public static void sleep() {
        /**静态资源可以调用静态资源*/
        System.out.println("睡觉");
        System.out.println(age);
        eat();
    }
}

//创建学生类
class Student1 {

}
