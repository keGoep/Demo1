package Day18;

import java.io.*;

/**
 * @Author LinQ
 * Date:2020/12/11
 * Weather：Sunny
 */
/*
输出字符流：
---------|Write  输出字节流的基类 抽象类
-------------|FileWrite 向文件输入数据的输出字符流

FileWrite 的使用步骤：
  1.找到目标文件
  2.建立数据输出通道
  3.写出数据
  4.关闭资源

FileWrite 要注意的事项：
    1.使用FileWrite写数据的时候，fileWrite内部是维护了一个1024的字符数组的，写数据的时候是会先写到它内部的字符串数组中,如果需要把数据真正写到
    硬盘上，需要调用flush或者是close方法或者是填满了内部的字符数组
    2.使用FileWriter的时候，如果目标文件不存在，那么会自动创建目标文件。
    3.使用FileWrite的时候，如果目标文件已经存在了，那么默认的情况会情况文件中的数据，然后在写入数据，如果需要在原来的基础上，追加数据需要使用
    new FileWrite(File ,boolean)


练习：使用字符流拷贝一个文本文件(java文件),
接着使用字符流拷贝一个图片，观察图片的大小变化，思考为什么会这样子？？






 */
public class IO_5 {
    public static void main(String[] args) throws IOException {
        writeTest1();
    }

    public static void writeTest1() throws IOException {
        //找到目标文件
        File file = new File("E:\\b.txt");
        //建立数据输出通道
        FileWriter fileWriter = new FileWriter(file,true);
        //FileOutputStream fileOutputStream = new FileOutputStream(file);
        //准备数据，把数据写出
        String data = "面朝大海，春暖花开";
        //fileOutputStream.write(data.getBytes());
        fileWriter.write(data);//字符流本身具备了解码的功能
        fileWriter.close();



    }
}
