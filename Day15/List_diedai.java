package Day15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author LinQ
 * Date:2020/11/22
 * Weather:Cloudy
 */
/*

ListIterator 特有的方法：

     添加：
        add(E e)   把当前元素插入到当前指针指向的位置上
        set(E e)   替换迭代器最后一次返回的元素


 ----------------------------


        hasPrevious()//判断是否存在上一个元素
        previous() //当前指针向上移动一个单位，然后在取出当前指针指向的元素
        区别：
         next(); //先取出当前指针指向的元素然后指针向下移动一个单位




 */
public class List_diedai {
  public static void main(String []args){
   List list = new ArrayList();
      list.add("狗娃");
      list.add("狗剩");
      list.add("铁蛋");//把元素添加到集合的末尾处
      list.add("美美");

      ListIterator it = list.listIterator();
    /*  ListIterator it=list.listIterator();//返回是一个List接口中特有的迭代器
      System.out.println("是否有上一个元素:"+it.hasPrevious());//是否有上一个元素:false
      System.out.println("获取上一个元素："+it.previous());//NoSuchElementException会报错*/

     /*  it.next();//取出了狗娃,然后指针向下移动一个单位
       System.out.println("获取上一个元素："+it.previous());//狗娃*/

     /*
       死循环：不断输出"狗娃"
       while(it.hasNext()){
          it.next();
          System.out.println("元素:"+it.previous());
      }*/

     /*
      //倒序:  元素： 妹妹  铁蛋  狗剩  狗娃
     while(it.hasNext()) {
          it.next();
      }
      while(it.hasPrevious()){
          System.out.println("元素:"+it.previous());
      }*/
        /*it.next();
        it.next();
        it.add("张三");
        System.out.println("当前的元素是："+list);//当前的元素是：[狗娃, 狗剩, 张三, 铁蛋, 美美]*/


        /* it.set("张三");
         System.out.println("当前的元素是："+list);//IllegalStateException*/


        it.next();
        it.next();
        it.set("李狗蛋");
        System.out.println("当前的元素:"+list);//当前的元素:[狗娃, 李狗蛋, 铁蛋, 美美]


  }
}
