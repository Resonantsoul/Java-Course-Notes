/**本类用于面向对象的巩固练习*/
public class TestCar {
    public static void main(String[] args) {
        //创建汽车类对象c
        Car c = new Car();
        //通过汽车类对象c设置属性
        //c.color = "暗夜紫";
        //c.brand = "BMB";
        //c.price = 200000;
        //c.length = 3;
        //查看刚刚设置好的属性值
        //System.out.println(c.color);
        //System.out.println(c.brand);
        //System.out.println(c.price);
        //System.out.println(c.length);
        //通过c对象调用汽车类的方法
        c.start();
        //c.stop();
        //调用提供的set与get方法，设置并获取对应属性的值
        c.setColor("宝石蓝");
        c.setBrand("特斯拉");
        c.setPrice(300000);
        c.setLength(3);
        System.out.println(c.getBrand());
        System.out.println(c.getColor());
        System.out.println(c.getPrice());
        System.out.println(c.getLength());
        //通过公共方法来实现私有方法功能的使用
        c.start();

    }
}
//抽象汽车这一类事物的属性和方法，封装成一个类的组件
class Car {
    //属性用成员变量来描述
    private String color;
    private String brand;
    private double price;
    private double length;
    //快捷方式 右键Generate选择Getter和Setter，选择需要的属性调用get和set方法
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //功能--用方法来描述
    //可以在本类的公共方法中调用私有方法
    public void start() {
        System.out.println("汽车启动了");
        stop();
    }

    //通过private封装
    private void stop() {
        System.out.println("汽车停止了");
    }
}
