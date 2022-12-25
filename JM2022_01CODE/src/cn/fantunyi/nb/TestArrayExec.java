package cn.fantunyi.nb;
/**本类用于练习数组*/
public class TestArrayExec {
    public static void main(String[] args) {
        //案例：输出一年中每个月份的天数
        //创建数组用来存储12个月的天数
        int a[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        //输出每个月的天数打印到控制台
        //数组想要遍历--通过循环的方式
        //循环开始:a[0]--数组第一个元素
        //循环结束:a[11]--length-1
        for (int i = 0; i <= a.length-1; i++) {
            //打印每个月份有几天
            //i的值可以作为数组的下标
            //a[i]根据下标i来获取数组a中对应位置上的元素值
            System.out.println((1+i)+"月有：" +a[i]+"天");
        }
    }
}
