package Day13;
/*
   守护线程（后台线程)：
          如果一个进程中只剩下守护线程，那么守护线程也会死亡

   需求：模拟QQ下载更新包。

   一个线程默认都不是守护线程
         System.out.println("是守护线程吗"+ thread_background.isDaemon());//判断线程是否为守护线程
         thread_background.setDaemon(true);//setDaemon()设置线程是否为守护线程，true为守护线程，false为非守护线程

 */
public class Thread_background  extends  Thread {

    public Thread_background(String name){
        super(name);
    }


    @Override
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("更新包目前下载到了"+i+"%");
            if(i==100){
                System.out.println("更新包下载完毕准备安装...");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public  static  void main(String []args){
       Thread_background thread_background = new Thread_background("后台线程");

      // System.out.println("是守护线程吗"+ thread_background.isDaemon());//判断线程是否为守护线程
         thread_background.setDaemon(true);//setDaemon()设置线程是否为守护线程，true为守护线程，false为非守护线程
      //  System.out.println("是守护线程吗"+ thread_background.isDaemon());//true
              thread_background.start();
        for(int i=1;i<=100;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

    }
}
