package Day17;

/**
 * @Author LinQ
 * Date:12/1
 * Weather：Rainy
 */
/*


jdk1.5的新功能---->可变参数
定义一个参数做加法功能（不限个数加法，函数做几个数据的加法功能是不确定的）

可变参数的格式是:
         数据类型 ...变量名

  可变参数要注意的细节：
          1.一个函数的形参使用上了可变参数之后，调用该方法的时候可以传参数也可以不传参数
          2.可变参数实际上是一个数组对象
          3.可变参数必须位于形参中的最后一个参数
          4.一个函数最多只能由一个可变参数 ， 因为可变参数 要位于形参中最后一个位置上
*/
public class variable_param {
    public static void main(String[] args) {
        //int []arr={1,2,4,5,666,1};
        add(1,2,3,4,5);
    }

    public static void add(int ...arr) {

        System.out.println("...arr的长度是："+arr.length);//5   add();那么arr.length就是0
         int result =0;
         int []arr2={};
         for(int item : arr2){
             result+=item;
         }
        System.out.println("总和："+result);
    }


}
