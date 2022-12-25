public class TestCat {
    public static void main(String[] args) {
        //创建小猫类对象
        //当手动写了含参构造或全参构造，那么系统提供的无参构造就会被覆盖
        Cat c = new Cat();//调用无参构造
        c.name = "小昊";
        c.age = 3;
        c.color = "橘黄色";
        //创建第二个对象，当对象创建完成时，名字就已经赋值完毕
        Cat c1 = new Cat("加菲");
        //创建第三个对象，当对象创建完成时，所有属性都赋值完毕
        Cat c2 = new Cat("加菲",2,"绿色");

    }
}
//创建一个小猫类Cat
class Cat {
    //属性-成员变量
    String name;
    int age;
    String color;

    //方法
    public void eat() {
        System.out.println("吃毛粮");
    }

    //创建构造方法
    //无参构造
    public Cat() {

    }
    //含参构造
    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name,int age,String color ) {
        this.name = name;
        this.age = age;
        this.color =color;
    }
}
