package Day16;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @Author LinQ
 * Date:2020/11/28
 * Weather：cloudy
 */
/*
-------|Map   如果是实现了Map接口的集合类，具备的特点是：存储的数据都是与键(value)值(value)对的形式存在的，键不可以重复，值可以重复

-----------|HashMap  底层是基于哈希表实现的，

HashMap的存储原理：
   往HashMap存储元素的时候，首先会调用键的   HashCode方法得到元素的哈希码值，然后经过运算就可以算出
   元素在哈希表中的存储位置。
   情况1：如果算出的位置目前没用任何元素存储，那么该元素可以直接添加到哈希表中
   情况2：如果算出的位置目前已经存在其他的元素，那么还会调用该元素对的equals方法与这个位置的元素进行比较
   ，如果equals方法返回的是false，那么该元素允许存储，如果equals返回的是true那么该元素被视为重复元素，不允许存储


-----------|TreeMap  jdk1.2
   TreeMap是基于红黑树(二叉树)数据结构实现的。特点会对元素的键进行存储。

TreeMap 要注意的事项：
   1.往TreeMap添加元素的时候，如果元素的键具备自然顺序，那么就会按照键的自然顺序排序
   2.往TreeMap添加元素的时候，如果元素的键不具备自然顺序特性，那么键所属的类必须要实现Comparable接口,把元素的比较规则
   定义在CompareTo接口,
   3.往TreeMap添加元素的时候，如果元素的键不具备自然顺序特性,而且键所属的类也没实现Comparable接口，那么必须在TreeMap创建的时候
   传入比较器。


-----------|Hashtable(了解)底层依赖了哈希表实现的，也就是实现方法与HashMap是一致，但是HashTable是线程安全的，操作效率低 jdk 1.0





 */
class MyComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        return o1.wage-o2.wage;
    }
}


class Employee {//implements  Comparable

    String name;

    int wage;

    public Employee(String name,int wage) {
        this.name = name;
        this.wage=wage;
    }

    @Override
    public String toString() {
        return "[姓名："+this.name+"薪水"+this.wage+"]";
    }

  /*  @Override
    public int compareTo(Object o) {
        //Employee employee = (Employee)o;
        return this.wage-((Employee) o).wage;
    }*/
}


public class MAP_TreeMap {
    public static void main(String[] args) {
        /*TreeMap<Character,Integer> treeMap = new TreeMap<Character,Integer>();
        treeMap.put('c',10);
        treeMap.put('b',2);
        treeMap.put('a',5);
        treeMap.put('h',12);
        System.out.println(treeMap);//{a=5, b=2, c=10, h=12}{a=5, b=2, c=10, h=12}*/
        //创建一个自定义的比较器对象
        MyComparator comparator = new MyComparator();

        TreeMap<Employee,String> tree= new TreeMap<Employee,String>(comparator);
        tree.put(new Employee("狗娃",2000),"001");
        tree.put(new Employee("狗蛋",3000),"002");
        tree.put(new Employee("狗子",4000),"003");
        tree.put(new Employee("麻蛋",6000),"004");

        tree.put(new Employee("麻瓜",6000),"004");
        System.out.println(tree);
    }
}
