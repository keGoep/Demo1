package Day16;

/**
 * @Author LinQ
 * Date:2020/11/29
 * Weather：Sunny
 */
public class Regular_expression {
    public static void main(String[] args) {
        /*预定义字符：
         .  任何字符  （与行结束符可能匹配也可能不匹配）
         \d 数字:[0-9]
         \D 非数字 [^0-9]
         \s 空白字符 [\t\n\x0B\f\r]
         \S 非空白字符 [^\s]
         \w 单词字符： [a-z A-Z - 0-9]
         \W 非单词字符 [^\W]
        注意：任何预定义字符没有加上    数量词 之前都只能匹配一个字符而已*/
        System.out.println("任意字符:" + "%".matches("."));//true 是任意字符而不是任意字符串
        System.out.println("数字字符：" + "1".matches("\\d"));//true
        System.out.println("非数字字符：" + "a".matches("\\D"));//true
        System.out.println("空白字符：" + "\r".matches("\\s"));// true \r是回车  \n是换行
        System.out.println("非空白字符：" + "1".matches("\\S"));//true
        System.out.println("单词字符：" + "2".matches("\\w"));//true  range--[a-z  A-Z - 0-9]
        System.out.println("非单词字符：" + "%".matches("\\W"));//不在 range--[a-z  A-Z - 0-9] 中

        /*数量词：
        X?X 一次或一次也没有
        X*X 零次或多次
        X +X, 一次或多次
        X{n}X ,恰好n次
        X{n,} X 至少n次
        X{n,m}X 至少n次,但是不超过m次*/

        System.out.println("？一次或者是一次都没有" + "12".matches("\\d?"));//false 只能出现一次或者一次都没有
        System.out.println("*零次或者多次" + " ".matches("\\d*"));//\\d* 数字只能出现0次或者多次
        System.out.println("+至少出现一次" + "  ".matches("\\d+"));//false
        System.out.println("{数字}要出现的次数 " + "12345678910".matches("\\d{11}"));//表示只能出现11位
        System.out.println("{ 次数,}至少要出现指定的次数" + "123".matches("\\d{3,}"));//至少出现3次
        System.out.println("{次数1，次数2} 指定出现次数的范围：" + "12332".matches("\\d{3,4}"));//指定出现数字的范围

        /*范围词：
         [abc]  a,b,c(简单类)
         [^abc]  任何字符除了abc (否定)
         [a-zA-Z]a到z 或A到Z 两头的字母 包括在内(范围)
         [a-d[m-p]]a到d或者m到p ： [a-dm-p]（并集）
         [a-z&&[def]] d,e,f(交集)

         注意：范围词里不管内容有多长，没有数量词的配都只能匹配一个字符而已
         */

        System.out.println("a".matches("[abc]"));//true
        System.out.println("2".matches("[^abc]"));//true
        System.out.println("字符可以出现在a-z之间"+"$".matches("[a-zA-Z$]"));//true
        System.out.println("d".matches("[def]"));//true

    }
}
