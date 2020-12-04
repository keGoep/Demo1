package Day17;

import java.util.ArrayList;

/**
 * @Author LinQ
 * Date:2020/12/1
 * Weather：Rainy
 */
/*
jdk1.5:新特性——————————自动拆箱自动装箱

        java是面向对象的语言，任何事物都可以使用类进行描述，sun就使用了
        一些类描述了java中的八种基本类型数据

    基本数据类型  包装类型：
        byte     Byte
        short    Short
        int      Integer
        long     Long

        float    Float
        double   Double

        boolean  Boolean

        char     Character

基本数据类型数据有了对应的包装类型数据的好处：

*/
public class AutoBoxing_Unboxing {

    public static void main(String[] args) {
        String str = "12";

        //字符串转换成int新,可以把字符串转换成对应的数字
        int i = Integer.parseInt(str);//把字符串转换为int型
        System.out.println(i + 1);//13

        //数字转换为字符串
        //System.out.println("输出的元素是："+i+1);//输出的元素是：121
        System.out.println(Integer.toString(i) + 1);//整数转换为字符串      121

        //把整数转为对应的机制形式
        System.out.println("10的二进制：" + Integer.toBinaryString(10));// 10的二进制：1010   返回的是字符串
        System.out.println("10的十进制：" + Integer.toOctalString(10));//10的十进制 ：12
        System.out.println("10的十六进制：" + Integer.toHexString(10));//10的十六进制  a

        //可以把字符串当成对应的进制数据转换
        String date = "10";
        int a = Integer.parseInt(date, 3);//radix：几   机制  MAX_RADIX = 36最大是36
        System.out.println("10进制转换为3进制：" + a);


        //集合是可以存储任意对象类型的容器
        ArrayList list =  new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        //自动装箱：自动把java 基本数据类型的数据  转换成  对象（引用）类型数据
        int A=10;//A是基本数据类型

       // Integer B = new Integer(A);//1.5版本前的jdk需要这样使用
        Integer B=A;//把A存储的值赋予给B变量  Integer是引用数据类型  现在无需要new 直接赋值即可

        //自动拆箱： 把引用类型的数据转换为 基本类型的数据
        Integer c = new Integer(13);
        //int d=c.intValue();//现在简化了 intValue()
        int d=c;//现在简化了 intValue()
        System.out.println(d);

/*        //引用类型数据
        Integer e =126;
        Integer f =126;
        System.out.println("同一个对象吗？"+(e==f));//true*/

        Integer e =128;
        Integer f =128;
        System.out.println("同一个对象吗？"+(e==f));//false  Integer类内部维护了一个缓冲数组，该缓冲数组存储了-128~127这些数据在一个数组中，如
        //如果获取的数据落入这个范围之内的，那么就直接从该缓冲区获取对应的数据


    }
}
