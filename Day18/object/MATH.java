package Day18.object;

import java.util.Random;

/*
Math主要提供了很多的数学公式:

             abs(double a)
               返回值为 double绝对值。

            ceil(double a)
            向上取整
            返回大于或等于参数的最小（最接近负无穷大） double值，等于一个数学整数。

            floor(double a)
            向下取整

            round(float a)四舍五入
            random()  参数一个随机数  返回一个double值为正号，大于等于0.0 ，小于1.0 。


            随机数类
            Random  在util包




 */
public class MATH {
    public static  void main(String []arg){
        /*
        System.out.println("绝对值："+Math.abs(-3));//3
        System.out.println("向上取整:"+Math.ceil(-3.14));//-3.0
        System.out.println("向下取整"+Math.floor(3.14));//3.0
        System.out.println("四舍五入"+Math.round(3.54));//4
        System.out.println("随机数"+Math.random());
         */
        Random random = new Random();
        //int num=random.nextInt(11);//产生的随机数就是0-10

        while(true) {
            int num = random.nextInt(10) + 1;//产生的随机数要是1-10的话
            System.out.println(num);
        }
    }
}
