package Day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * @Author LinQ
 * Date: 2020/11/23
 * Weather：Rainy
 */


//需求：编写一个函数清除集合中的重复元素，如果书号是一样的就视为重复元素，要求遍历集合元素的时候必须使用迭代器
class Book{
    int id;
    String name;

    public Book(int id,String name){
        this.id=id;
        this.name=name;
    }


    @Override
    public String toString() {
        return "{书号："+this.id+"书名："+this.name+"}";
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return this.id==book.id;
    }
}


public class test_2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Book(110, "java编程思想"));
        arrayList.add(new Book(220, "java核心技术"));
        arrayList.add(new Book(330, "深入javaWeb"));
        arrayList.add(new Book(110, "java神书"));

        ArrayList list2=clearRepeat(arrayList);
        System.out.println("新集合的元素是:"+list2);

    }
    public  static ArrayList clearRepeat(ArrayList list){
        //创建一个集合
        ArrayList newList = new ArrayList();
        ListIterator listIterator = list.listIterator();
        while(listIterator.hasNext()){
            Book book  = (Book) listIterator.next();//从旧集合获取的元素
          if(!newList.contains(book)){//如果新集合没包含这本书，就存储这本书
              newList.add(book);
          }
        }

        return newList;
    }



}
