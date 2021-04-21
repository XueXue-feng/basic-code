package cn.itcast.day.demo14;

public class DemoMain {
    public static void main(String[] args) {
        //创建一个英雄角色
        Weapon weapon = new Weapon("宣化板斧");
        Hero obj1 = new Hero("盖伦",weapon,19);
        //obj1.attack();

        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.print("吃胖胖");
            }
        };
        Hero hero = new Hero("艾希",weapon,19,skill);
        hero.attack();
    }
}
