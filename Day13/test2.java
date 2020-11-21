package Day13;

public class test2 implements Runnable {
    int num =50;//不需要static 因为只有一个test的对象创建了,其他都是共享

    @Override
    public void run() {
         while(true){
             synchronized ("锁") {
                 if (num > 0) {
                     System.out.println(Thread.currentThread().getName() + "售出了第" + num + "号票");
                     num--;
                 } else {
                     System.out.println("售罄了");
                     break;
                 }
             }
         }
    }

    public static void main(String[] args) {
        test2 t = new test2();//

        Thread thread = new Thread(t,"窗口1");
        Thread thread1 = new Thread(t,"窗口2");

        Thread thread2 = new Thread(t,"窗口3");
        //开启线程售票
        thread.start();
        thread1.start();
        thread2.start();



    }
}
