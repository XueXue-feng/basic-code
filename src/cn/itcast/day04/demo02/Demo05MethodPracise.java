package cn.itcast.day04.demo02;

//比较两个数的大小
public class Demo05MethodPracise {
    public static void main(String[] args) {
        System.out.println(compareValue(5,5));
    }

    public static boolean compareValue(int a , int b){
        /**if(a > b){
          return true;
        }else{
            return false;
        }*/
        boolean result = a == b ? true : false;
        return result;
    }
}
