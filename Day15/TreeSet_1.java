package Day15;

/**
 * @Author LinQ
 * Date:
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
    2.往TreeSet添加元素的时候，如果元素本身具备自然顺序的特性，那么该元素所属的类必须要实现Comparable接口，把元素的比较规则定义在CompareTo(T o)方法

TreeSet 的存储原理:低层是使用红黑树（二叉树）实现的数据结构
      红黑树存储规则:左小右大




 */
public class TreeSet_1 {
    public static void main(String[] args) {

    }
}
