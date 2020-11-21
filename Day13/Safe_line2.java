package Day13;
/*
  线程的好处：
   1.解决了一个进程中可以执行多个任务的问题
   2.提高了资源利用率
   线程的弊端：
   1.增加了CPU的负担
   2.降低了一个进程中线程的执行概率
   3.会出现线程安全问题
   4.会引发死锁现象

   自定义线程的事项方式
   1.自定义一个类继承Thread类
   2.重写Thread类的run方法，把自定义线程的任务代码写在run方法上
   3.创建Thread的子类对象,并且调用start方法启动一个线程

   注意：千万不要直接调用run方法,调用start方法的时候线程就会开启，线程一旦开启，就会执行run方法中的代码
         如果直接调用了run方法，就相当于调用了一个普通的方法而已。

    线程安全问题：
       1.存在着两个或者两个以上的内存对象共享着同一个资源
       2.操作共享资源的代码有多句

      线程安全问题的解决方案：
      方式一：
      1.使用同步代码块
         格式     ：
         synchronized (锁对象){
         需要被同步的代码
         }


      同步代码块要注意的事项：
        1.锁对象可以是任意的对象
        2.一个线程在同步代码块中sleep，并不会示释放锁对象
        3.如果不存在着线程安全问题千万不要使用同步代码块，因为会降低效率
        4.锁对象必须是多线程共享着一个对象，否则锁不住

       方式二：同步函数
         同步函数就是使用 synchronized修饰一个函数


         同步函数要注意的事项：
             1.如果是一个非静态的同步函数的锁对象时this对象，如果是静态函数的锁对象是当前函数所属的类的字节码文件，也就是class对象
             2.同步函数的锁对象是固定的，不能指定

          推荐使用：同步代码块
             1.同步代码块的锁对象可以由我们随意指定，方便控制而同步函数的锁是固定的，不能随意指定
             2.同步代码块可以很方便控制需要被同步代码的范围，同步函数必须是整个函数的所有代码都被同步

 */


class BankThread extends Thread{

    static int count =5000;

    static Object o = new Object();
    public BankThread(String name){
        super(name);
    }

    @Override
    public  void run() {
        getMoney();
    }
    //当前函数所属的类的字节码文件对象----BankThread.class
    public  static synchronized void getMoney(){
        while(true){
            if (count > 0) {
                System.out.println(Thread.currentThread().getName() + "取走了1000块,还剩" + (count - 1000) + "元");
                count -= 1000;
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                }
            } else {
                System.out.println("取完了..");
                break;
            }
        }
    }
}
public class  Safe_line2 {
    public static void main(String []args) {
        //创建两个线程对象
         BankThread b = new BankThread("陈杰");
         BankThread b1=new BankThread("陈旭");
         b1.setPriority(10);
         b.start();
         b1.start();

    }
}

