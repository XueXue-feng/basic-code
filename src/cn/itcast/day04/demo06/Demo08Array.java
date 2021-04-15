package cn.itcast.day04.demo06;

/*
* 定义一个数组，用来存储三个Teacher对象
* 数组缺点：一旦创建，程序运行期间长度不可改变，
* */
public class Demo08Array {
    public static void main(String[] args) {
        //首先创建一个长度为3的数组
        Teacher[] array = new Teacher[3];
        System.out.println(array[0]);//默认值为null
        Teacher one = new Teacher("迪丽热巴" ,18);
        Teacher two = new Teacher("杨幂" ,28);
        Teacher three = new Teacher("马儿咋哈" ,38);
        //将one中存储的地址值赋值给数组的0号元素
        array[0] = one;
        array[1] = two;
        array[2] = three;
        System.out.println(array[0]);

        System.out.println(array[1].getName());
    }
}
