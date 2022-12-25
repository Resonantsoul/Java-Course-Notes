package cn.fantunyi.nb;
/**本类用于八大类型的基本数据类型*/

public class TextTypeScope {
    /**1.程序的入口函数*/
    public static void main (String[] args) {
        /**1.整数型：byte,short,int,long
         * 2.Java的八大基本类型都提供了对应的"工具箱"
         * 3.int类型的工具箱比较特殊*/

        /**定义对应类型的变量：格式：类型 名字 = 值*/

        byte byteMin = Byte.MIN_VALUE;
        /** 调用byte类型的最小值*/
        System.out.println("byte的最小值："+ byteMin);

        byte byteMax = Byte.MAX_VALUE;
        /**调用byte类型的最大值*/
        System.out.println("byte的最大值："+ byteMax);

        short shortMin = Short.MIN_VALUE;
        /**调用short类型的最小值*/
        System.out.println("short类型的最小值："+shortMin);

        short shortMax = Short.MAX_VALUE;
        /**调用short类型的最大值*/
        System.out.println("short类型的最大值："+shortMax);

        int intMin = Integer.MIN_VALUE;
        /**调用ing类型的最小值*/
        System.out.println("int类型的最小值："+intMin);

        int intMax = Integer.MAX_VALUE;
        /**调用int类型的最大值*/
        System.out.println("int类型的最大值："+intMax);

        long longMin = Long.MIN_VALUE;
        /**调用long类型的最小值*/
        System.out.println("long类型的最小值："+longMin);

        long longMax = Long.MAX_VALUE;
        /**调用lonbg类型的最大值*/
        System.out.println("long类型的最大值："+longMax);

        /**浮点型:float,double*/
        float floatMin = Float.MIN_VALUE;
        /**调用float的最小值*/
        System.out.println("float类型的最小值："+floatMin);

        float floatMax = Float.MAX_VALUE;
        /**调用float类型的最大值*/
        System.out.println("float类型的最大值："+floatMax);

        double doubleMin = Double.MIN_VALUE;
        /**调用double的最小值*/
        System.out.println("double类型的最小值："+doubleMin);

        double doubleMax = Double.MAX_VALUE;
        /**调用double的最大值*/
        System.out.println("double类型的最大值："+doubleMax);

        long a = 3000000000l;
        long b =321;
        /**ing 类型比long类型小，所以小类型给大类型，自动给*/

        /**4.浮点类型默认类型是double，大类型不能直接给小类型，需要转化成小类型*/

        float c = 0.5f;
        float d = 5;/**整数默认是int类型，int类型小于float，所以直接给*/
        float e = 3000000000l;/**long类型小于float，所以直接给*/
        /**将整数默认的int类型，int类型小于float，但是这个整数超出了本身的int，所以报错
         * 需要进行类型提升，从int转换为float*/
        float i = 3000000000f;

        /**5.布尔类型：boolean*/
        boolean b1 = true;
        boolean b2 = false;

        /**6.字符型：char 数字，字母，汉字（单个，用十进制的数字写就不能超过取值范围）取值范围：0-65535*/
        char c1 = 'a';
        char c2 = '1';
        char c3 = '汉';
        char c4 = 10;




    }
}
