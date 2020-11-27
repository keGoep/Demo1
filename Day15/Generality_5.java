package Day15;

import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @Author LinQ
 * Date:2020/11/26
 * Weather：Rainy
 */
/*
泛型的上下限：

定义一个函数可以接收任意类型的集合对象
要求：接收集合对象只能存储Integer或者是Integer的父类数据类型

泛型中的通配符：？（匹配任意的数据类型）

<? super Integer> 只能存储存储 Integer或者是Integer的父类元素     泛型的下限

<? extends  Number>   只能存储Number或者是Number类型的子类元素           泛型的上限

定义一个函数可以接收任意类型的集合对象
要求：接收集合对象只能存储Number或者是Number的子类数据类型

 */

public class Generality_5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList =new ArrayList<Integer>();
        ArrayList<Number> arrayList1 =new ArrayList<Number>();
        HashSet<String> hashSet = new HashSet<String>();

        //get(hashSet);isFalse



    }

    public static void  print(Collection<? extends  Number> c){

    }


    //泛型的下限
    public static  void get(Collection <? super Integer> c){

    }


}
