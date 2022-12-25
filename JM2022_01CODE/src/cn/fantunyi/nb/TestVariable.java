package cn.fantunyi.nb;

public class TestVariable {
    /**成员变量
     * 位置：在类里方法外
     * 生命周期：在整个类中，随着类的调用而存在，当类消失时被释放
     * 注意 成员变量没有初始化赋值时 会自动初始化为默认值
     * 默认值 整型为0 浮点型为0.0 字符型为null 布尔型为false*/
    //定义整型的成员变量
    static byte b; //因为要在静态方法中调用，因此声明为静态变量
    static short s;
    static int i;
    static long l;
    //定义浮点，字符布尔类型的成员变量
    static float f;
    static double d;
    static char c;
    static boolean B;
    public static void main(String[] args) {
        /**局部变量
         * 位置：方法里或者方法的声明上
         * 生命周期：随着方法的调用而存在，方法运行完毕就释放
         * */
        //定义整数的局部变量
        byte b1;
        short s1;
        int i1;
        long l1;
        //打印
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(B);
        
    }
}
