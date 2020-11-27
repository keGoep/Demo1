package Day15;

/**
 * @Author LinQ
 * Date: 2020/11/26
 * Weather：Rainy
 */
//编写一个数组工具类
/*
 方法上自定义泛型：


         修饰符 <声明自定义泛型>返回值类型 函数名(使用自定义泛型){

        }

  泛型类：

       泛型类的自定义格式：
         class  类名<声明自定义泛型>{

         }

   泛型类要注意的事项：
       1.在类上自定义泛型的具体数据类型是在使用该类的时候创建对象时候确定的。
       2.如果一个两类在类上已经声明了自定义泛型，如果使用该类创建对象的时候没有指定泛型的具体数据类型，那么默认为Object类型
       3.在类上自定义泛型不能作用于静态的方法，如果静态的方法需要使用自定义泛型，那么需要在方法上自己声明使用。

        自定义泛型的具体数据类型是在使用该类的时候创建对象时候确定的，而静态的方法在类创建的时候一起创建了，不需要对象调用，



*/


 class  MyArray<T>{

    //元素翻转：
    public void reserve(T[] arr){
        for(int startIndex=0,endIndex=arr.length-1;startIndex<endIndex;startIndex++,endIndex--){
              T  temp = arr[startIndex];
              arr[startIndex]=arr[endIndex];
              arr[endIndex]=temp;
        }
    }


    public String  toString(T[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(i==0){
                sb.append("["+arr[i]+",");
            }else if(i==arr.length-1){
                sb.append(arr[i]+"]");
            }else{
                sb.append(arr[i]+",");
            }
        }
        return sb.toString();
    }


    /*public static void print(T[] t){ }   //is false*/

    /*public static<T> void print(T[] t){ }   //isTrue 在类上自定义泛型不能作用于静态的方法，如果静态的方法需要使用自定义泛型，那么需要在方法上自己声明使用。 */

}



public class Generality_3 {
    public static void main(String[] args) {
       MyArray<Integer> myArrayTool = new MyArray<Integer>();
       Integer []arr={12,123,131,19};
       myArrayTool.reserve(arr);
       System.out.println(myArrayTool.toString(arr));
    /*    String[]arr1 ={"a","b","c"};
        arr1.reverse(arr1);// isError*/
       MyArray<String> myArray = new MyArray<String>();
        String[]arr1 ={"a","b","c"};
       myArray.reserve(arr1);




    }
}
