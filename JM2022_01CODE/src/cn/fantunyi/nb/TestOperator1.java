package cn.fantunyi.nb;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;
public class TestOperator1 {
    public static void main(String[] args) {
        System.out.println(5>4 & 5<4);//false
        System.out.println(10>8 & 12>10);//true
        System.out.println(11>12 & 12>13);//false

        //短路与：
        System.out.println(12>10 && 11>10); //true
        System.out.println(13>12 && 11>12); //false
        System.out.println(10>11 && 12>13); //false
        System.out.println(10>11 && 12>13); //false

        int a = 15;
        System.out.println(a >16 && a++>14);//false
        System.out.println(a);//15

        //练习一
        int x =16;
        System.out.println(x++>15 & x>16);//true
        System.out.println(x);//17

        //练习二
        int x1 = 20;
        System.out.println(++x1 >20 && x1++>21); //false
        System.out.println(x1);//22

        //练习三
        int x2 = 25;
        System.out.println(++x2+x2>51 && x2++>27); //false
        System.out.println(x2);//27

        int x3 = 22;
        System.out.println((x3++)+x3+--x3>22 && ++x3>22);//true
        System.out.println(x3);//23

        //逻辑或：两边结果，只要有一个为true,结果为true
        System.out.println(10>12 | 10>9);//true
        System.out.println(15+2>=16 | 10+2>=12);//true
        System.out.println(10+2>=13 | 10-2>=9); //false

        //短路或：|| 原理与逻辑或相同，但是短路或只要检测到一个结果为true，就停止执行，直接输出结果true
        System.out.println(12>13 || 14>13); //true
        System.out.println(14>13 || 12+5>16); //true
        int i = 5;
        System.out.println(i++>6 || i--<5);//false
        int i1 = 6;
        System.out.println(++i1>6 || ++i1>6);//true

        //练习一
        int z =23;
        System.out.println(++z+5>23 || --z>22);//true
        System.out.println(z);//24

        //练习二
        int z1 = 33;
        System.out.println(z1+2-5>30 || ++z1>33);//true
        System.out.println(z1);//34

        //练习三
        int z2 = 12;
        System.out.println(++z2+z2+2<28 || --z2+2>14);//false
        System.out.println(z2);//12

        //练习四
        int z3 = 15;
        System.out.println(z3+++z3---z3>15 || z3++>15);//true
        System.out.println(z3);//15

        //账户余额：10000
        int y = 10000;
        System.out.println("账户余额：" + y );//这个+不能运算，因为后面是变量，它用作字符串和变量的连接作用

        //非：！，非真既为假，非假即为真
        System.out.println(3>2);//true
        System.out.println(!(3>2));//false

        /**三目运算符：1?2:3  1、判断表达式 2、判断结果为真选择 3、判断结果为假选择
         * 判断表达式？真：假*/
        System.out.println(1>2?1:2);//2
        System.out.println(2>1?1:2);//1

        //练习一
        int b = 10;
        System.out.println(b+2>11?3:0);//3

        //练习二
        int b1 =6;
        System.out.println(b1++>6?1:0);//0

        //练习三
        int b2 = 10;
        System.out.println(++b2+2>12?0:1);//0

        //练习四
        int b3 = 8;
        System.out.println(b3+2-5>5?1.8:2);//2.0
        //所有带小数的数据，java默认类型是double类型，所有的整数数据java默认类型是int类型
        //byte->short->char->int->long->float->double

        int s =2;//=赋值 ， ==比较
        s=s+2;//4
        s=s-2;//2
        s+=2;//4
        s-=2;//2
        s*=2;//4
        s/=2;//2


    }
}
