package Day18;

import java.io.*;
import java.util.Arrays;

/**
 * @Author LinQ
 * Date:2020/12/8
 * Weather：Rainy
 */
/*
 4.使用FileOutputStream 的write方法写数据的时候，输入接收的是一个int类型的数据，但是真正写出的只是一个字节的数据，
   只是把低八位的二进制数据写出，其他二十四位数据全丢。

   0000 0000-0000 0000 - 0000 0001-1111 1111    ----->0000 0000  -1 ---------->-1
 */
public class Test {
    public static void main(String[] args) throws IOException {

       readTest();
    }

    public static void readTest() throws IOException {
        //找到目标文件
        File file = new File("E:\\a.txt");
        //建立数据的通道
        FileInputStream fileInputStream = new FileInputStream(file);
        //建立缓冲数组读取文件数据
        byte[] buf = new byte[4];
        int length = fileInputStream.read(buf);
        System.out.println("字节数组的内容"+ Arrays.toString(buf));
        //关闭资源
        fileInputStream.close();

    }

    public static void writeTest() throws IOException {
        File file = new File("E:\\a.txt");
        //建立数据的输出通道
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //把数据写出
        fileOutputStream.write(511);
        //关闭资源
        fileOutputStream.close();
    }

}
