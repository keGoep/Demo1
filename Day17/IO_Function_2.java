package Day17;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author LinQ
 * Date:2020/12/4
 * Weather：Rainy
 */
/*

  获取：

        getName()   获取文件或火箭家的名字，不包含上级路径
        getPath()   返回绝对路径，可以是相对路径，但是目录要指定
        getAbsolutePath() 获取文件的绝对路径，与文件是否存在没关系
        length()  获取文件的大小（字节数），如果文件不存在则返回0L,如果是文件夹也返回0L
        getParent()  返回次抽象路径名父目录的路径名字符串,如果此路径没有指定父目录，则返回null
        lastModified() 获取最后一次被修改的时间



 */
public class IO_Function_2 {
    public static void main(String[] args) {
        File file = new File("..\\ads.txt");
        System.out.println("文件名："+file.getName());
        System.out.println("返回最对路径："+file.getPath());
        System.out.println("getAbsolutePath获取绝对路径："+file.getAbsolutePath());
        System.out.println(file.exists());
        System.out.println("获取文件的大小(以字节为单位):"+file.length());
        System.out.println("获取文件的父路径："+file.getParent());
        //file.delete();

        //使用毫秒值转换为Date对象
        long lastModified = file.lastModified();
        Date date=new Date(lastModified);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        System.out.println("获取最后一次的修改时间(获取毫秒值)："+dateFormat.format(date));
    }
}
