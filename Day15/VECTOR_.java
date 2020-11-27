package Day15;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @Author LinQ
 * Date:2020/11/24
 * Weather：Rainy
 */
/*
-----Collection 单列集合的根接口
 ----------List   如果实现了List 接口的集合类，具备的特点:有序，可重复
 -------------ArrayList     ArrayList底层维护了一个object的数组实现的，特点是：查询速度快，增删慢
 什么时候使用ArrayList:如果目前的数据是查询多，增删比较少的时候使用ArrayList存储这批数据，比如：高效的图书馆


 -------------LinkedList
 LinkedList 底层是使用了链表数据结构实现的，特点：查询速度慢，增删快
 查询速度慢：地址不是连续的，需要一个个访问


 -------------Vector (了解即可)
 Vector 底层维护了一个object的数组实现的，实现与ArrayList是一样的，但是Vector线程安全的，操作效率低

  Vector类实现了可扩展的对象数组。 像数组一样，它包含可以使用整数索引访问的组件。

 ---------- Set   如果实现了Set接口的集合类， 具备的特点:无序，不可重复

笔试：
说出ArrayList和Vector的区别：
   相同点：ArrayList与Vector底层都是使用了Object实现的

    不同点:1.ArrayList是线程不同步的,操作效率高，Vector是线程同步的，操作效率低
          2.ArrayList是jdk1.2出现的，Vector是JDK1.0出现的




 */
public class VECTOR_ {
    public static void main(String[] args) {
        Vector v =new Vector();
        v.add("张三");
        v.add("李四");
        v.add("王五");
        //迭代该集合
        Enumeration enumeration=v.elements();//获取迭代器
        while(enumeration.hasMoreElements()){
            enumeration.nextElement();
        }


    }
}
