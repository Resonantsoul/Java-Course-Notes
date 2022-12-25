package cn.fantunyi.nb;

import java.util.Scanner;

public class TestDiscount {
    //程序的入口
    public static void main(String[] args) {
        /**嵌套分支结构
         * if(判断条件1) {
         *     判断条件1满足时执行
         * }else if(判断条件2) {
         *     判断条件2满足时执行
         * }else if(判断条件3) {
         *     判断条件3满足时执行
         * }else {
         *     当上面所有的条件都不满足时
         * }
         * */

        //商场打折案例：购买金额满500元打9折，满1000元打八折，满1500元打7折
        //提示用户输入价格
        System.out.println("请输入价格：");
        Scanner sc = new Scanner(System.in);
        //用一个变量接收用户输入的价格
        double price = sc.nextDouble();
        //定义一个变量来保存打折后的价格
        double count = price;
        if(price >= 500) {
            count = price * 0.9;
        } else if (price >=1000) {
            count = price * 0.8;
        } else if (price >= 1500) {
            count = price *0.7;
        }else {
            System.out.println("您消费的金额没有达到打折最低金额");
        }
        System.out.println("打折后价格:"+count+"元");
    }
}
