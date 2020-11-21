package Day13;
/*
  需求：模拟3个窗口同时在售50张票
   问题1：一张票卖了三次，50张票卖出了150次
   因为number是非静态的，每个非静态的在每个对象中都有一份，三个线程对象就会有三份,
   解决方案：把number共享出来给三个线程对象使用，使用static修饰number

    为什么50号票会被卖出两次？
    问题2：出现了线程安全问题，如何解决？
    线程安全方法：sun提供了线程同步机制让我们解决这类问题
      java的线程同步机制：
          方式1： 同步代码块

          同步代码块的格式：
                synchronized(锁对象){
                   需要被同步的代码;
                }

       同步代码块要注意的事项：
         1.  锁对象可以是任意的对象， 方式对象内部都维护了一个状态，java的同步机制就是使用了对象中的状态作为了锁的标识
         2.在同步代码块中调用了sleep方法并不是释放锁对象
         3.只有真正存在线程安全问题的时候才会使用同步代码块，否则会降低效率
         4.多线程操作的锁对象 必须 是唯一共享 的。否则无效。

          方式2： 同步函数




 出现线程安全问题的根本原因：
     1.存在两个或者两个以上的线程对象而且线程之间共享着一个资源。
     2.必须要存在多个语句操作共享资源



 */
class SaleTicket extends Thread{

     static int number=50;//票数  非静态的成员变量数据，在每一个对象中都会维护一份数据

    static Object o=new Object();//必须是共享的

    public SaleTicket(String name){
        super(name);
    }


    @Override
    public void run() {
        while(true){
            //同步代码块
            synchronized ("死亡陈杰锁") {//锁对象可以是任意的对象  如同1开 0关   最简单的锁 ----字符串
                if (number > 0) {
                    System.out.println(Thread.currentThread().getName() + "输出了第" + number + "票");
                    number--;
                    try {
                        Thread.sleep(100);
                    }catch(InterruptedException e){ }
                } else {
                    System.out.println("售罄了..");
                    break;
                }
            }
        }
    }
}



public class Safe_Line24 {
    public  static  void main(String[]args){
        //创建三个线程对象，模拟三个窗口
        SaleTicket w1=new SaleTicket("窗口1");
        SaleTicket w2=new SaleTicket("窗口2");
        SaleTicket w3=new SaleTicket("窗口3");
        w1.start();
        w2.start();
        w3.start();




    }

}
