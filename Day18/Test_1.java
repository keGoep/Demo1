package Day18;

import java.io.*;

/**
 * @Author LinQ
 * Date:2020/12/8
 * Weather：Rainy
 */
/*
 需求：拷贝图片
 */
public class Test_1 {
    public static void main(String[] args) throws IOException {

            File file = new File("C:\\Users\\86181\\Pictures\\Saved Pictures\\d.jpg");
            File file1 = new File("E:\\d.jpg");

            FileInputStream fileInputStream= new FileInputStream(file);
            //每新创建一个FileOutputStream的时候，默认情况下FileOutputStream的指针是指向了开始的位置，每写出一次指针都会做出相应的移动
            FileOutputStream fileOutputStream= new FileOutputStream(file1);

            int length = 0;
            byte[] bytes = new byte[1024 * 3];//最后一次只剩下824个字节

            while ((length = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, length);
            }
            //关闭资源  原则:先开后关，后开先关。
                fileOutputStream.close();
                fileInputStream.close();
        }

}
