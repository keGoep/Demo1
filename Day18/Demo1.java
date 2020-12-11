package Day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author LinQ
 * Date:2020/12/11
 * Weather：Sunny
 */
//字节流读取中文
public class Demo1 {
    public static void main(String[] args) throws IOException {
         File file = new File("E:\\a.txt");
         FileInputStream fileInputStream = new FileInputStream(file);
         byte[]buf= new byte[1024];
         int length=0;
         while((length=fileInputStream.read(buf))!=-1){
             System.out.println(new String(buf,0,length));//借用了字符串的解码功能
         }

    }
}
