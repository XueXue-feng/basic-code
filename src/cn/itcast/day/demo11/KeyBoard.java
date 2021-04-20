package cn.itcast.day.demo11;

public class KeyBoard implements USB{
    @Override
    public void openDevice() {
        System.out.println("打开键盘");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭键盘");
    }
    public void knock(){
        System.out.println("我是键盘的敲击功能");
    }
}
