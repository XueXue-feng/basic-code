package cn.itcast.day04.demo02;

/*
* 注意事项：1.方法的定义顺序无所谓，
* 2.不能在方法的内部定义方法，方法的定义必须是挨着的；
* 3.方法定义之后，不会执行，如果要方法执行必须进行方法的调用；
* */
public class Demo01Method {
    public static void main(String[] args) {
        //打印一个20*5的矩形
        for(int i = 1;i <= 5; i++ ){
            String length = "";
           for(int a = 1;a <= 20;a += 1){
                length = length + "*";
                if(length.length() == 20 ){
                    System.out.println(length);
                }
            }
        }
        System.out.println("======================");
        printMethod();
    }

    public static void printMethod(){
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
