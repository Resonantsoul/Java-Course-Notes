package cn.fantunyi.nb;

import java.util.Arrays;

/**本类用于练习数组的创建和使用*/
/**数组的定义；动态初始化，静态初始化
 *           动态初始化其实就是指定长度
 *           静态初始化其实就是指定内容
 *           查看数组当前的具体值，需要使用Arrays.toString
 *           查看数组当前的长度，使用.length
 *           查看数组当前的下标最大值，使用.length-1
 *           */
public class TextCreateArray {
    public static void main(String[] args) {
        //动态初始化
        int a[] = new int[5];//后面int[5]代表的是定义数组的长度为5，并且初始化为当前类型的默认值
        //输出打印a
        System.out.println(Arrays.toString(a));
        //打印数组a中的具体值，需调用Arrays里的toString方法
        //定义一个数组
        int[] b;
        b = new int[6];
        //第一种静态初始化
        int[] c = {2,5,6,8,7,9};
        //通过下标读取数组的值
        System.out.println(c[5]);
        //第二种静态初始化
        int d[] = new int[]{2,5,8,4,6,3};
        //打印
        System.out.println(Arrays.toString(d));
        //打印长度
        System.out.println(d.length);
        //下标等于最大值减一
        System.out.println(d.length);

    }
}
