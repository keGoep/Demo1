package Day17;

import java.io.File;
import java.io.IOException;

/**
 * @Author LinQ
 * Date:2020/12/3
 * Weather：Sunny
 */
/*
删除:
delete（）    删除文件或者一个空文件夹,如果是 文件夹且不为空 ， 则不能删除，成功返回true ，失败返回false
deleteOnExit() 在虚拟机终止时，请求删除此抽象路径名表示的文件或者目录，保证程序异常时创建的临时文件也可以被删除

判断：
exist()        文件或文件夹是否存在
isFile()       是否是一个文件，如果不存在，则始终未false
isDirectory()  是否是一个目录，如果不存在，则始终未false
isHidden()     是否是一个隐藏的文件或者是否是隐藏的目录
isAbsolute()   测试次抽象路径名是否为绝对路径名


 */
public class IO_Function_1 {
    public static void main(String[] args) throws IOException {
  /*      File file = new File("D:\\aa");
        File file1= new File("D:\\a2.txt");
        file1.createNewFile();
        //System.out.println("删除成功吗？"+file.delete());//delete方法不能用于上删除非空的文件夹  delete会马上删除文件
        file.deleteOnExit();//jvm退出的时候删除文件  一般用于删除临时文件

        判断：
        */
      File file = new File("..\\..\\aa");
      System.out.println("存在吗？"+file.exists());
      System.out.println("判断是否是文件："+file.isFile());
      System.out.println("判断是否是个文件夹："+file.isDirectory());
      System.out.println("是隐藏文件吗？"+file.isHidden());//
      System.out.println("是绝对路径吗？"+file.isAbsolute());
    }
}
