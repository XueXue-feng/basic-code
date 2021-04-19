package cn.itcast.day.demo09;

//定义一个新手机方法继承旧手机
public class NewPhone extends Phone{

    @Override
    public void show(){
        //System.out.println("显示号码");
        super.show();//把父类的show方法拿过来重复利用
        //自己子类添加更多的内容
        System.out.println("显示头像");
        System.out.println("显示姓名");
    }
}
