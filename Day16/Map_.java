package Day16;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author LinQ
 * Date:2020/11/27
 * Weather：Cloudy
 */
/*

 在现实生活中有些数据是以映射关系存在的，就是成对存在的。比如：

  民政局：
  键与值
  夫与妻
  身份与人
  钥匙与锁

一队一队的存储;


    双列集合：
-------|Map   如果是实现了Map接口的集合类，具备的特点是：存储的数据都是与键(value)值(value)对的形式存在的，键不可以重复，值可以重复

-----------|HashMap

-----------|TreeMap

-----------|Hashtable


Map接口的方法：

         添加
            put(K key, V value)
            putAll(Map<? extends K,? extends V> m)

         判断
           containsKey(Object key)
           containsValue(Object value)
           isEmpty();

         删除
           clear()
           remove(Object key)

         获取
           get(Object key)
           size()

         迭代
           keySet()






 */

public class Map_ {

    public static void main(String[] args) {
      Map<String,String> map =new HashMap<String,String>();


        map.put("汪峰","章子怡");
        map.put("关晓彤","鹿晗");
        map.put("小鸟游六花","勇太");
        //添加的方法：
        /*System.out.println(map.put("小鸟游六花","林青")+"出去吧");//返回的值是：勇太//如果之前没有存在该键，那么返回的是null，如果之间存在键，那么返回的是该键之前的对应的值
        map.put("哈士奇","章子怡");
        System.out.println("集合的元素是："+map);//{小鸟游六花=林青, 关晓彤=鹿晗, 汪峰=章子怡, 哈士奇=章子怡}
        Map<String,String>map1=new HashMap<String, String>();
        map1.put("杨振宁","翁帆");
        map1.put("习总","彭丽媛");
        map.putAll(map1);//把map1的元素添加到map集合中
        System.out.println(map);//{小鸟游六花=勇太, 习总=彭丽媛, 关晓彤=鹿晗, 杨振宁=翁帆, 汪峰=章子怡}*/

        //删除的方法：
        //map.remove("汪峰");//根据键删除一条map中的数据,返回的是一条该键对应的值
        /*System.out.println("删除的数据是"+map.remove("汪峰"));//删除的是章子怡 ---键对应的值   如果没有该元素删除的就是null
        System.out.println(map);//{小鸟游六花=勇太, 关晓彤=鹿晗}
        map.clear();//删除所有元素
        System.out.println(map);//{}*/

        //为什么是根据键来上出数据的而不是根据值的？
        //因为键是不可重复的，可以确认一条数据，而值是不可以重复的，他确定多条数据，所有值确定不了一条数据
        //获取的方法：
        /*System.out.println("根据指定的键获取对应的值："+map.get("关晓彤"));//鹿晗
        System.out.println("获取map集合中的键值对个数："+map.size());//3*/

        //判断的方法：
        System.out.println("判断map集合是否包含指定的键:"+map.containsKey("关晓彤"));//true
        System.out.println("判断map集合中是否包含指定的值"+map.containsValue("鹿晗"));//true
        System.out.println("判断map集合是否为空元素:"+map.isEmpty());//false
      /*  map.clear();
        System.out.println(map.isEmpty());//true*/
         map.put(null,null);//null和null也能作为数据
         System.out.println(map.isEmpty());//false



    }
}
