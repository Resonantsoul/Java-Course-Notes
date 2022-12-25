package cn.fantunyi.nb;

import java.util.Arrays;

/**本类用于练习数组*/
public class TestCreateArray1 {
    //动态初始化并自动赋值
    //动态初始化，长度为5
    public static void main(String[] args) {
        int a [] = new int[5];
        //把数组a里面的5个0换成1,2,3,4,5
        //使用for遍历
        for (int i = 0; i <= a.length-1;i++) {
            //把a数组里面的值改为1,2,3,4,5
            a[i] = i+1;
        }
        //输出数组a
        System.out.println(Arrays.toString(a));
    }
}
