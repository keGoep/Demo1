package Day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @Author LinQ
 * Date: 2020/11/29
 * Weather：Sunny
 */
/*
集合的工具类(Collections)：
   
笔试题：说出Collection和Collections的区别？
   1.Collection是一个单列集合的根接口，而Collections是操作集合对象的一个工具类。


Collections常见的方法：

  记住    1.对list集合进行排序
          sort(list)
          sort(list,comparator)

      2.对list进行二分查找：
        int    binarySearch(list,key)
        int    binarySearch(list,key,Comparator)//如果具备自然顺序的元素还得传入比较器

 记住     3.找最大最小值
        max(Collection)
        max(Collection ,Comparator)
        min(Collection)
        min(Collection,Comparator)

      4.对list集合进行反转：
      reverse(list);//不需要比较过程就不需要比较器

      5.可以将一个不同步的集合对象变成同步的集合对象
      Set  synchronizedSet(Set<T> s)
      Map  synchronizedMap(Map <K,V> m)
      List synchronizedList(List<T> list)

 */
public class Collection_tool   {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(12);
        list.add(2);
        list.add(19);
        Collections.sort(list);
        System.out.println(list);//[1, 2, 12, 19]
        Collections.reverse(list);
        System.out.println(list);//[19, 12, 2, 1]
        System.out.println("最大值是"+Collections.max(list));//19
        System.out.println("最小值是"+Collections.min(list));//1
        System.out.println("元素所在的索引值是："+ Collections.binarySearch(list,12));//元素所在的索引值是：2

        list=(ArrayList<Integer>) Collections.synchronizedList(list);//返回一个线程安全的集合对象




    }
}
