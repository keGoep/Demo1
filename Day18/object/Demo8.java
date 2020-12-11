package Day18.object;
/*
  System类 系统类 主要用于获取系统的属性数据
  System类的方法是静态的方法

Object类



System类常用的方法
   arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
    src - 源数组。
    srcPos - 源数组中的起始位置。
    dest - 目标数组。
    destPos - 目的地数据中的起始位置。
    length - 要复制的数组元素的数量。

重点：   currentTimeMillis()
        返回当前时间（以毫秒为单位）。
        在1970年1月1日UTC之间的当前时间和午夜之间的差异，以毫秒为单位。

   jvm必须安装在操作系统上才能运行

   exit(int status)
   终止当前运行的Java虚拟机(jvm)。非零状态码表示异常终止。
   如果参数是0表示正常退出java虚拟机，非0表示异常退出jvm
   0或者非0都可以正常退出jvm对于使用者来说没有任何区别,对于windows有意义

    gc()
    建议java虚拟机赶快启动垃圾回收回收垃圾，jvm不会马上执行
    Object类方法
    finalize()
    如果一个对象被垃圾回收器回收的时候会先调用对象的finalize()方法;

    getenv(String name)
    获取指定环境变量的值。

    getProperty(String key)
    获取指定键指示的系统属性。
    list(PrintStream out)
    将此属性列表打印到指定的输出流

    getProperty(String str)//根据系统的属性名获取对应的属性值


 */

class Per{
    String name;
    public Per(String name) {
        this.name=name;
    }

    public void finalize()throws Throwable{
        super.finalize();
        System.out.println(this.name+"被回收了");
    }

}



public class Demo8 {
    public static void main(String[]arg){
           /*
            int[] srcArr = {10, 12, 14, 16, 19};
            //把srcArr的元素拷贝到dest中
            int[] desArr = new int[4];
           //System.exit(0);//退出jvm
            System.arraycopy(srcArr, 2, desArr, 1, 2);
            System.out.println("目标数组的元素：" + Arrays.toString(desArr));//目标数组的元素：[0, 14, 16, 0]
            System.out.println("当前的系统时间：" + System.currentTimeMillis());//从1970年算起

          for(int i=0;i<4;i++){
              new Per("狗娃"+i);
              System.gc();//建议马上启动垃圾回收器
          }
        System.out.println("环境变量："+System.getenv("JAVA_HOME"));
        Properties properties =  System.getProperties();
        properties.list(System.out);
        */
          String value= System.getProperty("os.name");//根据系统的属性名获取对应的属性值
          System.out.println("当前系统:"+value);
    }
}
