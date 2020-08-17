package Inheritance.Class05Practice;

import java.util.ArrayList;

/* 群主发红包。某群有多名成员，群主给成员发红包。
    红包的规则：
    1. 群主的一笔金额，从群主余额中扣除，随机分成n等份，让成员领取。
    2. 成员领取红包后，保存到成员余额中。
    请根据描述，完成案例中所有类的定义以及指定类之间的继承关系，并完成发红包的操作。*/
public class RedPackets {
    public static void main(String[] args) {
        Manager manager = new Manager("Manager", 100.00);
        Member[] members = new Member[5];
        for (int i = 0; i < members.length; i++) {
            members[i] = new Member();//注意需要申请空间，否则会出现空指针异常错误
            members[i].setMoney(0.00);
            members[i].setName(Character.toString(65 + i));
        }

        ArrayList<Double> packet = manager.send(68.8, 5);
        double all = 0.00;

        for (int i = 0; i < members.length; i++) {
            members[i].receive(packet);
            double money = members[i].getMoney();
            all = all + money;
            System.out.println(members[i].getName() + ": " + Math.round(money * 100) / 100.0);
        }

        //验证是否为分发出去的金额，确认算法正确性
        System.out.println(manager.getName() + ": " + manager.getMoney());
        System.out.println("All: " + all);
    }
}
