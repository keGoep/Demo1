package Day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author LinQ
 * Date:2020/12/8
 * Weather：Rainy
 */
/*
问题：读取完一个文件的数据的时候，不关闭会有什么影响？

解： 资源文件一旦使用完毕应该马上释放，否则其他的程序 无法对资源文件进行其他的操作


 */
public class IO_1 {
    public static void main(String[] args) throws IOException {
        //找到目标文件
        File file = new File("E:\\a.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        //建立缓冲数组
        byte []buf = new byte[4];
        int length = 0;
        while((length=fileInputStream.read(buf))!=-1){
            System.out.println(new String(buf,0,length));//如果不加length，那么就是 覆盖
        }
         System.out.println("读取文件资源完毕...");
        //关闭资源
        fileInputStream.close();
    }
}
