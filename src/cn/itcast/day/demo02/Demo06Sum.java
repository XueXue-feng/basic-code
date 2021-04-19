package cn.itcast.day.demo02;

//求出1~100的和
public class Demo06Sum {
    public static void main(String[] args) {
        System.out.println(sum());
    }
    public static int sum(){
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
