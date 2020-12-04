package Day17;

import java.io.File;
import java.io.IOException;

/**
 * @Author LinQ
 * Date:
 * Weather：
 */
/*
CreatNewFile()      在指定位置创建一个空文件，成功返回true ，失败返回false          创建了则不会再创建
mkdir()             在指定位置创建目录，这只会创建最后一级目录，如果上级目录不存在就抛出异常
mkdirs()            在指定位置创建目录,这回创建路径中所有不存在的目录
renameTo(File dest) 重命名文件或者文件夹，也可以操作非空的文件夹，文件不同时相当于文件的剪切，剪切时候不能操作非空的文件夹，移动/重命名成功返回true


 delete（）    删除文件或者一个空文件夹,如果是 文件夹且不为空 ， 则不能删除，成功返回true ，失败返回false
deleteOnExit() 在虚拟机终止时，请求删除此抽象路径名表示的文件或者目录，保证程序异常时创建的临时文件也可以被删除

判断：
exist()        文件或文件夹是否存在
isFile()       是否是一个文件，如果不存在，则始终未false
isDirectory()  是否是一个目录，如果不存在，则始终未false
isHidden()     是否是一个隐藏的文件或者是否是隐藏的目录
isAbsolute()   测试次抽象路径名是否为绝对路径名

  static File[] listRoots() 列出所有的根目录(Window中就是所有系统的盘符)
  list()   返回目录下的文件或者目录名，包含隐藏文件，对于文件这样操作会返回null
  list(FilenameFilter filter) 返回指定当前目录中符合过滤器条件的子文件或子目录，对于文件这样操作会返回null
  listFiles()  返回目录下的文件或者目录对象(File类实例），包含隐藏文件，对于文件这样操作会返回null
  listFiles(FilenameFilter filter) 返回指定当前目录中符合过滤器的子文件或子目录，对于文件这样操作会返回null

需求1：指定一个文件夹，列出该文件夹下面的所有java文件

需求2：指定一个文件夹，列出文件夹下面的所有子文件与文件夹，但是格式要如下：

文件：
    文件名1，文件名2，文件名3
 */
public class Practise {
    public static void main(String[] args) throws IOException {
        File dir = new File("D:\\");
         listValue(dir);

    }
    //列出所有的java文件
    public static void listValue(File dir){
        File[] files =  dir.listFiles();//获取所有子文件
        for(File  file:files){
            String fileName=file.getName();
            if(fileName.endsWith(".java")){
              System.out.println(fileName);
            }
        }
    }


}
