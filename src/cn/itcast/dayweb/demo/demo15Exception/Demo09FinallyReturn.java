package cn.itcast.dayweb.demo.demo15Exception;

/*
* 如果finally中有return语句，我们应该避免这种情况
* */
public class Demo09FinallyReturn {
    public static void main(String[] args) {
        System.out.println(getA());
    }

    private static int getA() {
        int a ;
        try{
           a = 10;
        }catch (Exception e){
            System.out.println(e.toString());
        }finally {
            a = 100;
            return a;
        }
    }
}
