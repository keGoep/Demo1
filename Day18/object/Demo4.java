package Day18.object;

import java.util.Arrays;

public class Demo4 {
    public  static  void  main(String[]arg){
       String str="Demo.java";
       System.out.println("是否以指定的字符串结束："+str.endsWith("jab"));

        System.out.println("是否以指定的字符串结束："+str.isEmpty());
        System.out.println("字符串是否包含指定内容："+str.contains(".j"));
        System.out.println("是否以指定的字符串结束："+"Demo.java".equals(str));
        System.out.println("是否以指定的字符串结束："+"DeMo.jAva".equalsIgnoreCase(str));

        //转换方法
        char[] buf=str.toCharArray();
        System.out.println("字符数组"+ Arrays.toString(buf));
        byte[] buf2=str.getBytes();
        System.out.println("字节数组"+Arrays.toString(buf2));
    }
}
