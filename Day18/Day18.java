package Day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @Author LinQ
 * Date:2020/12/7
 * Weather：Rainy
 */
/*
  file 用于描述文件或者文件夹
  通过file对象我们可以描述文件或者文件夹的属性数,如果需要读取文件中的内容数据，那么我们需要使用io流技术

  IO流(Input Output)：

  IO流解决的问题是：解决设备与设备之间的传输问题、内存--->硬盘   硬盘---->内存


  IO流技术：


  IO流的分类
    如果按照数据的流向划分，那么可以划分:

         输出流

         输入流

    如果按照处理的单位划分：

         字节流：读取文件中的二进制数据，而且读取到的二进制数据是不会经过任何处理的

         字符流：字符流读取的数据是以字符为单位的。也是读取到文件中的二进制数据，不过会把这些二进制数据转换成我们能识别的一些字符
                      字符流=字符流+解码


字节流
   输入字节流：
------------InputStream() 所有输入字节流的基类 抽象类
-----------------FileInputStream 读取文件数据的输入字节流


如何使用FileInputStream读取文件数据的步骤 ：
     1.找到目标文件
     2.建立数据的输入通道
     3.读取文件中的数据
     4.关闭资源





 */
public class Day18 {

    public static void main(String[] args) throws IOException {
      readTest4();
    }

    //缓冲数组配合循环一起读取
     public static void readTest4() throws IOException {
         //找到目标文件
         File file = new File("E:\\a.txt");
         //建立数据的输入通道
         FileInputStream fileInputStream = new FileInputStream(file);
         //建立缓冲数组配合循环读取文件的数据
         int length = 0;//保存每次读取到的字节数组
         byte []buf = new byte[1024];
         while((length=fileInputStream.read(buf))!=-1){//read方法读取到了文件的末尾，那么会返回—1表示。
             System.out.println(new String(buf,0,length));
         }
         //关闭资源
         fileInputStream.close();
    }


     //读取方式三：使用缓冲数组读取  缺点：无法完成完整一个文件的数据
    public static void readTest3() throws IOException {
        //找到目标文件
        File file = new File("E:\\a.txt");
        //建立数据的输入通道
        FileInputStream fileInputStream = new FileInputStream(file);
        //建立缓冲字节数组，读取文件的数据
        byte []buf = new byte[1024];//如同超市对的购物车
        int Length =  fileInputStream.read(buf);//数据已经读取到了byte数组中了，如果使用read方法读取数据传入字节数组，那么数据是存储到字节数组中的，而这时read方法的返回值是表示的是本次读取了几个字节数据到字节数组中
        System.out.println(Length);//3
        //使用字节数组构建字符串
        String content =  new String(buf,0,Length);
        System.out.println("内容是:"+content);
        //关闭资源
        fileInputStream.close();




    }






    //读取方式二：使用循环读取文件的方式.
    public static  void readTest2() throws IOException {
        //找到目标文件
        File file = new File("E:\\a.txt");
        //建立数据的输入通道
        FileInputStream fileInputStream = new FileInputStream(file);
        //读取文件的数据
       /* for(int i=0;i<file.length();i++){
            inputStream.read();
        }*/
        int content = 0;//声明该变量用于存储读取到的数据
        while((content=fileInputStream.read())!=-1){//下一个数据字节，如果已经达到文件末尾，则返回-1
            System.out.println((char)content);
        }
        //关闭资源
        fileInputStream.close();


    }




    //读取的方式一：有缺陷：无法读取完整一个
    public static  void readTest() throws IOException {
        File file = new File("E:\\a.txt");
        //建立数据的输入通道
        FileInputStream fileInputStream  =  new FileInputStream(file);
        //读取文件的数据
        int content=fileInputStream.read();//读取一个字节的方法，把读到的数据返回。
        System.out.println((char)content);
        //关闭资源
        fileInputStream.close();//关闭资源，释放资源
    }
}
