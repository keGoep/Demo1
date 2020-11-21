package Day13;
/*

线程通讯：一个线程完成了自己的任务，要通知另外一个线程去完成另外一个任务

典型例子：生产者与消费者
    1.出现了线程安全问题

  wait(); 如果线程执行了wait方法，那么该线程会进入等待状态，等待状态下的线程必须要被其他线程调用notify方法才能唤醒，一旦执行到了wait会释放锁
  等待
  一个线程如果执行wait方法，那么该线程就会进入一个    以锁对象为标识符的线程池   中等待

  notify();唤醒等待的线程
   唤醒
   如果一个线程执行了notify方法,那么就会唤醒   以锁对象为标识符的线程池   中等待线程其中一个
  notifyAll();
   唤醒线程池中所以等待的线程

wait与notify方法：
     1.wait 和notify是属于object对象的
     为什么wait和notify都是操作线程的却是object类
     因为锁对象可以是任意对象，如果设计在thread类中就不能是任意的对象了

     2.wait和notify必须要在同步代码块或者是同步函数才能使用
     如果没有同步代码块和同步函数就没有锁这个概念

     3.wait方法与notify方法必须要有锁对象调用
     因为不同锁会建立不同的线程池，


 */



class Product{
    //名字
    String name;
    //价格
    double price;

    boolean flag=false;//产品是否生产完毕的标志，默认请款是没有生产完成的

}

//生产者类
class Producer extends Thread{

    Product p;

   public  Producer(Product p){
       this.p=p;
   }


    @Override
    public void run() {
        int i=0;
        while(true) {
            synchronized (p) {
                if (p.flag == false) {
                    if (i % 2 == 0) {
                        p.name = "苹果";
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        p.price = 6.5;
                    } else {
                        p.name = "香蕉";
                        p.price = 2.0;
                    }
                System.out.println("生产者生产出了" + p.name + "价格是" + p.price);
                p.flag=true;
                i++;
                //p.notify();//唤醒消费者去消费
                 p.notifyAll();
            }else{
                    //等待消费者先去消费
                    try {
                        p.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
               // System.out.println("已经生产完毕");
            }
        }
    }
}
//消费者
class  Customer  extends  Thread {

    Product p;

    public Customer(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (p) {
                if (p.flag == true) {//产品已经生产完毕
                    System.out.println("消费者消费了：" + p.name + "价格是：" + p.price);
                    p.flag = false;
                    p.notify();//唤醒生产者去生产
                } else {
                    //产品还没生产，应该等待生产者先生产
                    try {
                        p.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}


public class Communication {
    public static void main(String[]args){

        Product p= new Product();
        //生产者对象
        Producer producer = new Producer(p);
        Customer customer = new Customer(p);
        //调用start方法开启线程
        producer.start();
        customer.start();
    }
}
