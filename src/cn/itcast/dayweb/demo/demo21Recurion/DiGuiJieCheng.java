package cn.itcast.dayweb.demo.demo21Recurion;

/*
* 使用递归求阶乘
* */
public class DiGuiJieCheng {
    public static void main(String[] args) {
        System.out.println(jieCheng(4));
    }
    //求阶乘,调用递归的目的就是获取下一个数字
    public static int jieCheng(int n){
        if(n == 1){
            return 1;
        }
        return n * jieCheng(n - 1);
    }
}
