package Day15;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author LinQ
 * Date:2020/11/25
 * Weather：Rainy
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






------------TreeSet
 */
 class Per{
    int id ;

    String name;

    public Per(int id,String name) {
        this.id = id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "{编号:" +
                 this.id +"姓名"+
                this.name+"}";
    }

    @Override
    public boolean equals(Object obj) {
        //System.out.println("====equals被调用了====");
        Per per= (Per)obj;
        return this.id==id;
    }

    @Override
    public int hashCode() {
       //System.out.println("====hashCode方法调用了====");// 往Hash添加元素的时候,HashSet会先调用元素的HashCode方 次数为4
        return this.id;
    }
}


public class Hash_Set {
     public static void main(String[] args) {
    /*  HashSet hashSet = new HashSet();
      hashSet.add("狗娃");
      hashSet.add("狗剩");
      hashSet.add("狗蛋");

      System.out.println("集合的元素:"+hashSet);*/
      HashSet hashSet = new HashSet();
      hashSet.add(new Per(110,"狗娃"));
      hashSet.add(new Per(220,"狗剩"));
      hashSet.add(new Per(330,"铁蛋"));
      //在现实生活中只要编号一致就位同一个人
      hashSet.add(new Per(110,"王大福"));

      System.out.println("集合的元素是："+hashSet);

    }
}
