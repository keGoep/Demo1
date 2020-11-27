package Day15;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author LinQ
 * Date: 2020/11/24
 * Weather：Rainy
 */
/*

 ------Collection 单列集合的根接口
 ----------List   如果实现了List 接口的集合类，具备的特点:有序，可重复
 -------------ArrayList     ArrayList底层维护了一个object的数组实现的，特点是：查询速度快，增删慢
 什么时候使用ArrayList:如果目前的数据是查询多，增删比较少的时候使用ArrayList存储这批数据，比如：高效的图书馆


 -------------LinkedList   LinkedList 底层是使用了链表数据结构实现的，特点：查询速度慢，增删快
 查询速度慢：地址不是连续的，需要一个个访问
 增删快是因为


 -------------Vector (了解即可)

 ---------- Set   如果实现了Set接口的集合类， 具备的特点:无序，不可重复



LinkedList 特有的方法：

        1.方法介绍
            addFirst(E e)
            addLast(E e)
            getFirst()
            getLast()
            removeFirst()
            removeLast()

        2.数据结构
            1；栈     :主要用于实现堆栈数据结构的存储方式
                先进后出
                push()
                pop()
            2.队列(双端队列)：主要为了让别人可以使用LinkedList模拟队列的数据结构的存储方式
                先进后出
                offer()
                poll()

    3.返回逆程的迭代器对象
     descendingIterator()   返回逆序的迭代器对象


descendingIterator()
element()

 */



public class LinkList_ {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        //把元素添加到集合的首位置上
       /* list.addFirst("王");//[王, 张三, 李四, 王五]
        list.addLast("小S");//[王, 张三, 李四, 王五, 小S]*/
    /*   System.out.println("获取集合中的首位置的元素:"+list.getFirst());//获取集合中的首位置的元素:张三
       System.out.println("获取集合中的末位置的元素:"+list.getLast());//获取集合中的末位置的元素:王五

        System.out.println("删除集合中的首地址元素并返回:"+list.removeFirst());//张三
        System.out.println("删除集合中的末地址元素并返回:"+list.removeLast());//王五*/

     /*   //将元素插入到集合的开头处
        list.push("赵六");
        //移除并返回集合中的第一个元素
        System.out.println("集合的首元素是:"+list.pop());//集合的首元素是:赵六*/

     /*   list.offer("马保国");//将元素加到集合末尾处：
        System.out.println("删除集合的第一个元素："+list.poll());//[李四, 王五, 马保国]*/


        Iterator iterator=list.descendingIterator();
         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }
        System.out.println(list);

    }
}
