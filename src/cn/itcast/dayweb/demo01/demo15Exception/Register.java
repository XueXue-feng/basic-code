package cn.itcast.dayweb.demo01.demo15Exception;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Register {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"张三");
        int i = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名:" );
        String str = scanner.next();
            try {
                if(hashMap.containsValue(str)){
                    throw new MyException("亲您已注册");
                }else{
                    hashMap.put(i,str);
                    i += 1;
                    System.out.println("恭喜你注册成功！！");
                }
            } catch (MyException e) {
                e.printStackTrace();
            }


    }
}
