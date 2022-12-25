package cn.fantunyi.nb;
/**本类用于测试单分支，多分支结构*/
public class TestIf {
    //1.程序的入口
    public static void main(String[] args) {
        /**1.单分支结构:if(判断条件){当if的判断条件满足时才执行的内容}*/
        if(3>2) {
            System.out.println("我是单分支结构");
        }
        int a = 3;
        if (a>2) {
            System.out.println("我是单分支结构");
        }

        /**多分支结构域：if(判断条件){当前面的判断条件满足时执行}else{当前面的判断条件不满足时执行}*/

        if(3>5) {
            System.out.println("我是if语句的");
        }else{
            System.out.println("我是else语句的");
        }

        int z = 5;
        int y = 10;
        /**if(判断语句)，当判断语句为true的时候，执行if的{}，如果判断语句为假false的时候，执行false的{}*/
        if (z>y) {
            System.out.println("那么z最大");
        }else{
            System.out.println("那么y最大");
        }



    }
}
