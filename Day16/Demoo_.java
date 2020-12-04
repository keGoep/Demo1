package Day16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author LinQ
 * Date: 2020/11/30
 * Weather：Sunny
 */
/*
网络爬虫(网络蜘蛛)：



 */

// //编写一个邮箱：用户名@qq或者是163.com.n   .com  .cn   .net
public class Demoo_ {
    public static void main(String[] args) {

        String content="有事没事联系：1122423@163.com 有事没事联系：1122423@qq.com 有事没事联系：1122423@163.com.cn 有事没事联系：1122423@163.com" +
                " 有事没事联系：1122423@163.com.cn 有事没事联系：1122423@163.com 有事没事联系：1122423@163.net";

         String reg = "[a-zA-Z1-9]\\w{5,17}@[a-zA-Z0-9]{2,}(\\.(com|cn|net)){1,2}";//   "\\."才是匹配一个真实的.的不然就是特殊含义：任何值
                                                                                   //把\\.com cn net 分组复用起来 复用的次数是1到2次
         //把正则字符串的正则编译成正则对象
        Pattern pattern  = Pattern.compile(reg);
        //使用正则对象产生匹配器对象
        Matcher matcher = pattern.matcher(content);
        while(matcher.find()){
            System.out.println("获取到的邮箱是："+matcher.group());
        }

    }
}
