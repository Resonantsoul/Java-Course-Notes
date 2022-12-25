import javax.tools.JavaCompiler;

/**本类用于练习OOP的第一大特性：封装*/
public class TestPrivate1 {
    public static void main(String[] args) {
        //创建学生类对象
        Student s = new Student();
        //通过对象修改并查看属性
        s.sno = 2002401;
        //未封装通过变量直接调用
        s.setName("黄飞鸿");
        s.setSubject("数学");
        System.out.println(s.sno);
        System.out.println(s.getName());
        System.out.println(s.getSubject());
        //通过对象调用方法
        s.eat();
        s.sleep();
        s.study();
    }
}
//创建一个学术类Student
class Student {
    //特征：学号sno 姓名name 科目subject
    //封装属性--用private修饰
    int sno;
    //提供被封装属性的方法
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        /**当局部变量与成员变量同名时
         * 使用this指向的就是成员变量*/
        this.name  = name;
    }

    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    //功能：吃饭 睡觉 学习
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public void study() {
        System.out.println("学习");
    }
}
