package Day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author LinQ
 * Date:2020
 * Weather：Rainy
 */
/*
输出字节流：
 --------|   OutputStream 是所以输出字节流的父类   抽象类
 -----------|    FileOutStream 向文件输出数据的输出字节流。

 FileOutStream 如何使用呢？
   1.找到目标文件
   2.建立数据的输出通道
   3.把数据转换成字节数组写出
   4.关闭资源

   FileOutStream要注意的细节？
   1.使用FileOutputStream 的时候，如果目标文件不存在，那么会自动创建目标文件对象
   2.使用FileOutputStream 的时候，如果目标文件的内容以及存在，那么会清空目标文件中的数据然后再写入数据
   3.使用FileOutputStream 的时候, 如果目标文件已经存在，需要在原来的数据基础上追加数据的时候，应该使用new FileOutputStream(file,true);第二个参数为true，表示追加
   4.使用FileOutputStream 的write方法写数据的时候，输入接收的是一个int类型的数据，但是真正写出的只是一个字节的数据，
   只是把低八位的二进制数据写出，其他二十四位数据全丢。

   0000 0000-0000 0000 - 0000 0001-1111 1111 511


 */

public class IO_2 {
    public static void main(String[] args) throws IOException {
      writeTest2();
    }

    //使用字节数组把数据写出。
    public static  void writeTest2() throws IOException {
        File file = new File("E:\\a.txt");
        //建立数据的输出通道
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        //把数据写出
        String data ="\n\n\n\nhello world";
        fileOutputStream.write(data.getBytes());//getBytes转换为字节数组
        //关闭资源
        fileOutputStream.close();

    }




    //每次只能写一个字节的数据
    public static void writeTest() throws IOException {
        File file = new File("E:\\a.txt");
        //建立数据的输出通道
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //把数据写出
        fileOutputStream.write('h');
        fileOutputStream.write('e');
        fileOutputStream.write('1');
        fileOutputStream.write('1');
        fileOutputStream.write('o');
        //关闭资源
        fileOutputStream.close();

    }


}
