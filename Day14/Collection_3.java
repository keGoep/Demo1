package Day14;
/*

 迭代
  toArray


 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class Cat{

    String name;

    int age;

    public  Cat(String  name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}



public class Collection_3 {
    public static  void main(String[]args) {
       /* Collection c = new ArrayList();
        c.add("令计划");
        c.add("马保国");
        c.add("小李飞刀");

        Object []arr =c.toArray();//把集合元素全部存储到一个Object的数组返回
        System.out.println(Arrays.toString(arr));//[令计划, 马保国, 小李飞刀]*/

        Collection c = new ArrayList();
        c.add(new Cat("白猫",11));
        c.add(new Cat("花猫",12));
        c.add(new Cat("龙猫",100));
        Object []arr =c.toArray();
        //需求：把编号是11的猫的信息输出
        for(int i=0;i<arr.length;i++){

      /*   Cat cat =(Cat) arr[i];//Object数组中取出的元素只能用Object接收如果需要其他的类型只能进行强制类型转换
            if(cat.age==100){
                System.out.println(cat);
            }*/


        }



    }
}
