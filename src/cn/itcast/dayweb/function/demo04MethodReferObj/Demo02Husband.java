package cn.itcast.dayweb.function.demo04MethodReferObj;

public class Demo02Husband {
    public void buyHouse(){
        System.out.println("我购买了一套北京四合院");
    }

    public void merry(Demo02Richable richable){
        richable.buy();
    }

    public void soHappy(){
        merry(()->{
            this.buyHouse();
        });
        //使用方法的引用优化
        merry(this::buyHouse);
    }

    public static void main(String[] args) {
        //创建Demo02Husband对象
        Demo02Husband hus = new Demo02Husband();
        hus.soHappy();
    }
}
