package Day18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author LinQ
 * Date:2020/12/8
 * Weather：Rainy
 */
/*
    IO异常的处理



 */


public class Exception_handling {
    public static void main(String[] args) {
        readTest();
    }

    public static void readTest() {
        FileInputStream fileInputStream = null;
        try {
            //找到目标文件
            File file = new File("E:\\a.txt");
            //建立缓冲输入信号
            new FileInputStream(file);
            //建立缓冲数组读取数据
            byte[] buf = new byte[1024];
            int length = 0;
            while ((length = fileInputStream.read(buf)) != -1) {
                System.out.println(new String(buf, 0, length));
            }


        }catch(IOException e){
          //处理的代码...首先要阻止后面的代码执行，还需要通知调用者
            //一个方法遇到throw关键字后面是无法执行的
            System.out.println("读取资源出错...");
            throw new RuntimeException(e);//把IOException传递给RuntimeException包装一层，然后再抛出，这样子做的目的是为了让调用者更加的方便
        }finally {
            try {
                if(fileInputStream!=null)
                    fileInputStream.close();
                    System.out.println("关闭资源成功");
            }catch(IOException e){
                System.out.println("关闭资源失败");
                throw new RuntimeException(e);
            }
        }

    }
}
