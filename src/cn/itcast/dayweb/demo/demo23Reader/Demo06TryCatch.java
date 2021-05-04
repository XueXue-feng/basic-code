package cn.itcast.dayweb.demo.demo23Reader;

import java.io.FileWriter;
import java.io.IOException;

/*
* try{//可能会产生异常的代码}catch(异常类){//异常的处理逻辑}finally{//资源释放类}
* */
public class Demo06TryCatch {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\IntelliJ IDEA 2020.3.3\\code\\day04-code\\src\\cn\\itcast\\dayweb\\demo\\demo23Reader\\c.txt");
            fw.write("我是猪头");
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
