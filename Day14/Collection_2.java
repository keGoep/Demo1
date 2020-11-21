package Day14;

import javafx.print.PaperSource;

import java.util.ArrayList;
import java.util.Collection;

/*
 判断
        contains(Object o)
        如果此集合包含指定的元素，则返回 true 。
        containsAll(Collection<?> c)
        如果此集合包含指定 集合中的所有元素，则返回true。
        isEmpty()
        如果此集合不包含元素，则返回 true 。


 */
class Person{

    String name;

    int id;

    public  Person(String name,int id){
        this.name=name;
        this.id=id;
    }


    @Override
    public String toString() {
        return "姓名"+this.name+"编号"+this.id;
    }

    @Override
    public boolean equals(Object obj) {
        Person p = (Person)obj;
        return this.id==p.id;
    }

    //一般重写了equals方法都会重写hashCode方法
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

class Dog{


}



public class Collection_2 {
    public static  void main(String[]args) {

   /*     Collection c = new ArrayList();
        c.add("令计划");
        c.add("马保国");
        c.add("小李飞刀");
        //c.clear();
        //System.out.println("判断集合是否为空:"+c.isEmpty());
        System.out.println("判断集合是否为空:"+c.isEmpty());//false
        System.out.println("判断集合是否存在指定的元素"+c.contains("马保国"));//true
*/
         //添加自定义元素
   /*     Collection c = new ArrayList();
        c.add(new Person("马保国",110));
        c.add(new Person("马冬梅",111));
        c.add(new Person("马大哈",112));
        c.add(new Person("马上到",113));*/

        //c.contains(new Dog());//用了实参的equals方法
        Collection c2= new ArrayList();
        c2.add(new Person("狗娃",121));
        c2.add(new Person("狗剩",122));

         System.out.println("c集合包含c2有包含c2集合的所以元素吗？"+c2.containsAll(c2));//false

        /*//如果在现实生活中只要身份证编号一致，那么就是同一个人
        System.out.println("存在该元素吗?"+c.contains(new Person("马保国",110)));//存在该元素吗?false
        //其实contains方法内部依赖于equals方法比较
        System.out.println(c);*/

    }
}
