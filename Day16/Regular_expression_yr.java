package Day16;

/**
 * @Author LinQ
 * Date:2020/11/29
 * Weather：Sunny
 */
/*
   正则表达式：操作字符串的一个规则，正则表达式的规则使用了特殊的符号表示
   需求：
     校验一个qq：
     1.不能以0开头
     2.长度5~11
     3.只能由数字组成




 */
public class Regular_expression_yr {

    public static void main(String[] args) {
        String qq = "1234567";
        //方式1：
        if (!qq.startsWith("0")) {
            if (qq.length() >= 5 && qq.length() <= 11) {
                try {
                    Long.parseLong(qq);//如果为龙类型没有报错那么就会得到一个合法qq
                    System.out.println("恭喜你得到了一个合法QQ");
                } catch (Exception e) {
                    System.out.println("非法QQ，QQ只能由数字组成");
                }
            }else{
                System.out.println("非法QQ,长度为5到11");
            }
        } else {
            System.out.println("非法QQ,开头不能以0开始");
        }
        //方式二：正则表达式
        System.out.println(qq.matches("[1-9]\\d{4,10}")?"合法qq":"非法qq");
    }
}
