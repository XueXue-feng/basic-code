package cn.itcast.day.demo14;

public class Hero {
    private String name;//英雄名字
    private Weapon weapon;//武器名称
    private int age;
    private Skill skill;

    public void attack(){
        System.out.println("我是" + name + "年龄为" + age + "手持" + weapon.getName() + "你会：");
        skill.use();
    }

    public Hero(String name, Weapon weapon, int age) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Hero(String name, Weapon weapon, int age, Skill skill) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
        this.skill = skill;
    }

    public Hero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
