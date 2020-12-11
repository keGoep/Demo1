package Day18.object;

public class Demo3 {
    public  static  void  main(String[]arg){
        String str = "abc中国ab中国";
        System.out.println("该字符串的字符个数"+str.length());
        System.out.println("根据索引值获取对应的字符:"+str.charAt(3));
        System.out.println("查找子串第一次出现的索引值:"+str.indexOf("a"));
        System.out.println("查找子串最后一次出现的索引值:"+str.lastIndexOf("中"));

    }
}
