package Day13;


/*

线程的停止:
  1.停止一个线程一般都会通过一个变量去控制，

   2.如果需要停止一个处于等待状态下的线程我们需要通过变量配合notify或者interrupt方法使用


 */
public class LineStop  extends Thread{
    boolean flag = true;

    public LineStop(String name){
        super(name);
    }



    @Override
    public synchronized void run() {
        int i=0;
        while(flag){

            try {
                this.wait();//狗娃等待
            } catch (InterruptedException e) {
                System.out.println("接收到异常了");
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
            i++;
        }
    }

    public static void main(String[]args){
      LineStop l = new LineStop("狗娃");
      l.setPriority(10);
      l.start();

      for(int i=0;i<100;i++){
          System.out.println(Thread.currentThread().getName()+":"+i);
          //当主线程的i是八十的时候停止狗娃线程
          //l.stop();
         // l.interrupt();//无法停止一个线程
          if(i==80) {
              l.flag = false;
              l.interrupt();//把线程的等待状态强制清除，被清除状态的线程会接收到一个interruptedException 无需同步代码块
              //synchronized (l){
              //    l.notify();
              // }
          }
      }
    }
}
