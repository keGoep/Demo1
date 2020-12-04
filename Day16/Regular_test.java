package Day16;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author LinQ
 * Date:2020/11/29
 * Weather：Sunny
 */
/*
 正则表达式用于操作字符串的规则：
     正则表达式对字符串的操作有以下的操作  应用：


     匹配(Matcher)：


     切割(split)：


     替换：replaceAll(String regex ,String replacement)








 */


public class Regular_test {
    public static void main(String[] args) {

        String MyNumber = "18168608717";
        String tel = "012-3456789";
        String Email="126@163.com.cn";
        matchesPhone(MyNumber);
        MatchEmail(Email);
        matchesTel(tel);
        testSplit();
        testSplit2();
        replaceTest1();
        replaceTest2();
    }

    //需求：编写一个正则表达式匹配手机号 1.第一位是1开头  2. 第二位 3,5,4,7,8  3.长度是11位
    public static void matchesPhone(String PhoneNumber) {
        String reg = "1[34578]\\d{9}";
        System.out.println(PhoneNumber.matches(reg) ? "合法手机号" : "非法手机号");

    }

    //需求二：固定电话：  区号-主机号   区号：首位是0 长度是3~4  主机号：首位不能是0 长度：7~8
    public static void matchesTel(String tel) {
        System.out.println(tel.matches("0\\d{2,3}-[1-9]\\d{6,7}") ? "合法固定电话" : "非法固定电话");
    }

    //按照空格切割：
    public static void testSplit() {
        String str = "明天     搞   事    情";
        //按照空格切割
        String[] arr = str.split(" +");
        System.out.println("输出的字符串数组是 ：" + Arrays.toString(arr));
    }

    //根据重叠词进行切割
    public static void testSplit2() {
        String str = "大家家家家明天天玩得得得得得得得得开心";//疯  颠   地 玩 耍
        String[] arr = str.split("(.)\\1+");//如果正则的内容要被重复使用，那么需要对正则的内容进行分组，分组的目的就是为了提高正则的复用性
        //组号不能指定，组号是从1开始,\1表示第一组的内容
        System.out.println(Arrays.toString(arr));

        /*
        （）分组的目的是为了让正则的内容被赋予起来。组号从1开始
        ((A)(B(C)))  看对括号判断组数  次组为4，
         组号一的是:((A)(B(C)))
         第二组是:(A)
         第三组是:(B(C))
         第四组是:(C)

         (.1)\\1+注释：
         \\1:引用第一组所匹配到的内容
         */
    }

    //编写一个邮箱：用户名@qq或者是163.com.n
    public static void MatchEmail(String Email) {
        String str="[1,9]\\d{2,12}@(qq|163)(\\.(com|cn|net)){1,2}";
     System.out.println(Email.matches(str)?"合法邮箱":"非法邮箱");
    }

   //替换
    public static void replaceTest1(){
        String str="如果有需求请联系：13811111111如果有需求请联系：13811111111;如果有需求请联系：13811111111;" +
                "如果有需求请联系：13811111111;如果有需求请联系：13811111111;如果有需求请联系：13811111111;";
        String reg="1[34578]\\d{9}";
        str= str.replaceAll(reg,"******");
        System.out.println("被替换的内容是："+str);

    }

    //替换
    public static void replaceTest2(){
        String str="我我我我我我是是是是文文文文曲曲曲曲星星星星";//把重叠词替换成单个单词

        str=str.replaceAll("(.)\\1+","$1");//如果需要在replaceAll方法正则的外部 ，引用组的内容是使用"$组号"
         System.out.println(str);
    }






}


