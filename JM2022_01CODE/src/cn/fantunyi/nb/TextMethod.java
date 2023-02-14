package cn.fantunyi.nb;
/** 本类用于练习方法的创建和重载*/
public class TextMethod {
    /**方法的五要素:修饰符 返回值类型 方法名(参数列表) {方法体}*/
    //创建一个人method方法,模拟百度翻译，定义String类型的参数
    /**没有static修饰发的方法叫普通方法，要等静态方法加载完再加载*/
    public static String method(String a) {
        if (a == "void") {
            return "无效的;缺乏;没有;空的;空空如也";
        }else if (a == "public"){
            return "公共的";
        }
        return a;
    }
    //创建main方法入口函数来调用method方法
    /**被static修饰的方法叫静态方法，优于普通方法加载*/
    public static void main(String[] args) {
        //调用method方法，调用方式：方法名(是否传参数)
        method("void");//想要在静态方法中调用普通方法，就要把普通方法变成静态方法
        //方法如果返回某个值，想要能够直接看到，就要写在打印语句中
        System.out.println(method("void"));
        System.out.println(method("public"));


    }
}
