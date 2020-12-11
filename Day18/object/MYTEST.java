package Day18.object;

/*
  需求1：实现tirm()方法返回效果和tirm效果一样就是删除空格String str = "  传智  博客  ";

   需求2：获取上传的文件名  思路找到最后一个\的索引值 然后在截取\后面的内容(索引值+1)就是文件名str = "D:\\360downloads\\Demo11.java";

   需求3：返回字符串中存储的字符反序  "狗的真是你"   str = "狗的真是你";
   思路：先把字符串转换为字符，第一个下标和最后一个下标索引值，交换后，第一个索引值会+1，最后一个－1，直到开始索引值大于最后一个索引值，然后在将字符转换为字符串

   需求4：求一个子串在整串中出现的次数    str="abcjavaabcjavajavahp.java0";//求java在其中出现的次数
   思路：step1.定义一个变量记录出现的次数
        step2.定义一个变量记录开始寻找的索引值



 */
public class MYTEST {
    public static void main(String[] arg) {
      String  str="abcjavaabcjavajavahp.java0";
      Count(str,"java");

    }

    public static void Count(String str,String target){
        int count=0;//记录出现的次数
        int FromIndex=0;//记录从哪个索引值开始寻找目标子串

        while((FromIndex=str.indexOf(target,FromIndex))!=-1){
            //如果indexOf返回的不是-1那么就是已经找到了目标元素
            count++;
            //每找到一次formindex
            FromIndex+=target.length();
        }
        System.out.println(count);
    }








}

