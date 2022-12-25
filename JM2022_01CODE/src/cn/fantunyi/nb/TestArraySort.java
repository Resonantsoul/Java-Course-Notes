package cn.fantunyi.nb;

import java.util.Arrays;

/**本类用于冒泡排序*/
/**使用两层嵌套for循环，最外面for是执行多少轮，内层是每轮相邻两个数对比多少次*/
public class TestArraySort {
    public static void main(String[] args) {
        /**案例：给一个数组从小到达排序
         * 需求；把小的数往前挪，大的数往后挪
         * 分析：1.这个数组需要执行的轮数是长度-1
         *      2.这个数组每轮对比都是把最大值往后挪
         *      3.因此每一轮都要从最开始开始对比，把最大值往后挪*/
        //定义一个数组
        int [] arr = {4,2,8,1,6,3,0};
        int a = 1;
        //使用for循环去执行对比
        //数组的下标是从0开始，数组的最大下标值为length-1
        //第一轮对只对比6次，因此循环也只能是6次，所以i<当前下标的最大值
        for (int j = 0; j < arr.length-1; j++) {
            //使用嵌套for循环
            //控制轮数 = length-1
            System.out.println("第"+a+"轮：");
            a++;
            for (int i = 0; i < arr.length-1; i++) {
                //使用if语句来判断当前两位数谁大谁小
                //小的往前挪，大的往后挪
                if (arr[i] > arr[i + 1]) {
                    //定义第三个变量，把大的数交给第三个变量来保存
                    //把大的数往后挪，小的数往前挪
                    int b = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = b;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}

