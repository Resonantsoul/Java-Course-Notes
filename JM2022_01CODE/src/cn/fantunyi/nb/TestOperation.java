package cn.fantunyi.nb;

public class TestOperation {
    public static void main(String[] args) {
        int a = 1 + 1; //算数运算符
        int b = 2;
        //比较运算符
        if (a == b) {
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }

        System.out.println(159%10);
        System.out.println(159/30);
        System.out.println(159/100);

        //后缀：先执行，再运算
        int c = 2;
        System.out.println(c++); //2
        System.out.println(c);  //3

        int d = 2;
        System.out.println(d--);  //2
        System.out.println(d);  //1

        //前缀：先运算，再执行
        System.out.println(++c); //4
        System.out.println(c); //4

        System.out.println(--d); //0
        System.out.println(d); //0


        
    }
}
