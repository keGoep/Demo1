package Day15;

/**
 * @Author LinQ
 * Date:2020/11/25
 * Weather：Rainy
 */


public class Example {
    public static void main(String[] args) {
        String str="hello";//字符串常量池中
        String str2= new String("hello");//堆内存中
        System.out.println("两个是同一个对象吗？"+str==str2);//false
        System.out.println("str的hashCode:"+str.hashCode());//99162322
        System.out.println("str2的hashCode："+str2.hashCode());//99162322
        // h = 31 * h + val[i]; 源码中，说明字符长度一致返回的哈希码也是一致的
        //注意:两个字符串的内容一致，那么返回的hashCode码肯定一致
        //hashCode默认情况下表示的是内存地址String类已经重写了Object的hashCode方法了


    }
}
