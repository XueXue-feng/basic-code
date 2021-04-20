package cn.itcast.day.demo11;

public class Laptop {
    public void openLaptop(){
        System.out.println("打开笔记本");
    }
    public void closeLaptop(){
        System.out.println("关闭笔记本");
    }
    public void useDevice(USB usb){
        if(usb instanceof Mouse){
            System.out.println("我的笔记本有鼠标");
            usb.openDevice();
            usb.closeDevice();
        }
        if(usb instanceof KeyBoard){
            System.out.println("我的笔记本有键盘");
            usb.openDevice();
            usb.closeDevice();
        }
    }
}
