package cn.itcast.day.demo11;

/*
* USB接口里面有两个抽象方法
* openDevice();
* closeDevice();
* */
public interface USB {
    //USB打开设备
    public abstract void openDevice();
    //USB关闭设备
    public abstract void closeDevice();

}
