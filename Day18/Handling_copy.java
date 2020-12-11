package Day18;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author LinQ
 * Date:2020/12/9
 * Weather：Windy
 */
public class Handling_copy {
    public static void main(String[] args) {
    copy();

    }

    public static void copy() {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            File inFile = new File("C:\\Users\\86181\\Pictures\\Saved Pictures\\a.jpg");
            File outFile = new File("E:\\e.jpg");

            fileInputStream = new FileInputStream(inFile);
                fileOutputStream = new FileOutputStream(outFile);

                byte[] buf = new byte[1024];
                int length = 0;
                while ((length = fileInputStream.read(buf)) != -1) {
                    fileOutputStream.write(buf, 0, length);
            }
        } catch (IOException e) {
            System.out.println("拷贝图片出错");
            throw new RuntimeException(e);
        } finally {
            //关闭资源
            try {
                if(fileInputStream!=null)
                fileInputStream.close();
             System.out.println("关闭输入流对象成功");
            }catch(IOException e){
                System.out.println("关闭输入流对象成功");
               throw new RuntimeException(e);
            }finally {
                if(fileOutputStream!=null) {
                    try {
                        fileOutputStream.close();
                        System.out.println("关闭输出流对象成功");
                    } catch (IOException e) {
                        System.out.println("关闭输出流对象失败..");
                        throw new RuntimeException(e);
                    }

                }
            }


        }

    }

}
