package Day15;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author LinQ
 * Date:  2020/11/26
 * Weather：Rainy
 */
/*class BookMatchID implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Bok book = (Bok)o1;
        Bok book1=(Bok)o2;
        return book.id-book1.id;
    }
}*/
//自定义一本书比较重复的编号，编号一致就为同一本书
class Bok  implements  Comparable{
    String name;

    int id;

    public Bok(String name , int  id){
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString() {
        return "{ 书名："+this.name+"编号:"+this.id+"}";
    }


    @Override
    public int compareTo(Object o) {
        Bok book = (Bok)o;
        return this.id-book.id;
    }
}


public class MyCompare_tree {
    public static void main(String[] args) {
        //BookMatchID bookMatchID = new BookMatchID();
        //TreeSet treeSet = new TreeSet(bookMatchID);

        TreeSet treeSet = new TreeSet();
        treeSet.add(new Bok("平凡的世界",120));
        treeSet.add(new Bok("牛虻",130));
        treeSet.add(new Bok("平凡世界",120));
        treeSet.add(new Bok("我的未来式",190));

           System.out.println(treeSet);
    }
}
