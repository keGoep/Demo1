package Day16;

import com.sun.xml.internal.bind.v2.util.QNameMap;

import java.security.KeyStore;
import java.util.*;

/**
 * @Author LinQ
 * Date:2020/11/28
 * Weather：Rainy
 */
/*
 迭代

           keySet()
           values()
           entrySet


 */
public class Map_diedai {
    public static void main(String[] args) {
        Map<String ,String> map =new HashMap<String,String>();

        map.put("汪峰","章子怡");
        map.put("关晓彤","鹿晗");
        map.put("小鸟游六花","勇太");

        map.put("成龙","林凤娇");
        //map集合遍历方式一：使用keySet方法遍历
   /*     Set<String> keys =map.keySet();//把map集合中所有的键都保存到一个Set集合中返回
       Iterator<String> it= keys.iterator();
        while(it.hasNext()){
            String key=it.next();
            System.out.println("键："+it.next()+"值："+map.get(key));
        }*/

   //map集合遍历的方式二：使用value方法遍历  缺点：value方法只能返回所有的值没有键
      /*  Collection<String> c=map.values();//把所有的值存储到一个Collection中返回
        Iterator it = c.iterator();
        while(it.hasNext()){
            System.out.println("值："+it.next());
        }*/
      //entry是一个静态内部类
      Set<Map.Entry<String, String>> entries = map.entrySet();
      Iterator<Map.Entry<String,String>> iterator=entries.iterator();
      while(iterator.hasNext()){
          Map.Entry<String,String>entry = iterator.next();
          System.out.println("键："+entry.getKey()+"值："+entry.getValue());//getKey和getValue在entrySet这个方法中
      }

    }
}
