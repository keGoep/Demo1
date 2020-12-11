package Day18;

import java.io.*;

/**
 * @Author LinQ
 * Date:2020/12/9
 * Weather：Windy
 */
/*
FileInputStream 内部有一个8kb的字节数组

读取文件数据使用缓冲数组效率更高，sun也知道使用缓冲数组读取效率更高，sun
提供了-----缓冲输入字节流对象，让我们可以有更高效率地读取文件

输入字节流的体系：
-----| InputStream  输入字节流的基类  抽象类
-----------|FileInputStream   读取文件数据的输入字节流
-----------|BufferedInputStream 缓冲输入字节流的出现主要是为了提高文件数据的效率
其实该类内部只不过是维护了一个8kb的字节数组

注意：凡是缓冲流，都不具备读写文件的能力

使用BufferedInputStream的步骤:
     1.找到目标文件
     2.建立数据输入通道
     3.建立缓冲输入字节流
     4.关闭资源

fill()使用内部维护的缓冲数去读取文件数据，一次最多读取8kb的字节数据进入缓冲数组中

 */
public class IO_3 {
    public static void main(String[] args) throws IOException {
        readTest2();

    }

    public static void readTest2() throws IOException {
        //找到目标文件
        File file = new File("E:\\a.txt");
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        String str="match";
        byte[]buf = str.getBytes();
        fileOutputStream.write(buf,0,5);
        fileOutputStream.close();

        //建立数据的输入通道
        FileInputStream fileInputStream = new FileInputStream(file);
        //建立缓冲输入字节流
        //疑问1：为什么创建BufferInputStream的时候需要传入FileInputStream？BufferedInputStream本身不具备读文件的能力所以需要借助FileInputStream来读取文件的数据
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        //读取文件数据
        int content = 0;
        //疑问2：bufferedInputStream出现的目的是为了提高读取文件的效率,但是BufferInputStream的read方法每次读取一个字节的数据
        //而FileInputStream每次也是读取一个字节的数据，那么BufferInputStream效率高从何而来？？
        //bufferedInputStream是向数组里提区内容，而FileOutputStream是向硬盘里提取内容

        while ((content = bufferedInputStream.read()) != -1) {
            System.out.println(content);
        }
        //关闭资源
        bufferedInputStream.close();//相当于关了FileInputStream

    }


    public static void readTest() throws IOException {
        File file = new File("E:\\a.txt");
        //建立数据通道
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] buf = new byte[1024];
        int length = 0;
        while ((length = fileInputStream.read(buf)) != -1) {
            System.out.print(new String(buf, 0, length));
        }
        //关闭资源
        fileInputStream.close();
    }
}
