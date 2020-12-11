package Day18.object;
/*
   日期类Date  在util包

  日期格式化类：
        SimpleDateFormat

*/
import java.text.ParseException;
import java.text.SimpleDateFormat;
import  java.util.Calendar;
import java.util.Date;

public class Demo10 {
     public static void main(String[]arg) throws ParseException {
         /*
         Date date = new Date();//获取当前的系统时间
     System.out.println("年份："+date.getYear());
      */
         Calendar calender = Calendar.getInstance();//获取当前的系统时间
         System.out.println("年"+calender.get(calender.YEAR));
         System.out.println("月"+(calender.get(calender.MONTH)+1));//国外从0算起，我国从1算起
         System.out.println("日"+calender.get(calender.DATE));
         System.out.println("时"+calender.get(calender.HOUR_OF_DAY));//HOUR是12进制的，HOUR_OF_DAY是24进制的
         System.out.println("分"+(calender.get(calender.MINUTE)));
         System.out.println("秒"+calender.get(calender.SECOND));

         // 显示当前系统时间xxxx年xx月xx日xx:xx:xx:

         /*日期格式化类：SimpleDateFormat
              作用1：可以把日期转换为指定格式的字符串  format()
              作用2：可以把一个字符串转换为对应的日期  parse()
              SimpleDateFormat()
              构造一个 SimpleDateFormat使用默认模式和日期格式符号为默认的 FORMAT区域设置。
              SimpleDateFormat(String pattern)
         使用给定模式 SimpleDateFormat并使用默认的 FORMAT语言环境的默认日期格式符号。
          */

         Date date = new Date();//获取当前的系统时间
         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");//使用了默认的格式创建了一个日期格式化
         String time=dateFormat.format(date);//把日期指定转换指定格式的字符串
         System.out.println("当前的系统时间是:"+time);//2020年11月15日17:33:21

         String birthday = "2000年12月26日17:34:07";
         Date date2=dateFormat.parse(birthday);//注意指定的字符串必须要与SimpleDateFormat的模式一直
         System.out.println(date2);

    }
}
