package Day14;

/*

emission:
     登入 1.提示用户输入注册数字与密码,如果输入的id号已经存在集合中，提示用户重新输入，注册完毕，把集合中的所有用户信息打印出来，使用toArray方法
     注册 2.提示用户输入登入账号与密码，如果账号与密码这个用户已经存在集合那么登入成功，否则登入失败


*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;




public class test1{

    public  static  void main(String []args){
        Scanner scanner = new Scanner(System.in);
        Collection c1= new ArrayList();
        Collection c2= new ArrayList();
        Collection c3= new ArrayList();
        System.out.println("请输入密码：");
        c1.add(scanner.next());//c1中函自己添加的元素
        c3.add("林青");//c3也添加了一个元素
        System.out.println("请输入用户名：");
        c2.add(scanner.next());//添加元素
        while(true) {
            A:
            if(c3.containsAll(c2)==true) {
                System.out.println("输入重复，请重新输入");
                 c2.clear();
                 c2.add(scanner.next());
                break A;
            }else{
                System.out.println("可以输入");
                break;
            }
        }
       Object []arr2 =c2.toArray();
       Object []arr1 =c1.toArray();
        System.out.println("输入当前的密码:"+ Arrays.toString(arr1)+"输入用户名："+Arrays.toString(arr2));

    }

}
