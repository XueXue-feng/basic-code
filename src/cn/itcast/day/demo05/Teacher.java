package cn.itcast.day.demo05;

public class Teacher {
    private String name;
    private int age;
    private boolean male;

    public void setName(String nameTemp){
        name = nameTemp;
    }
    public String getName(){
        return name;
    }
    public void setAge(int ageTemp){
        age = ageTemp;
    }
    public int getAge(){
        return  age;
    }
    public void setMale(boolean maleTamp){
        male = maleTamp;
    }
    //注意Boolean类型的get方法用isxxx
    public boolean isMale(){
        return male;
    }


}
