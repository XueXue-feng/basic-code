package cn.itcast.day04.demo03;

/*
* 比较两个数据是否相等
* 参数类型分别为两个byte，两个short，两个int,两个long,并在main方法中进行测试
* */
public class Demo02MethodSame {
    public static void main(String[] args) {
        byte a = 2;
        byte b = 3;
        System.out.println(getSame(a,b));
    }

    public static boolean getSame(byte a,byte b){
        if(a == b){
           return true;
        }else {
            return false;
        }
    }
    public static boolean getSame(short a,short b){
        if(a == b){
            return true;
        }else {
            return false;
        }
    }
    public static boolean getSame(int a,int b){
        if(a == b){
            return true;
        }else {
            return false;
        }
    }
    public static boolean getSame(long a,long b){
        if(a == b){
            return true;
        }else {
            return false;
        }
    }
}
