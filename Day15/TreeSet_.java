package Day15;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author LinQ
 * Date: 2020/11/26
 * Weather：
 */
/*

-----Collection 单列集合的根接口
 ----------List   如果实现了List 接口的集合类，具备的特点:有序，可重复
 -------------ArrayList     ArrayList底层维护了一个object的数组实现的，特点是：查询速度快，增删慢
 什么时候使用ArrayList:如果目前的数据是查询多，增删比较少的时候使用ArrayList存储这批数据，比如：高效的图书馆
 -------------LinkedList
 LinkedList 底层是使用了链表数据结构实现的，特点：查询速度慢，增删快
 查询速度慢：地址不是连续的，需要一个个访问
 -------------Vector (了解即可)
 Vector 底层维护了一个object的数组实现的，实现与ArrayList是一样的，但是Vector线程安全的，操作效率低
  Vector类实现了可扩展的对象数组。 像数组一样，它包含可以使用整数索引访问的组件。

 ---------- Set   如果实现了Set接口的集合类， 具备的特点:无序，不可重复
   无序：添加元素的顺序与元素出来的顺序是不一致的
 ------------HashSet  底层是使用了哈希表来支持的，存取速度快，

hashSet的实现原理：
      往Hash添加元素的时候,HashSet会先调用元素的HashCode方法，得到元素的哈希值，然后通过元素的哈希值经过移位等运算，
      就可以算出该元素在哈希表中的存储位置。
      算出位置后的两种情况：
      情况1：如果算出元素存储的位置目前没用任何元素存储，那么该元素可以直接存储到该位置行

      情况2：如果算出该元素的存储位置目前已经存在有其他的元素了，那么还会调用该元素的equals方法，与该位置的元素再比较一次，
      如果equals返回的是true，那么该元素与该位置上的元素被视为重复元素，就不会添加，如果equals返回的是false那么该元素允许添加。

 哈希表的一个特点：
          桶式结构。

-------------TreeSet 如果元素具备自然顺序的特性，那么会按照元素自然顺序的特性进行排序存储。
TreeSet要注意的事项：
    1.往TreeSet添加元素的时候，如果元素本身具备了自然顺序的特性，那么会按照元素自然顺序的特性存储。
    2.往TreeSet添加元素的时候，如果元素本身不具备自然顺序的特性，那么该元素所属的类必须要实现Comparable接口，把元素的比较规则定义在CompareTo(T o)方法
    3.如果比较元素的时候CompareTo方法返回的是零，不允许添加(TreeSet与hashCode，equals方法没有任何关系)
    4.往TreeSet添加元素的时候，如果元素本身没有具备自然顺序的特性，而元素所属的类也没有实现Comparable接口，那么必须要在创建TreeSet的时候传入一个比较器
    5..往TreeSet添加元素的时候，如果元素本身没有具备自然顺序的特性，元素所属的类已经实现了Comparable接口，而在创建TreeSet对象的时候也传入了比较器
    那么是以比较器的比较规则优先使用。


如何自定义定义比较器：
    自定义一个类实现一个Comparator接口即可，把元素与元素之间的比较规则定义在compare方法内即可
    自定义比较器的格式：
               class 类名 implements Comparator{
                  实现compare方法
               }


Summary:  两种方式实现TreeSet排序：
           1.元素所属类实现Comparable接口，实现其中的  CompareTo方法
           2.创建TreeSet的时候传入Comparator比较器————》自定义一个类实现Comparator接口，然后实现它的compare接口

    要重写compare 和 compareTo 方法返回值类型都是  int

推荐使用：比较器(Comparator)
          复用性高


 */

//refactor --->rename ---->修改一处及多处

//自定义一个比较器类
    class MyComparator implements Comparator{

      //返回一个负整数，零（视为重复元素）或正整数，因为该对象小于，等于或大于指定对象。
    @Override
    public int compare(Object o1, Object o2) {
        Employee employee =(Employee)o1;
        Employee employee1=(Employee)o2;
        return employee.id-employee1.id;
    }


}


class  Employee   {//implements Comparable
    String name;

    int wage;

    int id;

    public Employee(String name,int wage,int id) {
        this.name = name;
        this.id=id;
        this.wage=wage;
    }

    @Override
    public String toString() {
        return "{编号："+this.id+"  姓名:"+this.name+"  薪水："+this.wage+"}";
    }
/*
    @Override//元素与元素之间的比较规则
    //返回一个负整数，零（视为重复元素）或正整数，因为该对象小于，等于或大于指定对象。
    public int compareTo(Object o) {

        Employee employee=(Employee)o;
        //System.out.println(this.name+"compare"+ employee.name);
        return this.wage-employee.wage;
    }*/



}



public class TreeSet_ {
    public static void main(String[] args) {
       //创建一个比较器对象
        MyComparator comparator = new MyComparator();
        //创建TreeSet传入比较器

        TreeSet  treeSet = new TreeSet(comparator);
       /* treeSet.add(1);
        treeSet.add(10);
        treeSet.add(9);
        treeSet.add(7);
         System.out.println(treeSet);//[1, 7, 9, 10]
         */
     /*   treeSet.add('a');
        treeSet.add('d');
        treeSet.add('c');
        System.out.println(treeSet);//[a, c, d]*/

        treeSet.add(new Employee("马大哈",300,110));
        treeSet.add(new Employee("老码",200,150));
        treeSet.add(new Employee("老弟",500,120));
        treeSet.add(new Employee("老西",700,190));
        System.out.println("元素"+treeSet);

    }
}
