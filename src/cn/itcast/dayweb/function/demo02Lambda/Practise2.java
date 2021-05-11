package cn.itcast.dayweb.function.demo02Lambda;

import java.util.function.Consumer;

//请把数组中的数据按照格式输出：格式为姓名：xxx。性别xxx.
public class Practise2 {
    public static void main(String[] args) {
        String[] strArray = new String[]{"迪丽热巴,女","马儿扎哈,男","古力娜扎,女"};
        /*format(strArray, new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] split = s.split(",");
                for (int i = 0; i < split.length; i++) {
                    if(i % 2 == 0){
                        System.out.println("姓名为：" + split[i]);
                    }else{
                        System.out.println("性别为：" + split[i]);
                    }
                }

            }
        });*/

        format2(strArray, new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("姓名为：" + s.split(",")[0]);
            }
        }, new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("性别为" + s.split(",")[1]);
            }
        });
    }
    public static void format(String[] strArray, Consumer<String> con){
        //遍历strArray
        for (String s : strArray) {
            con.accept(s);
        }
    }

    public static void format2(String[] strArray, Consumer<String> con1,Consumer<String> con2){
        for (String s : strArray) {
            con1.andThen(con2).accept(s);
        }

    }
}
