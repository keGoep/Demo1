package Day15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author LinQ
 * Date: 2020/11/23
 * Weather：Rainy
 */

/*
迭代器在遍历元素的时候要注意的事项：

在迭代元素的过程（迭代器一旦创建到使用结束的时间。）中,
不允许使用集合对象，改变集合中的元素个数，
如果需要增加或者删除只能使用迭代器的方法进行操作

如果使用了集合对象该变量了集合中的元素个数那么就会出现下面的ConcurrentModificationException异常

迭代元素的过程中：   迭代器一旦创建到使用结束的时间。




 */


public class announcement {
public static void main(String []args){
    List list = new ArrayList();

    list.add("海绵宝宝");
    list.add("花园宝宝");
    list.add("天线宝宝");
    ListIterator it = list.listIterator();//迭代器创建
    it.next();//迭代器使用结束
    list.add("aa");//is true

    /*
     ListIterator it = list.listIterator();//迭代器创建
    list.add("aa");
    it.next();//迭代器使用结束
    */


   /* while(it.hasNext()){
        System.out.println(it.next());
        //it.add("aa");//海绵宝宝   花园宝宝  天线宝宝S
        // 把元素添加到当前指针指向的位置
        // list.add("aa");//ConcurrentModificationException
        //把元素添加到集合末尾处
        // list.remove("花园宝宝");//ConcurrentModificationException
    }*/

    while(it.hasNext()) {
        it.add("aa");//海绵宝宝   花园宝宝  天线宝宝S
        System.out.println(it.next());

    }
  System.out.println("集合的元素是："+list);//[海绵宝宝, aa, 花园宝宝, aa, 天线宝宝, aa]
}
}
