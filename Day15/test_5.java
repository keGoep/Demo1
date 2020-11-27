package Day15;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author LinQ
 * Date: 2020/11/25
 * Weather：Rainy
 */
/*

需求：接收键盘录入用户名或者密码，如果用户名与密码已经存在集合中，那么就视为重复元素，不允许添加



 */
class User{

  String username;
  String password;

  public User(String username,String password ){
      this.username=username;
      this.password=password;
  }

    @Override
    public String toString() {
        return "{用户名："+this.username+"密码："+this.password+"}";
    }

    @Override
    public   int   hashCode() {//abc 123---->  123  abc--->但是又equals这道防线
       return username.hashCode()+password.hashCode();//字符串的hashCode方法
    }

    @Override
    public boolean equals(Object obj) {
       User user = (User) obj;
       return this.username.equals(username)&&this.password.equals(password);//用户名与密码一致为同一个用户
    }
}

public class test_5 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          HashSet hashSet = new HashSet();
          //创建一个对象
        while(true) {
            System.out.println("请输入用户名：");
            String username = scanner.next();
            System.out.println("请输入密码：");
            String password = scanner.next();
            User user = new User(username, password);

            if (hashSet.add(username)) {
                System.out.println("注册成功");
                System.out.println("当前的用户" + hashSet);
            } else {
                System.out.println("注册失败");
            }
        }
    }
}
