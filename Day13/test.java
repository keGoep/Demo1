package Day13;


import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public  static  void main(String[]args){
       while(true) {

           Date date = new Date();//获取当前的系统时间
            try {
                Thread.sleep(1000);
            }catch(InterruptedException e){
            }
           SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");//使用了默认的格式创建了一个日期格式化
           String time = dateFormat.format(date);//把日期指定转换指定格式的字符串
           System.out.println("当前的系统时间是:" + time);//2020年11月15日17:33:21
       }
    }
}

