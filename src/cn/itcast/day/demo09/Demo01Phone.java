package cn.itcast.day.demo09;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.sendMessage();
        phone.show();
        System.out.println("=================");

        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.sendMessage();
        newPhone.show();
    }
}
