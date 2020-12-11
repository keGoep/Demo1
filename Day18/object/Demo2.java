package Day18.object;


/*



 */
public class Demo2 {
    public static void main(String []arg) {
     String str1="hello";
     String str2="hello";
     String str3=new String("hello");
     String str4=new String("hello");
    System.out.println("str1==str2?"+(str1==str2));
        System.out.println("str2==str3?"+str2==str3);
        System.out.println("str3==str4?"+str3==str4);
        System.out.println("str3.equals(str4)?"+str3.equals(str4));

        test(null);
    }
    public static void test(String str){
        if("中国".equals(str)){
            System.out.println("回答正确");
        }else{
            System.out.println("回答错误");
        }

    }
}
