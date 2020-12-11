package Day18.object;

/*
   需求1：实现tirm()方法返回效果和tirm效果一样就是删除空格

   需求2：获取上传的文件名  思路找到最后一个\的索引值 然后在截取\后面的内容(索引值+1)就是文件名

   需求3：返回字符串中存储的字符反序  "狗的真是你"
   思路：先把字符串转换为字符，第一个下标和最后一个下标索引值，交换后，第一个索引值会+1，最后一个－1，直到开始索引值大于最后一个索引值，然后在将字符转换为字符串

   需求4：求一个子串在整串中出现的次数
   思路：step1.定义一个变量记录出现的次数
        step2.定义一个变量记录开始寻找的索引值


 */
public class Demo6 {
    public static void main(String[] arg) {
        String str = "  传智  博客  ";
        str = myTrim(str);
        System.out.println(str);

        str = "D:\\360downloads\\Demo1.java";
        getFilename(str);

        str = "狗的真是你";
        System.out.println("翻转的结果："+getReverse(str));

        str="abcjavaabcjavajavahp.java0";//求java在其中出现的次数
        System.out.println("出现的索引值"+str.indexOf("java",5));//从第五个开始找java
        Count(str,"a");
    }

    //需求四
    public static void Count(String str,String target){
       int count=0;//记录出现的次数
       int FromIndex=0;//记录从哪个索引值开始寻找目标子串

       while((FromIndex=str.indexOf(target,FromIndex))!=-1){
           //如果indexOf返回的不是-1那么就是已经找到了目标元素
           count++;
           //没找到一次formindex
           FromIndex+=target.length();
       }
       System.out.println(count);
    }





    //需求三：返回字符串中存储的字符反序
    public static String getReverse(String value) {
        char[] arr = value.toCharArray();
        for (int startIndex = 0, endIndex = arr.length - 1; startIndex < endIndex; startIndex++, endIndex--) {
            char temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
        }
        //使用字符数组构建字符串
        return new String(arr);
    }


    //需求二
    public static void getFilename(String path){
     /*
      因为文件名一般为最后一个/的后面的字符串
      int index=path.lastIndexOf("D");
      String fileName=path.substring(index);
        System.out.println("文件名:"+fileName);
     */
        int index=path.lastIndexOf("\\");
         String fileName=path.substring(index+1);
        System.out.println("文件名："+fileName);
      /*

        String []arr=path.split("\\\\");////涉及正则表达式
        System.out.println("文件名："+arr[arr.length-1]);
    */
    }


   //需求一
    public static String myTrim(String str){
        //转换为字符数组
       char []arr= str.toCharArray();
        //定义两个变量记录开始的索引值与结束的索引值
        int startIndex= 0;
        int endIndex=arr.length-1;
        while(true) {
            if (arr[startIndex] == ' ') {
                startIndex++;
            } else {
                break;
            }
        }
            //确定结束的索引值
        while(true){
               if(arr[endIndex]==' '){
                   endIndex--;
            }else{
                break;
               }
        }
        //截取子串返回
      return  str.substring(startIndex,endIndex+1);

    }
}
