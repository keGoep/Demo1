package Day17;

import java.io.File;
import java.io.IOException;

/**
 * @Author LinQ
 * Date:2020/12/3
 * Weather：
 */
/*
CreatNewFile()      在指定位置创建一个空文件，成功返回true ，失败返回false          创建了则不会再创建
mkdir()             在指定位置创建目录，这只会创建最后一级目录，如果上级目录不存在就抛出异常
mkdirs()            在指定位置创建目录,这回创建路径中所有不存在的目录
renameTo(File dest) 重命名文件或者文件夹，也可以操作非空的文件夹，文件不同时相当于文件的剪切，剪切时候不能操作非空的文件夹，移动/重命名成功返回true

 */
public class IO_Function {
    public static void main(String[] args) throws IOException {//需要抛出异常因为他怕你当前所在的盘出现问题
        File file = new File("D:\\abcd.txt");
        System.out.println("创建成功了吗？" + file.createNewFile());//createNewFile创建一个指定的文件，如果该文件存在了，则不会再创建，如果还没有存在则创建，创建成功返回true，否则返回false

        File dir = new File("D:\\a.txt");
       //mkdir创建一个单级的文件夹
        System.out.println("创建文件夹成功吗?"+dir.mkdir());
        dir=new File("D:\\aa\\bb");//创建aa文件夹,bb在aa中
        System.out.println("创建多集文件夹："+dir.mkdirs());

    //renameTo() 如果目标文件与源文件是在同一个路径下，那么renameTo的作用是重命名，国目标文件与源文件不是在同一个路径下，那么renameTo的作用就是剪切，而且还不能操作文件夹
    File destFile = new File("E:\\aaaaa.txt");
    //file.renameTo(destFile);
    System.out.println("重命名成功吗？"+file.renameTo(destFile));
    }
}
