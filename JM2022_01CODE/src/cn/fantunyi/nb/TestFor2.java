package cn.fantunyi.nb;

public class TestFor2 {
    /**案例：求1-100以内的和*/
    public static void main(String[] args) {
        int j = 0;
        for (int i = 1;i <= 100;i++) {
            j = i+j;
        }
        System.out.println("1~100的总和："+ j);

        int b = 0;
        for (int a = 0 ; a <= 100; a++) {
            if (a%2 == 0) {
                b+=a;
            }
        }
        System.out.println("1~100以内偶数的和："+b);

        int c = 0;
        for (int a = 0 ; a <= 100; a=a+2) {
           c+=a;
        }
        System.out.println("1~100以内偶数的和："+c);

        int d = 0;
        for (int e = 1; e <= 100; e=e+2) {
            d+=e;
        }
        System.out.println("1~100以内奇数的和："+d);

        int f = 0;
        for (int g = 2 ; g<= 100; g=g+2) {
            f++;
        }
        System.out.println("1~100以内偶数的个数："+f);

        int h = 0;
        for (int l = 1;l<=100;l+=2) {
            h++;
        }
        System.out.println("1~100以内奇数的个数："+h);
    }
}
