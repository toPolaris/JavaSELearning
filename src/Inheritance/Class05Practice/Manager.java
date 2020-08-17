package Inheritance.Class05Practice;

import java.util.ArrayList;
import java.util.Random;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, double money) {
        super(name, money);
    }

    public ArrayList<Double> send(double total, int count) {
        ArrayList<Double> moneyList = new ArrayList<>();
        double remaining = super.getMoney();
        if (remaining < total) {//检查是否能过够发出红包
            System.out.println("Insufficient Balance!");
            return moneyList;
        }
        super.setMoney(remaining - total);//重新设置余额
        //设定红包金额
        Random r = new Random();//随机金额产生
        double temp = total;
        int left = (int) Math.floor(temp * 100);
        int random;
        for (int i = 0; i < count - 1; i++) {
            random = r.nextInt(left);
            if (random == 0) {//确保最小金额为1
                random = 1;
            }
            moneyList.add(random / 100.0);
            temp = temp - random / 100.0;
            left = (int) Math.floor(temp * 100);
        }
        moneyList.add(temp);
        return moneyList;
    }
}
