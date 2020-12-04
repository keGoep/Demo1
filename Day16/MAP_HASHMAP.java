package Day16;

import java.util.HashMap;

/**
 * @Author LinQ
 * Date:2020/11/28
 * Weather：Cloudy
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


-----------|TreeMap

-----------|Hashtable


 */
class Person{

    int id;

    String name;

    public Person(int id,String name) {
        this.id = id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "[姓名："+this.name+"  编号："+this.id+"]";
    }


    @Override
    public boolean equals(Object obj) {
        Person p =(Person)obj;
        return this.id== p.id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}



public class MAP_HASHMAP {
    public static void main(String[] args) {
        HashMap<Person,String> hashMap = new HashMap();
        hashMap.put(new Person(110,"狗蛋"),"宝宝花园");
        hashMap.put(new Person(110,"狗蛋"),"海绵宝宝");
        hashMap.put(new Person(130,"狗娃"),"天线宝宝");
        hashMap.put(new Person(100,"狗剩"),"花园宝宝");//如果出现了相同的键，那么后添加的值会取代之前的值
        System.out.println(hashMap);//{[姓名：狗娃  编号：130]=天线宝宝, [姓名：狗剩  编号：100]=花园宝宝, [姓名：狗蛋  编号：110]=海绵宝宝}


    }
}
