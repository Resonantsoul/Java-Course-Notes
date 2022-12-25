package cn.fantunyi.nb;

public class TestFor3 {
    public static void main(String[] args) {
        /**嵌套for循环，第一层for循环叫外层循环，控制打印多少行
         * 第二层for循环叫做内层循环，控制打印多少列
         * for循环的小括号里面的三个条件，可以根据需求去写，开始条件可以不写，但是要在for循环外面定义，然后调用
         * 循环条件和更改条件可以不写，但是会形成死循环*/
        for (int i =1;i<=9;i++) {
            for (int j = 1;j<=i;j++) {
                System.out.print(j+"*"+i+"="+i*j);
                if (i*j>=10){
                    System.out.print(" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------");

        for (int i =9;i>=1;i--) {
            for (int j = 1;j<=i;j++) {
                System.out.print(j+"*"+i+"="+i*j);
                if (i*j>=10){
                    System.out.print(" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("--------------------------------------------------------------");

        for (int i =9;i>=1;i--) {
            for (int j = 9;j>=i;j--) {
                System.out.print(j+"*"+i+"="+i*j);
                if (i*j>=10){
                    System.out.print(" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
