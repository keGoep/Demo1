package Day17;

import java.util.*;

/**
 * @Author LinQ
 * Date:2020/11/30
 * Weather：Sunny
 */
/*

Iterable接口

增强for循环：
          作用：简化迭代器的书写格式。(注意：增强for循环的底层还是使用了迭代器遍历)
          jdk 1.5出现的新特性

增强for循环的适用范围：

            如果是实现了    Iterable 接口的对象    或者是    数组对象   都可以使用增强for循环

增强for循环的格式：
          for(  变量类型  变量名 ：遍历的目标 ）{

          }

增强for循环要注意的事项：
   1.增强for循环底层也是使用了迭代器获取的，只不过获取迭代器由jvm完成不需要我们获取迭代器而已，
   所以在使用增强for循环遍历元素的过程中不准使用集合对象对集合的元素的个数进行修改
   2.迭代器遍历元素与增强for循环比遍历元素的区别:使用迭代器遍历集合的元素时，可以删除集合的元素，而增强for循环不能调用迭代器的remove方法删除元素
   3.普通for循环与增强for循环的区别：普通for循环可以  没有遍历的目标，而增强for循环  一定要有  遍历的目标
   4.


 */
public class Enhance_for_ {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<String>();
        //添加一些元素
        hashSet.add("狗娃");
        hashSet.add("铁蛋");
        hashSet.add("狗剩");

        //使用迭代器遍历Set集合
        /*Iterator<String> it = hashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
            it.remove();//迭代器可以使用迭代器中的方法而增强for循环不能
        }

        //增强for循环：
            //        for(String item : hashSet){
            //            System.out.println("元素是："+item);
            //            //hashSet.remove("狗剩");//ConcurrentModificationException 底层还是用迭代器遍历，遍历的时候不能用集合修改各个元素的个数
        }*/

        //使用增强for循环实现遍历
        /*int[] arr = {12, 5, 6, 1};
        for (int item : arr) {
            System.out.println("输出元素：" + item);*/

        //需求：在控制台打印五句hello world
      /*  String str="hello world";
        for(int i=0;i<5;i++  ){//可以没有目标
            System.out.println(str);
        }*/
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("001", "狗娃");
        map.put("002", "张三");
        map.put("003", "李四");
        map.put("004", "赵六");

        //Map集合没有实现Iterable 接口，所以map集合不能直接使用fo增强for循环，如果需要直接使用需要借助于Collection(为Iterable的子接口).
        //的集合
        Set<Map.Entry<String,String>> entrySet=map.entrySet();//先转换为Set类
        //增强for循环遍历：
        for( Map.Entry<String,String>  entry : entrySet){//类型是Map.Entry<String,String>  :目标元素是：entrySet
            System.out.println("键："+entry.getKey()+"值："+entry.getValue());
        }


    }
}

