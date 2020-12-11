package Day18.object;

import java.util.Arrays;

//定义一个数组 int []arr={11,2,4,2,10,11};
//   定义一个函数清楚该数组的重复元素，返回数组存储了那些非重复的元素而且不准浪费长度
public class test {
    public static void main(String []arg){
        int []arr={11,2,4,2,10,11};
        arr=clear(arr);
       System.out.println("输出数组的元素是："+ Arrays.toString(arr));
    }

     public static int[] clear(int []arr){
             //先计算除重复元素的个数
             int count =0;
             for(int i=0;i<arr.length-1;i++){
                 for(int j=i+1;j<arr.length;j++){
                     if(arr[i]==arr[j]){
                         count++;
                         break;
                     }
                 }
             }

             int newLength = arr.length-count;
             int []newArr = new int[newLength];
             //定义一个变量记录新数组使用的索引值
             int Index=0;

             //把旧数组元素存储到新数组中，存入前判断先判断该数组元素是否存在新数组中，如果存在了
             //那么该元素就不要了
             for(int i=0;i<arr.length;i++){
                 int temp= arr[i];//取出旧数组的元素
                 boolean flag=false;//定义一个变量用于记录当前元素是否为重复元素,默认不是重复元素

                 //检查新数组是否存在取出元素
                 for(int j=0;j<newArr.length;j++) {
                     if (newArr[j] == temp) {
                         flag = true;
                         //已经存在了新数组中
                         break;
                     }
                 }
                 //不是重复元素
                 if(flag==false){
                     newArr[Index++]=temp;
                 }
             }



             System.out.println("重复元素的个数是："+count);
             return  newArr;
         }
    }