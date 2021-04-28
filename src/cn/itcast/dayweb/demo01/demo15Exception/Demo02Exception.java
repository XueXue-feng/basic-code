package cn.itcast.dayweb.demo01.demo15Exception;

/*
*
* */
public class Demo02Exception {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4};
        try{
            System.out.println(getElement(array,9));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    public static int getElement(int[] array,int index){
        return array[index];
    }
}
