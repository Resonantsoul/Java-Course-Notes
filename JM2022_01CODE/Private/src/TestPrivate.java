/**本类用于测试封装的必要性*/
public class TestPrivate {
    public static void main(String[] args) {
        //创建一个用户类的对象
        User u = new User();
        //修改对象的属性
        u.name = "张三";
       // u.money = 10;
        //查看修改后的属性值
        System.out.println(u.name);
        //System.out.println(u.money);
        //调用两个方法查看和修改属性值
        u.setMoney(10);
        System.out.println(u.queryMoney());
    }
}
//创建一个用户类
class User {
    //定义用户类的属性
    String name;
    //封装属性--通过private关键字封装属性
    private double money;
    //提供方法1 查询当前账户的余额
    public double queryMoney() {
        return money;
    }
    //提供方法2 修改当前账户的余额
    public void setMoney(double money) {
        this.money = money;
    }

}
