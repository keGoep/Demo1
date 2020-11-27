package Day15;

import java.util.ArrayList;

/**
 * @Author LinQ
 * Date:  2020/11/26
 * Weather：Rainy
 */
/*

泛型是jdk1.5使用新特性

泛型：
    泛型的好处：
     1.将运行时的问题提前至了编译时，
     2.避免了无谓的强制类型转换
     3.


泛型在集合中的常见引用
    ArrayList<String> list = new ArrayList<String>();true
    ArrayList<Object> list = new ArrayList<String>();false
    ArrayList<String> list = new ArrayList<Object>();false
    //以下两种写法主要是为了兼顾新老系统的兼容性，在jdk1.5前是没有泛型的
    ArrayList<String> list = new ArrayList();true
            ArrayList list = new ArrayList<String>();true
   编译看左边

 注意：泛型没有多态的概念，左右两边的数据类型必须要一致，或者只写一边的泛型

 推荐使用：两边都写泛型



需求：把一个集合中的全部元素转为大写


 */
public class Generality_1 {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList()<String>;//<>表示该容器只能存储字符串类型的数据
       //ArrayList<Object> list = new ArrayList<String>();
       //ArrayList<String>  list = new ArrayList<Object>();
       //ArrayList<String>  list = new ArrayList();
         ArrayList list = new ArrayList<String>();//左边没写表示为Object，下面仍然需要强转

        list.add("aa");
        list.add("bb");
        list.add("cc");
        //list.add(123);

        for(int i=0;i<list.size();i++){
          String str=(String)list.get(i);
          System.out.println("大写："+str.toUpperCase());
        }


    }
}
