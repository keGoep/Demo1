package Day16;

import java.util.*;

/**
 * @Author LinQ
 * Date:
 * Weather：
 */
/*

需求：定义一个TreeMap，键存储的是一本书对象，值存储的是字符串，现在根据书的出版日期排序


 */



//方法一：利用字符串的CompareTO方法排序
class Book  implements  Comparable<BK>{

    String BookName;


    String date;


    public Book(String BookName, String date) {
        super();
        this.BookName = BookName;
        this.date = date;
    }


    @Override
    public int compareTo(BK o) {
        return this.date.compareTo(o.date);
    }
    @Override
    public String toString() {
        return "书名："+this.BookName+"出版日期："+this.date;
    }


}


public class test_ {
    public static void main(String[] args) {

        TreeMap<BK, String> treeMap = new TreeMap<BK, String>();//值存储书名
        Scanner scanner = new Scanner(System.in);//键盘录入书的信息
        treeMap.put(new BK(scanner.next(),"2021.1.1"),"001");
        treeMap.put(new BK(scanner.next(),"2020.1.23"),"002");
        treeMap.put(new BK(scanner.next(),"2020.1.27"),"003");
        treeMap.put(new BK(scanner.next(),"2021.1.28"),"004");


        Set<Map.Entry<BK,String>>  set= treeMap.entrySet();
        Iterator<Map.Entry<BK,String>> iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<BK,String> map = iterator.next();
            System.out.println("输出的元素是："+map);
        }



    }

}
