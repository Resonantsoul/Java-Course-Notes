package cn.fantunyi.nb;

public class TestValueExchange {
    public static void main (String[] args) {
        int a = 3;
        int b = 7;
        a = a + b;  // a = 3 + 7 = 10
        b = a - b;  // b = 10 - 7 = 3
        a = a - b;  // a = 10 - 3 =7
        System.out.println("a的值："+a);
        System.out.println("b的值："+b);

    }
}
