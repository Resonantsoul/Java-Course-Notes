package cn.tedu.basic.oop.Constructor;

/**本类用于测试构造方法*/
public class TestConstructor {
    public static void main(String[] args) {
        //创建person类对象测试
        /**每次new(实例化)对象时，都会自动触发对应类的构造方法
         * 每一个类都会默认存在一个没有参数的构造方法*/
        //创建第一个对象
        Person p = new Person();
        System.out.println(p.name);
        System.out.println(p.age);
        System.out.println(p.address);
        //创建第二个对象
        //当创建好这个对象时，对象的名字就已经赋值好
        Person p1 = new Person("张三");
        System.out.println(p1.name);
        //创建第三个对象，当对象创建完成时，对象的所有属性已经赋值好
        Person p2 = new Person("张三",18,"地球");
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.address);
        p2.eat();
    }
}

//创建person类，用来描述人这一类事物
class Person {
    //属性--成员变量
    String name; //姓名
    int age; //年龄
    String address; //住址
    //3.功能--方法

    //无参构造
    //当没有写无构造方法时，系统会自己生成无参构造方法
    public Person() {
        System.out.println("无参构造");
    }
    //含参构造
    public Person(String name) {
        this.name = name;
        System.out.println("含参构造");
    }
    //全参构造
    public Person(String name,int age,String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("全参构造");
    }

    public void eat() {
        System.out.println("马上吃饭了");
    }
}
