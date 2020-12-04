package Day16;

/**
 * @Author LinQ
 * Date:
 * Weather：
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


class BK implements  Comparable<BK>{

        String BookName;


        String date;


public BK(String BookName, String date) {
        super();
        this.BookName = BookName;
        this.date = date;
        }

//先把字符串的日期转换为Date对象然后再使用Date对象进行比较
@Override
    public int compareTo(BK o) {
    //日期格式化类
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
    //使用日期格式化类转换
    Date date1=null;
    Date date2=null;

    try {
        date1=dateFormat.parse(this.date);//parse从字符串中解析文本以产生一个Date
        date2 =dateFormat.parse(o.date);
    } catch (ParseException e) {
        e.printStackTrace();
    }
   //获取毫秒值
    return  date1.compareTo(date2);
    }



@Override
public String toString() {
        return "书名："+this.BookName+"出版日期："+this.date;
        }

}


public class test_approach2 {
    public static void main(String[] args) {

        TreeMap<BK, String> treeMap = new TreeMap<BK, String>();//值存储书名
        Scanner scanner = new Scanner(System.in);//键盘录入书的信息
        treeMap.put(new BK(scanner.next(),"2021.1.1"),"001");
        treeMap.put(new BK(scanner.next(),"2020.1.23"),"002");
        treeMap.put(new BK(scanner.next(),"2020.1.27"),"003");
        treeMap.put(new BK(scanner.next(),"2021.1.28"),"004");


        Set<Map.Entry<BK,String>> set= treeMap.entrySet();
        Iterator<Map.Entry<BK,String>> iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<BK,String> map = iterator.next();
            System.out.println("输出的元素是："+map);
        }



    }

}
