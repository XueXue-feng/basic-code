package cn.itcast.dayweb.demo01.demo15Exception;

/*
* Throw关键字作用：可以使用throw关键字在指定的方法中抛出指定的异常
* throw new XXXException("异常原因")；
* 1.必须写在方法的内部
* 2.后面new 的对象必须是Exception或者子类
* 3.抛出指定对象就必须处理throw创建的是RuntimeException或者是其子类，可以不处理
* 如果创建的是编译异常就必须处理这个异常throws,try...catch()
* NullPointerException是RuntimeException运行期异常
* */
public class Demo03Throw {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        getElement(array,90);//空指针异常发生了
    }
    //返回指定索引的数组元素,必须对参数进行合法性校验，抛出异常告诉调用者参数不合理
    public static int getElement(int[] array,int index){
        //array null 判断
        if(array == null){
            throw  new NullPointerException("空指针异常发生了");
        }
        if(index < 0 || index > array.length - 1){
            throw new ArrayIndexOutOfBoundsException("数组越界异常");
        }
        return array[index];
    }
}
