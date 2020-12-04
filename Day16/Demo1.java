package Day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @Author LinQ
 * Date:2020/11/29
 * Weather：Sunny
 */
class Per1 {

    String name;

    int age;

    public Per1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{姓名：" + this.name + "年龄：" + this.age + "}";
    }

}
class AgeComparator implements Comparator<Per1>{

    @Override
    public int compare(Per1 o1, Per1 o2) {
        return o1.age-o2.age;
    }
}

public class Demo1 {

    public static void main(String[] args) {
        //如果集合存储的都是不具备自然顺序的元素，那么排序需要传入比较器
        ArrayList<Per1> list = new ArrayList<Per1>();
        AgeComparator ageComparator = new AgeComparator();
        list.add(new Per1("狗娃", 12));
        list.add(new Per1("张三", 3));
        list.add(new Per1("铁蛋", 2));
        list.add(new Per1("李四", 9));


        Collections.sort(list,ageComparator);
        System.out.println("集合中的元素："+list);
        System.out.println("找到的索引值的元素是："+Collections.binarySearch(list,new Per1("铁蛋",2),ageComparator));//找到的索引值的元素是：0
        //因为排完顺序，铁蛋是最小的
        System.out.println("最大值是"+Collections.max(list,ageComparator));//最大值是{姓名：狗娃年龄：12}
        System.out.println("最小值是"+Collections.min(list,ageComparator));//最小值是{姓名：铁蛋年龄：2}
    }
}
