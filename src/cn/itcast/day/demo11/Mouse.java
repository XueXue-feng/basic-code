package cn.itcast.day.demo11;

public class Mouse implements USB{
    @Override
    public void openDevice() {
        System.out.println("打开鼠标");
    }

    @Override
    public void closeDevice() {
        System.out.println("关闭鼠标");
    }
    public void click(){
        System.out.println("我是鼠标的点击方法");
    }
}
