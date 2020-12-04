package Day15;

import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

/**
 * @Author LinQ
 * Date:  2020/11/26
 * Weather： Rainy
 */


/*

      TreeSet是可以对字符串进行排序的,因为字符串已经实现了Comparable接口

       字符串的比较规则：

            情况1：
                对应位置有不同的字符出现，就比较的就是对应位置不同的字符

            情况2：
                对应位置上的字符都一样 ,比较的就是字符串的长度
              



 */
public class TreeSet_2 {
    public static void main(String[] args) {
    /*TreeSet treeSet = new TreeSet();
    treeSet.add("abc");
    treeSet.add("abw");
    treeSet.add("ab");
   System.out.println(treeSet);*/
    System.out.println("abw".compareTo("abcccc"));
    }
}
