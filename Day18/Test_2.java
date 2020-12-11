package Day18;

import java.io.*;

/**
 * @Author LinQ
 * Date:2020/12/9
 * Weather：Windy
 */
/*
使用 缓冲输入输出字节流拷贝图片
 */
public class Test_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\86181\\Pictures\\Saved Pictures\\timg.jpg");
        File file1 = new File("E:\\c.jpg");

        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        FileInputStream fileInputStream = new FileInputStream(file);

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        int length =0;
        while((length=bufferedInputStream.read())!=-1){
            bufferedOutputStream.write(length);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();






    }
}
