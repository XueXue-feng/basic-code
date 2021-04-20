package cn.itcast.day.demo11;

public class Demo03Practise {
    public static void main(String[] args) {
        Laptop lap = new Laptop();
        USB usb1 = new Mouse();
        KeyBoard keyBoard = new KeyBoard();
        lap.useDevice(usb1);
        lap.useDevice(keyBoard);//发生了自动向上转型，keyboard转换成USB类型不会发生问题
        //使用子类对象的匿名对象也可以自动向上转型
        lap.useDevice(new KeyBoard());
        System.out.println("=================");

        //向下转型使用子类的特有方法
        Mouse mouse = (Mouse) usb1;
        mouse.click();
    }
}
