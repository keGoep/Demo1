package Day18.object;

public class Demo5 {
    public  static void main(String []arg) {
    String str="陈杰林青是帅哥";
    System.out.println(str.replace("帅哥","我的狗"));
    System.out.println(str.substring(2));
    System.out.println(str.substring(2,4));
    str="abcdef";
    System.out.println("转大写:"+str.toUpperCase());
    System.out.println("转小写:"+str.toLowerCase());
    str="   马达内               ";
    System.out.println("去除空格:"+str.trim());

    }
}
