package cn.itcast.day.demo09;

/*
* 用户类，共性抽取群主和普通成员的姓名和余额特性
* */
public class Users {
    private String name;
    private int balance;

    //展示我有多少钱的方法
    public void show(){
        System.out.println("我叫" + name + "我有" + balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Users(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public Users() {
    }
}
