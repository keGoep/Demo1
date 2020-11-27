package Test__;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @Author LinQ
 */


/*判断打印是否为回文数

 回文数的含义:正着读倒着读都是一样的
 含有负号的一定不是回文数

时间复杂度：O（n）
空间复杂度: O(1)

 */
public class Palindromic_number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数:");
        String number = scanner.next();
        char[] arr = number.toCharArray();
        //输入一个数比如说12321
        //把它拆分为字符数组
        //获取字符数组的倒序
        String rev_num =  reverse(arr);

        if(number.equals(rev_num)&&number.indexOf("-")==-1){//比较字符串内容正负为一致，而且不含有符号才为回文数
            System.out.println("true，为回文数");
        }else{
            System.out.println("false,不为回文数");
        }

    }

    //翻转数
    public static String reverse(char[] arr) {
        for (int start = 0, end = arr.length-1; start <= end; end--, start++) {
            char temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
        }

         return new String(arr);
    }
}
