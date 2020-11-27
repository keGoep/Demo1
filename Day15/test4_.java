package Day15;

import com.sun.istack.internal.localization.NullLocalizable;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;

import java.util.LinkedList;

/**
 * @Author LinQ
 * Date:2020/11/26
 * Weather：Rainy
 */
/*
自定义：


 */
class Person{

    String name;

    int age;

    public Person(String name,int age) {
        this.name = name;
        this.age=age;
    }


    @Override
    public String toString() {
        return "{名字:"+this.name+"年龄："+this.age+"}";
    }


    @Override
    public boolean equals(Object obj) {
        Person person = (Person)obj;
        return this.age==person.age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


}



public class test4_ {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(new Person("狗娃",7));
        list.add(new Person("狗剩",17));
        list.add(new Person("铁蛋",3));
        list.add(new Person("美美",30));
        Sort(list);
        //编写一个函数根据人的年龄进行排序
    }

    public static void Sort(LinkedList list){

        int size=list.size();

        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                Person p1=(Person)list.get(i);
                Person p2=(Person)list.get(j);
               if(p1.age>p2.age){
                   //交换位置
                   list.set(i,p2);
                   list.set(j,p1);
               }
            }
        }
        System.out.println(list);


    }
}
