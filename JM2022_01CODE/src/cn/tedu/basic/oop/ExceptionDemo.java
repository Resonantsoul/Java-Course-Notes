package cn.tedu.basic.oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        //method();//用来捕获异常
        //method1();
        //method2();
        /**一般我们会在异常抛给main方法之前解决*/
        method3();//用来处理method2向上抛出的异常

    }
    private static void method3() {
        //解决方式:使用try-catch
        try {
            method2();
        } catch (Exception e) {
            System.out.println("请正确输入");
        }
    }

    private static void method() {
        //要求：输入两个整数，然后计算两个数相除
        System.out.println("请输入第一个数");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个数");
        int b = new Scanner(System.in).nextInt();
        //计算整数相除
        System.out.println("a/b="+a/b);
    }
    private static void method1() {
        /**捕获处理结构：try-catch*/
        try {
            System.out.println("请输入第一个数");
            int a = new Scanner(System.in).nextInt();
            System.out.println("请输入第二个数");
            int b = new Scanner(System.in).nextInt();
            //计算整数相除
            System.out.println("a/b="+a/b);
        } catch (InputMismatchException in) {
            System.out.println("输入不匹配");
        } catch (ArithmeticException a) {
            System.out.println("除数不能为0");
        } catch (Exception e) {
            System.out.println("请正确输入!");
        }
    }

    //向上抛出异常
    /**向上抛出：throw 异常类型
     * 注意：要写在方法上小括号和大括号之间
     * */
    //private static void method2() throws InputMismatchException,ArithmeticException,Exception {
    private static void method2() throws Exception {
        System.out.println("请输入第一个数");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个数");
        int b = new Scanner(System.in).nextInt();
        //计算整数相除
        System.out.println("a/b="+a/b);
    }
}
