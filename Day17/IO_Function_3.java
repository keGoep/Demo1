package Day17;

import java.io.File;

/**
 * @Author LinQ
 * Date:12/4
 * Weather：Sunny
 */
/*
  文件夹相关的
  static File[] listRoots() 列出所有的根目录(Window中就是所有系统的盘符)
  list()   返回目录下的文件或者目录名，包含隐藏文件，对于文件这样操作会返回null
  list(FilenameFilter filter) 返回指定当前目录中符合过滤器条件的子文件或子目录，对于文件这样操作会返回null
  listFiles()  返回目录下的文件或者目录对象(File类实例），包含隐藏文件，对于文件这样操作会返回null
  listFiles(FilenameFilter filter) 返回指定当前目录中符合过滤器的子文件或子目录，对于文件这样操作会返回null
 */
public class IO_Function_3 {
    public static void main(String[] args) {
       File[]  roots= File.listRoots();//列出所有的根目录
      /* for (File file : roots){
           System.out.println("file:"+file);
       }*/

       File file = new File("D:\\");
      /* String []fileNames =  file.list();//列出当前文件夹下面的所有子文件与子文件夹名存储到一个String类型的数组中返回（包括隐藏文件）
       for(String fileName: fileNames){
           System.out.println(fileName);
       }*/

      File []files = file.listFiles();//把当前文件夹下面的所有子文件与子文件夹都是要一个File对象描述，然后把这些file对象存储到File数组中返回给你
      for(File fileItem : files){
          System.out.println("文件名："+fileItem.getName());
      }

    }
}
