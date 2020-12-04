package Day16;

/**
 * @Author LinQ
 * Date:2020/11/30
 * Weather：Sunny
 */
/*

单词边界匹配器：
      \b ：单词边界匹配器只是代表了单词的开始或者是结束部分不匹配任何的字符。




 */
public class Boundary_matches {
    public static void main(String[] args) {
     System.out.println("hello,world".matches("hello\\b,world"));//true 单个单词的结束hello结束部分

    }
}
