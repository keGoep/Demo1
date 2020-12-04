package Day17;

import java.io.File;

/**
 * @Author LinQ
 * Date:2020/12/3
 * Weather：Sunny
 */
/*
路径问题：

绝对路径：该文件在硬盘上的完整路径。绝对路径一般是以盘符开头

相对路径：就是资源文件相对于程序所在的路径

.   代表当前路径
..  代表上一级路径

注意：如果程序当前所在的路径与资源文件不是在同一个盘下面，是没发写相对路径的。


 */
public class IO_Path {
    public static void main(String[] args) {

        File file = new File(".");//当前路径
        System.out.println("当前路径是：" + file.getAbsolutePath());//file--->当前路径   获取绝对路径

        File file1 = new File("src\\Day17\\b.txt");
        System.out.println("存在吗？" + file1.exists());
    }
}
