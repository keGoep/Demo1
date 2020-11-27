package Day15;

import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

/**
 * @Author LinQ
 * Date:
 * Weather：
 */
/*需求：将字符串的数值进行排序：

    例：String str= "8  10  15 5 2 7"---->"2 5 7 8 10"

    转符串转int类型数据，是需要使用integer.parseInt

*/



public class test_6 {
    private static Integer integer;

    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();
        String str="8 10 15 2 7";
       String [] dates= str.split(" ");
       for(int i=0;i<dates.length;i++){
           treeSet.add(integer.parseInt(dates[i]));//转符串转int类型数据，是需要使用integer.parseInt
       }
       //遍历treeSet元素拼成对应的字符串
        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }


         
    }
}
