package cn.itcast.day.demo14.red;

public class Bootstrap {
    public static void main(String[] args) {
        RedPacketFrameExtends red = new RedPacketFrameExtends("发红包啦");
        red.setOwnerName("王思聪");
        OpenMode openMode = new NormalOpenModeImpl();
        //OpenMode openMode = new RandomOpenModeImpl();
        red.setOpenWay(openMode);
    }
}
