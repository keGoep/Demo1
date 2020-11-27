package Day15;



import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @Author LinQ
 * Date:  2020/11/23
 * Weather：Rainy
 */
/*

练习：使用三种方式遍历:
   1.使用get方式的遍历

   2.使用迭代器正序的遍历

   3.使用迭代器逆序遍历


 */


public class test {
    public static void main(String []args){
      List list = new ArrayList();
      list.add("海绵宝宝");
      list.add("花园宝宝");
      list.add("天线宝宝");

      System.out.println("======get方法遍历=======");
      for(int i=0;i<list.size();i++){
          System.out.println("输出的元素是:"+list.get(i));
      }
      System.out.println("======迭代器遍历======");
      ListIterator it = list.listIterator();
      while(it.hasNext()){
          System.out.println("输出的元素是:"+it.next());
      }

      System.out.println("=======逆序的遍历=========");
     while(it.hasPrevious()){
         System.out.println("输出的元素是:"+it.previous());
     }
    }
}
  /*
       方式1：

        list.add("小红");
        list.add("小橙");
        list.add("小黄");
        list.add("小绿");
        list.add("小灰");
        for(int index=0;index<list.size();index++) {
            System.out.println("输出的元素是"+list.get(index));
        }*/