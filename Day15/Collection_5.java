package Day15;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author LinQ
 * Date:   2020/11/22
 * Weather:  Cloudy
 */

/*

注意：集合类的所有类都在util包，而不是awt包

集合的体系：
-----------Collection  单列集合的根接口
-----------------------List  如果是实现了List接口的集合类，该集合具备的特点是：有序，可重复
-----------------------Set   如果是实现了Set接口的集合类，该集合具备的特点是：无序，不可重复

有序：集合的有序不是指自然顺序,而是指添加进去的顺数与元素出来的顺序是一致的



List 接口中的特有方法：

     添加
     add(int index, E element)
     addAll(int index, Collection<? extends E> c)

     获取
     get(int index)
     indexOf(Object o)
     lastIndexOf(Object o)
     subList(int fromIndex, int toIndex)

     修改
     set(int index, E element)

List接口中特有的方法具备的特点：操作的方法都存在着索引值
只有List接口下面的集合类才具备索引值,其他接口下面的集合类都没有索引值。



size()返回列表元素的个数

 */
public class Collection_5 {
    public static void main(String []args){

     List list = new ArrayList();
     list.add("狗娃");
     list.add("狗剩");
     list.add("铁蛋");//把元素添加到集合的末尾处

     /*
     添加方法:
     list.add(1,"马大哈");//把元素添加到指定索引值的位置上
     System.out.println("集合的元素是："+list);//集合的元素是：[狗娃, 马大哈, 狗剩, 铁蛋]

     List list2=new ArrayList();
     list2.add("马保国");
     list2.add("年轻人不讲武德");
     list.addAll(2,list2);//把list2集合的元素添加到list集合指定索引值的位置上
     System.out.println("集合的元素是："+list);//集合的元素是：[狗娃, 狗剩, 马保国, 年轻人不讲武德, 铁蛋]

      获取的方法：
      System.out.println("获取元素："+list.get(1));//根据索引值获取集合中的元素    获取元素：狗剩
       使用get方法获取集合的元素遍历集合的元素
      for(int i=0;i<list.size();i++){
               System.out.println(list.get(i));
        }
      获取的方法：
       list.add("狗娃");
       System.out.println("指定元素第一次出现在集合中的索引值的位置:"+list.indexOf("狗剩"));//1
        // System.out.println("指定元素在集合中的索引值:"+list.indexOf("马大哈"));//-1
        System.out.println("找指定的元素最后一次出现在集合中的索引值:"+list.lastIndexOf("狗娃"));//3

        List subList=list.subList(0,2);//指定开始于结束的索引值截取集合中的元素
        System.out.println("子集合的元素是"+subList);//子集合的元素是[狗娃, 狗剩]
       */

        list.set(2,"赵本山");//使用指定的元素替换指定索引值位置的元素
        System.out.println("集合元素"+list);

    }
}
