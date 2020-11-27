package Day15;

import java.util.ArrayList;

/**
 * @Author LinQ
 * Date:2020/11/23
 * Weather：
 */
/*

 ------Collection 单列集合的根接口
 ----------List   如果实现了List 接口的集合类，具备的特点:有序，可重复
 -------------ArrayList     ArrayList底层维护了一个object的数组实现的，特点是：查询速度快，增删慢
 什么时候使用ArrayList:如果目前的数据是查询多，增删比较少的时候使用ArrayList存储这批数据，比如：高效的图书馆


 -------------LinkedList
 -------------Vector (了解即可)

 ---------- Set   如果实现了Set接口的集合类， 具备的特点:无序，不可重复

ArrayList 特有的方法：
   ensureCapacity(int minCapacity)  指定容量   但是ArrayList()可以直接用构造方法指定
   trimToSize()

笔试题目：
   使用ArrayList无参的构造函数创建一个对象时，默认的容量是多少？如果长度不够使用是又自动增长多少？
   ArrayList底层维护了一个Object的数组实现的，使用无参的构造函数时,object默认数组的容量是10，当长度不够时，自动增长0.5倍

  >>  是除以2的n次方


  为什么ArrayList的特点是：查询速度快，增删慢
   查询速度快： 因为ArrayList维护的是一个object[]数组，而数组的特点：元素与元素之间的内存地址是连续的
    增加慢：  因为  如果要添加数据的大的内容，ArrayList首先会检查够不够用，不够用要增长0.5倍，然后在把内容拷贝
    删除慢：  因为  删除会留出空位，后面的元素需要整个移动，
 */
public class Collection_6 {
    public static void main(String[] args) {
        ArrayList  arrayList = new ArrayList();

    }
}
