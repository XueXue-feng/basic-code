package cn.itcast.dayweb.function.demo04MethodReferObj;

public class Man extends Human{
    @Override
    public void sayHello() {
        System.out.println("Hello,我是子类");
    }
    public void method(Greatable gr){
        gr.say();
    }

    public void show(){
        /*method(()->{
            //创建父类对象
            Human human = new Human();
            human.sayHello();
        });*/
        //因为存在继承关系所以可以使用super关键字进行优化
        //method(()->{super.sayHello();});
        //使用方法的引用进行优化
        method(super::sayHello);
    }

    public static void main(String[] args) {
        //创建子类对象
        Man man = new Man();
        man.show();
    }
}
