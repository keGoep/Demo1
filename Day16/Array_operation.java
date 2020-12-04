package Day16;

import java.util.Arrays;
import java.util.List;

/**
 * @Author LinQ
 * Date:2020/11/29
 * Weather：Sunny
 */
/*
数组的工具类（Arrays）
   1.二分法查找：
      binarySearch(int [])
      binarySearch(double[])

   2.数组排序：
   sort(int [])
   sort(char [])

   3.将数组变成字符串
   toString(int [])

   4.复制数组
   copyOf(boolean[] original, int newLength)
    1. original:源数组
    2.new Length新数组长度

    复制部分元素：
    copyOfRange(boolean[] original, int from, int to);
         1. original:源数组
         2. from 开始拷贝的索引值
         3. to 结束的索引值


   5.比较两个数组对应位置的元素是否相等
    Boolean equals(int [],int [])


   6.将数组变成集合
    List asList(T[]);
    集合变成数组 用toArray();


 */
public class Array_operation {
    public static void main(String[] args) {
      /*  int [] arr={10,8,6,9};
        int []arr1=Arrays.copyOf(arr,6);
       System.out.println("拷贝后的数组元素是："+Arrays.toString(arr1));//拷贝后的数组元素是：[10, 8, 6, 9, 0, 0]*/
        Integer[] arr={10,8,6,9};
        Integer []arr1=Arrays.copyOf(arr,6);
        //Integer是一个类那么就是引用类型变量那么 这里新添加的长度就是null
        //System.out.println("拷贝后的数组元素是："+Arrays.toString(arr1));//拷贝后的数组元素是：[10, 8, 6, 9, null, null]
        Integer []arr2 =Arrays.copyOfRange(arr,1,3);
        System.out.println("拷贝后的元素是："+Arrays.toString(arr2));//拷贝后的元素是：[8, 6]
         System.out.println("判断两个数组的元素是否完全一致："+Arrays.equals(arr,arr2));//判断两个数组的元素是否完全一致：false

        List<Integer> list=Arrays.asList(arr);
        System.out.println("集合的元素是："+list);//集合的元素是：[10, 8, 6, 9]
        Integer[]arr4= (Integer[]) list.toArray();
        System.out.println("数组的元素是："+Arrays.toString(arr4));//数组的元素是：[10, 8, 6, 9]
    }
}
