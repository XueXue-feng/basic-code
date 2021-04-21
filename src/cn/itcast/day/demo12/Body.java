package cn.itcast.day.demo12;

public class Body {//外部类
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Body() {
    }

    public void methodMethod(){
        System.out.println("我是外部类");
        Heart heart = new Heart();
        heart.beat();
        new Heart().beat();
    }

    public class Heart{//内部类
        public void beat(){
            System.out.println("心脏蹦蹦蹦");
            System.out.println("我叫" + name);//正确写法
        }
    }
}
