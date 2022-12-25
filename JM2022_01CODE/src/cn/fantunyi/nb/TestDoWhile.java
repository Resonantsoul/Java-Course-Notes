package cn.fantunyi.nb;
import java.util.Random;

/**for:知道循环次数使用
 * while/do while当前循环次数不确定时使用
 * while:先判断，不符合规则，就不执行
 * do while: 代码最少执行一次，再去判断，符合规则，再次执行
 * 循环之间都可以互相替代，但是一般最好选择合适的循环结构完成代码*/
public class TestDoWhile {
    public static void main(String[] args) {
        /**da-while循环结构：
         * do{
         *    循环体
         * } while(执行条件)*/
        //定义变量a
        int a = 1;
        do {
            System.out.println("执行一次");
            a++;
        } while(a <= 5);

        int b = 0;
        while(true){
            int g = new Random().nextInt(200);
            int m = new Random().nextInt(200);
            int x = new Random().nextInt(200);
            if(g*3+m*5+3*x*1 <= 100 && g+m+x == 100) {
                b++;
                System.out.println("有"+b+"种买法");
            }
        }
    }
}
