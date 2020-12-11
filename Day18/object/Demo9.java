package Day18.object;



/*
RunTime 该类代表了应用程序的运行环境

getRuntime()  返回与当前Java应用程序关联的运行时对象。
exec(String command)
在单独的进程中执行指定的字符串命令。
destroy()
杀死子进程。


freeMemory()
返回Java虚拟机中的可用内存量。
maxMemory()
返回Java虚拟机将尝试使用的最大内存量。
totalMemory()
返回Java虚拟机中的内存总量
summary:maxMemory是最大的


 */




import java.io.IOException;

public class Demo9 {
     public static void main(String []arg) throws IOException, InterruptedException {


         Runtime runtime = Runtime.getRuntime();

         Process process = runtime.exec("C:\\Users\\86181\\eclipse\\java-2018-12\\eclipse\\eclipsec.exe");
         Thread.sleep(3000);//让当前程序停止三秒
         process.destroy();
         /*
        System.out.println("java虚拟机空闲内存空间:"+runtime.freeMemory());
         System.out.println("java虚拟机试图管理的最大内存空间:"+runtime.maxMemory());
         System.out.println("返回java虚拟机管理的内存空间总量:"+runtime.totalMemory());
       */
     }
}
