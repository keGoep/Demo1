package Day16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author LinQ
 * Date:2020/11/30
 * Weather：Sunny
 */
/*
查找：

必须首先将正则表达式（指定为字符串）编译为此类的实例。
然后将所得的图案可以被用来创建一个Matcher对象可以匹配任意character sequences针对正则表达式。
 执行匹配的              所有状态都驻留在匹配器中          ，所以许多匹配者可以共享相同的模式。

因此，典型的调用序列

 Pattern p = Pattern.compile("a*b");
 Matcher m = p.matcher("aaaaab");
 boolean b = m.matches();

  查找需要使用的对象：
           1.Pattern(正则对象)
           2.Matcher(匹配器对象)

 匹配器要使用到的方法：
     1.find()通知匹配器匹配字符串查找符合规则的字符串  如果能找到符合规则的字符串返回true  否则返回false(每次只查找一次)
     2.group() 获取符合规则的子串

注意：使用group方法的时候，一定要先调用find方法，让匹配器查找符合规则的字符串否则报错。

 */
public class Regular_Search {
    public static void main(String[] args) {
        //需求是：找出三个字母组成的单词
        String content = "da  jia  de  jia  qi  wang  bi  liao  hai  kai xin ma";
        String reg = "\\b[a-zA-Z]{3}\\b";
        //先把字符串的正则编译成pattern的对象
        Pattern pattern = Pattern.compile(reg);
        //使用正则对象匹配字符串 用于产生一个匹配器对象
        Matcher matcher = pattern.matcher(content);

        /*System.out.println("有符合规则的字符串吗？"+matcher.find());//true
        System.out.println("获取符合规则的子串:"+matcher.group());*/

        //System.out.println("获取到符合规则的子串为："+matcher.group());//IllegalStateException: No match found
        int i = 0;
        while (matcher.find() == true) {
            i++;
            System.out.println("第" + i + "次获取到符合规则的子串为：" + matcher.group());
        }
    }
}
