package Inheritance.Class05Practice;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, double money) {
        super(name, money);
    }

    public void receive(ArrayList<Double> list) {
        int index = new Random().nextInt(list.size());//从list中获取编号为列表长度内的随机值
        super.setMoney(super.getMoney() + list.get(index));//重新设定余额
        list.remove(index);//从红包列表中删除已抢过的红包
    }
}
