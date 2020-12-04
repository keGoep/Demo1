package Day17;

import java.io.File;

/**
 * @Author LinQ
 * Date:2020/12/3
 * Weather：Sunny
 */
/*
  IO流(Input Output)

IO技术主要是用于设备与设备之间的传输问题。
比如：
     硬盘--->内存
     内存数据--->硬盘上
     把硬盘的数据----->内存中

IO技术的应用场景：
        导出报表,上传大头照,下载, 解析xml文件...

数据保存到硬盘上，那么数据就可以永久保存了。
数据以什么方式保存到硬盘上的？-----以文件的形式。


sun使用了一个File类描述了文件或文件夹的
File类可以描述一个文件或者文件夹

File类的构造方法：
        File(File parent, String child)
        根据parent 抽象路径名和 child 路径名字符串创建一个新的File对象

        File(String pathname)
        指定文件或者文件夹的路径创建一个File文件

        File(String parent, String child)
        从父路径名字符串和子路径名字符串创建新的 File实例。

目录分隔符：在windows机器上的目录分隔符是\   , 在linus机器上的目录分隔符是/

注意：在windows上\与/都可以使用作为目录分隔符，而且如果写/ ，只需要写一个即可。


 */
public class File_IO {
    public static void main(String[] args) {
        /*  File file = new File("D:\\swdata99.id");//D：是父路径  swdata99是子路径*/
        File parentFile = new File("D:" + File.separator + "a.txt");//在linus上是不是一个合法的路径？？
        File file = new File(parentFile, "a.txt");
        File file2 = new File("D:\\", "a.txt");
        System.out.println("存在吗？" + file.exists());//判断文件是否存在，存在为true 不存在为false
        System.out.println("存在吗？" + file2.exists());//判断文件是否存在，存在为true 不存在为false


    }

    public static void test(String child) {
        File parentFile = new File("F:\\");
        File file = new File(parentFile, child);
    }
}
