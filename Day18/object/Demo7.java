package Day18.object;

/*
字符串不变; 它们的值在创建后不能被更改。 字符串缓冲区支持可变字符串。 因为String对象是不可变的，它们可以被共享

字符串内容一旦发生了变化那么马上会创建一个新的对象

字符串的内容不适宜频繁修改，因为一旦修改就会马上创建一个新的对象

如果需要频繁修改字符串内容，建议使用字符串缓冲类

StringBuffer 其实就是一个存储字符的容器
容器具备： 增 删 查 改  判断 功能


增
append(boolean b)       将 boolean参数的字符串表示附加到序列中。
append()可以添加任意类型的数据到容器中
insert(int offset, boolean b) 在此序列中插入 boolean参数的字符串表示形式。


删
delete(int start, int end) 根据指定的开始于结束删除对应的内容
deleteCharAt(int index) 删除 char在这个序列中的指定位置（删除一个字符）。

查
indexOf(String str, int fromIndex) 查找指定的字符串第一次出现的索引值，并且指定开始查找的位置
capacity() 返回当前容量。    查看当前数组的长度 。   不是查看存储了多少个字符而是查看数组的长度
charAt(int index) 返回 char在指定索引在这个序列值。
lastIndexOf(String str) 返回指定子字符串最右边出现的字符串内的索引
length() 返回长度（字符数）。

改
ensureCapacity(int minimumCapacity) 指定StringBuffer内部的字符数组长度。
replace(int start, int end, String str)   根据指定的开始与结束索引值替代成指定的内容                 用指定的String中的字符替换此序列的子字符串中的 String
reverse() 导致该字符序列被序列的相反代替。 abc-->cba
setCharAt(int index, char ch) 把指定索引值的字符替代成指定的字符
substring(int start, int end) 根据自定的索引值截取子串。返回的  是一个 字符串
toString();//把字符串缓冲类的内容转换成字符串返回


StringBuffer与StringBuilder的不同之处

  相同点 ：
  1。两个类都是字符串缓冲类
  2.两个类的方法都是一致的

  不同点：
     1.StringBuffer是线程安全的     操作效率低  在一个时间段只允许一个人做该事情，不允许多个人操作
       StringBuilder是线程非安全的  操作效率高
     2.StringBuffer是jdk1.0出现的， StringBuilder是jdk1.5出现的。

     推荐使用使用StringBuilder ，因为操作效率高



笔试题目：使用StringBuffer无参的构造函数创建一个对象时，默认的初始容量是多少，如果不够了增长多少？
    StringBuffer底层依赖了一个字符数组才能存储字符数据的，该字符数组默认的 初始容量是16    ，如果字符数组的长度不够使用时，自动增长一倍




添加数据
    append();



 */

public class Demo7 {
    public static void main(String []arr){

        //先使用StringBuffer无参的构造函数创建一个字符串缓冲类
        StringBuffer sb = new StringBuffer();
        //sb.append("输出字符串缓冲类的内容:");
        sb.append("abcjavaabc");
        /*添加的方法
        sb.append(true);
        sb.append(3.14f);
        插入的方法

        sb.insert(2,"小马");//ab小马c

        删除的方法
        sb.delete(2,4);//abc  包头不包为
        sb.deleteCharAt(0);//bc 删除 char在这个序列中的指定位置。


        sb.replace(0,3,"马冬梅不吃酸梅");//马冬梅不吃酸梅

        sb.reverse();//cba



       //sb.setCharAt(0,'杰');//杰ab
       //String subString=sb.substring(0,1);
        // System.out.println(subString);

        //sb.ensureCapacity(20);一般不使用，会在构造方法上使用 StringBuffer(int capacity)
          查看

        int index  = sb.indexOf("abc",1);
         System.out.println("索引值为："+index);
         */
        //abcjavaabc
        sb.append("javajava");
        //abcjavaabcjavajava
        System.out.println("查看字符串数组的长度："+sb.capacity());//34 不是查看存储了多少个字符而是查看数组的长度
        System.out.println("字符串缓冲类的内容"+sb);
        System.out.println("c存储字符的个数"+sb.length());//18
        System.out.println("根据指定的索引值查找索引值:"+sb.charAt(2));//c
        String content= sb.toString();
      test(content);//StringBuffer有很多字符数据但是sb中无法传入，用toString把字符串缓冲类的内容转换成字符串返回
    }
    public static void test(String str){


    }
}
