package Day18;

import java.io.*;


/**
 * @Author LinQ
 * Date:2020/12/8
 * Weather：
 */
/*
FileReader 默认使用的就是gbk编码表
如果FileReader如果读到的数据找不到对应的字符，那么会返回一个未知字符对应的数字，未知字符占一个字节


何时使用字符流，何时使用字节流，依据是什么？

使用字符流的应用场景：
        如果是读写字符数据的时候，则使用字符流

使用字节流的应用场景：
       如果读写的数据都不需要转换成字符的时候，则使用字节流



 */
public class Practise {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\86181\\Pictures\\Saved Pictures\\timg.jpg");
        File file1 = new File("E:\\a.jpg");

        //建立数据输入输出通道
        FileReader  fileReader = new FileReader(file);
        FileWriter fileWriter =new FileWriter(file1);

        //边读边写
        //建立缓冲字符数组进行编写
        char[] buf = new char[1024];
        int length=0;

        while((length=fileReader.read(buf))!=-1){
            fileWriter.write(buf,0,length);
        }

        fileWriter.close();
        fileReader.close();



    }
}
