package Day17;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Author LinQ
 * Date:2020//11/30
 * Weather：Sunny
 */
/*

jdk 1.5静态新特性------静态导入

静态导入的作用： 简化书写

静态导入可以作用于一个类的所有静态成员

静态导入的格式：
   import static 包名.类名.静态的成员


静态导入要注意的事项：
    1，如果静态导入的成员与本类的成员名字存在着同名的情况，那么默认使用本类的静态成员，如果需要制定使用静态导入的成员，那么需要在静态成员前面加上类名
    2.

 */
import static java.util.Collections.*;
import static java.lang.System.out;

public class Static_imports {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(9);
        list.add(10);
        list.add(11);
        //排序
        //sort(list); isError
       Collections.sort(list);//指定调用。

        out.println("集合的元素是：" + list);
        out.println("索引值：" + binarySearch(list, 11));
        out.println("最大值：" + max(list));


    }

    /*public static void sort(ArrayList <Integer>list){
        out.println("本类的sort方法");
    }//用了本类的方法*/
    public static void sort(){
        out.println("本类的sort方法");
    }



}
