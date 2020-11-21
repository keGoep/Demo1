package Day13;
/*
自定义线程的方式：
方式1：
  1：自定义一个类继承Thread类
          2: 重写Thread的run方法
          疑问：重写run方法的目的是干什么？
          每个线程都有自己的任务代码。jvm创建的主线程的任务代码就是main方法中的所有代码，自定义线程的任务代码，就写在run方法中，自定义线程负责了run方法的执行
          3.创建Thread的子类对象，并且调用start方法开启线程。
          一个线程一旦开启，线程就会执行run方法中的代码，run方法千万不能直接调用，调用run方法相当于调用了一个普通的方法而已并没有开启新的线程

 方式2：
      1.自定义一个类实现Runnable接口。(implements Runnable)
      2.实现Runnable 方法,把自定义线程的任务定义在run方法上
      3.创建Runnable实现类的对象
      4.创建Thread 的对象并且把Runnable实现类的对象作为实参传递
      5.调用Thread类的start方法开启一个线程

   问题1：Runnable实现类的对象是线程对象吗?
   Runnable实现类的对象并不是  一个线程对象，只不过是实现了Runnable接口而已。
   只有是Thread或者是Thread的子类才是线程对象

   问题2：为什么要把Runnable实现类的对象作为实参传递给Thread对象呢？作用是什么？
   作用是把Runnable实现类的run方法作为线程的任务代码执行了

   推荐使用第二种。  实现Runnable接口的
   原因：因为java是单继承多实现的


 */
// 1.自定义一个类实现Runnable接口。(implements Runnable)
public class Line_project implements Runnable {
    //2.实现Runnable 方法,把自定义线程的任务定义在run方法上
    @Override
    public void run() {
        System.out.println("this:"+this);//d
        System.out.println("当前线程："+Thread.currentThread().getName());
//        for (int i = 0; i < 100; i++) {
//            System.out.println("当前线程" + Thread.currentThread().getName() + ":" + i);
//        }
    }

    public static void main(String[] args) {
        //3.创建Runnable实现类的对象
        Line_project l = new Line_project();
        //4.创建Thread 的对象并且把Runnable实现类的对象作为实参传递
        Thread thread = new Thread(l, "狗娃");//Thread类使用Target记录了d对象
        //5.调用Thread类的start方法开启一个线程
        thread.start();
//        for (int i = 0; i < 100; i++) {
//            System.out.println("当前线程 :" + i);
//        }
    }
}
/*
   Thread类的run方法
 @Override
    public void run() {
        if (target != null) {
            target.run();//l.run  相当于Runnable实现类的对象的run方法作为了Thread对象的任务代码
        }
    }
 */

