package Day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*

--------|Collection   单例集合的根接口。
-----------|List  如果是实现了List接口的集合类，特点是有序，重复
-----------|Set   如果是实现了Set接口的集合类，特点是无序，不可重复


 迭代的方法：

        iterator()
        返回此集合中的元素的迭代器。
        toArray()
        返回一个包含此集合中所有元素的数组。

  迭代器的作用用于抓取集合中的元素：

 迭代器的方法：
     hasNext()  当前指针是否有指向的元素，如果有元素可以遍历返回true否则为false

     next()      获取当前指针指向的元素并返回当前的元素，然后指针向下移动一个单位

     void remove()  移除迭代器最后一个元素返回的元素





 NoSuchElementException 没有元素的异常。
 出现的原因，没有元素可以被迭代了



 */
public class Collection_4{

    public static void main(String []args){

        Collection c = new ArrayList();
        c.add("狗娃");
        c.add("狗剩");
        c.add("铁蛋");
        c.add("妹妹");
       /* //变量集合的元素-----方式一toArray方法
        Object[]arr = c.toArray();//把集合的元素存储到obj的数组返回
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //使用iterator迭代器遍历*/
        //实际上返回的是iterator接口的实现类对象ArrayList
        Iterator t = c.iterator();  //返回一个迭代器 疑问：为什么iterator方法返回的是一个接口类型，为什么接口又可以调用方法又可以使用呢
       /* System.out.println("有元素可以遍历吗"+t.hasNext());//有元素可以遍历吗true
        while(t.hasNext()){//问是否有元素可以遍历
            System.out.println("取出的元素："+t.next());
        }*/
     /*   t.next();
        t.remove();//删除迭代器最后一次返回的元素
        System.out.println("集合的元素是："+c);

*/
     //清空集合元素
      while(t.hasNext()){
          t.next();
          t.remove();
      }
       System.out.println("集合的元素是"+c);
    }
}