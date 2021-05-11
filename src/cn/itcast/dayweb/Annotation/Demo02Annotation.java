package cn.itcast.dayweb.Annotation;

/**
 * @ProjectName: basic-code
 * @Package: cn.itcast.dayweb.Annotation
 * @ClassName: Demo02Annotation
 * @Author: XueXue-Li
 * @Description:
 * @Date: 2021/5/10 17:05
 * @Version: 1.0
 */
@SuppressWarnings("all")//表示压制所有警告
public class Demo02Annotation {
    /*
    * JDK中预定义的一些注解
    * */

    @Override//检测被该注解标记的方法是否是继承自父类(接口)的
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show01(){
        //有缺陷不推介使用
    }

    @Demo03Annotation(show = "string",age = 13)//这就是叫做属性的原因
    public void show02(){
        //更新的替换方法
    }

    public void method(){
        show01();//就会产生一条横线表示该方法已过时
    }
}
