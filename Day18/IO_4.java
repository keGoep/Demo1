package Day18;

import java.io.*;

/**
 * @Author LinQ
 * Date:2020/12/9
 * Weather：Windy
 */
/*
---------|OutPutStream 属于输出字节流的基类 抽象类
------------|FileOutputStream 向文件输出数据的 输出字节流
------------| BufferedOutputStream 缓冲输出字节流  出现的目的是为了提高写数据的效率
                                   内部维护了一个8kb的字节数组

使用BufferOutputStream 的步骤
1.找到目标文件
2，建立数据的输出通道


BufferedOutputStream要注意的细节：
     1.使用BufferedOutputStream写数据的时候，他的write方法是先把数据写到它内部维护的字节数组中。
     2.使用BufferedOutputStream写数据的时候，他的write方法是先把数据写到它内部维护的字节数组中。如果需要把数据真正写到硬盘上面，
     需要调用flush方法或者是close方法,或者是内部维护的字节数组已经填满数据的时候也会把数据刷出去。




 */

public class IO_4 {
    public static void main(String[] args) throws IOException {
        //找到目标文件
        File file = new File("E:\\b.txt");
        //建立数据的输出通道
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        //建立缓冲输出字节流对象
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        //把数据写出
        bufferedOutputStream.write("LinQing ".getBytes());
        //把缓冲数组中内部的数据写到硬盘上面
        //bufferedOutputStream.flush();
        bufferedOutputStream.close();



    }
}
