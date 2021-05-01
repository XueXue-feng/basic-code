package cn.itcast.dayweb.demo.demo19Lambda;

public class Test {
    public static void main(String[] args) {
       new Cook(){
            @Override
            public void cook() {
                System.out.println("我是厨子我在做饭");
            }
        };
        //使用Lambda表达式
        cookFood(() -> {
                System.out.println("我是厨子我在做饭");
        });
        //优化省略Lambda
        cookFood(() -> System.out.println("我是厨子我在做饭"));
    }

    public static void cookFood(Cook cook){
        cook.cook();
    }

}
