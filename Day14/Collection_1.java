package Day14;

import java.util.ArrayList;
import java.util.Collection;

/*
集合：集合是存储对象的集合容器

集合比数组的优势：
     1.集合可以存储任意类型的对象数据，数组只能存储同一种数据 类型的数据。
     2.集合的长度是会发生变化的

接口可以定义规范

--------|Collection   单例集合的根接口。
-----------|List  如果是实现了List接口的集合类，特点是有序，重复
-----------|Set   如果是实现了Set接口的集合类，特点是无序，不可重复

Collection中的方法

      增加
     add(E e)  E    添加成功返回true  添加失败返回false

    addAll(Collection c)
    把一个集合的元素添加到另外一个集合中


      删除
          clear()
          从此集合中删除所有元素（可选操作）。

          remove(Object o)
      指定集合元素删除，删除成功返回true失败返回false

        removeAll(Collection <> c)
        删除交集元素。


        retainAll(Collection<?> c)
       保留交集元素。


      查看
        size()
        返回此集合中的元素数。






      迭代
        iterator()
        返回此集合中的元素的迭代器。
        toArray()
        返回一个包含此集合中所有元素的数组。
 */
public class Collection_1 {
    public static  void main(String[]args) {
       Collection c = new ArrayList();//指向实现类
        c.add("令计划");
        c.add("马保国");
        c.add("小李飞刀");
        System.out.println("添加成功吗？"+c.add("郭美美"));//true
        System.out.println(c);//[令计划, 马保国, 小李飞刀, 郭美美]


        Collection collection = new ArrayList();
        collection.add("郭富城");
        collection.add("张学友");
        collection.add("郭美美");
        System.out.println(collection);//[令计划, 马保国, 小李飞刀, 郭美美, 郭富城, 张学友, 郭美美]
//
//        c.addAll(collection);
//        System.out.println(c);//[令计划, 马保国, 小李飞刀, 郭美美, 郭富城, 张学友, 郭美美]

//        c.clear();//清空集合元素
//        System.out.println(c);//[]
//        System.out.println(collection);//[郭富城, 张学友]

//        System.out.println("删除成功吗？"+c.remove("大头儿子"));//false
//        System.out.println("删除成功吗？"+c.remove("郭富城"));//true

//        c.removeAll(collection);//删除交集元素
//        System.out.println(collection);//[郭富城, 张学友, 郭美美]

//         c.retainAll(collection);
//         System.out.println(c);//[郭美美]
//         System.out.println(collection);//[郭富城, 张学友, 郭美美]

     System.out.println("元素的个数："+c.size());//4
     System.out.println("元素的个数："+collection.size());//3

    }
}
