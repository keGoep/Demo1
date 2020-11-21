package Day13;

 /*
  线程常用的方法：
  Thread(String name)  初始化线程名
  setName()     返回线程的名字
  sleep()    线程睡眠指定对的毫秒数   是一个静态的方法，那个线程执行了sleep方法就是那个线程在睡眠
  currentThread()  返回当前线程对象,该方法是一个静态的方法，注意：哪个线程执行了currentThread()代码就返回哪个线程的对象
  getPriority() 返回当前线程对象的优先级 默认线程的优先级是5
  setPriority(int newPriority)设置线程的优先级 虽然设置了线程的优先级 但是具体的实现取决于底层的操作系统的实现，(最大的优先级是10，最小是1)


 */
public class Safe_Line3 extends Thread {

    public Safe_Line3(String name){
        super(name);//调用了Thread类的一个参数的构造方法
    }

     @Override
     public void run() {
         //System.out.println("this:" + this);//Thread[马可波罗,5,main]
         //System.out.println("当前对象：" + Thread.currentThread());//Thread[马可波罗,5,main]
         for (int i = 0; i < 100; i++) {
             System.out.println(this.getName() + ":" + i);

            /*
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             */
             //为什么不能抛出异常只能捕获
             //因为父类Thread类的run方法没有抛出异常类型，所以子类不能抛出异常类型


         }

     }
     public  static  void main(String[]args) throws InterruptedException {
       Safe_Line3 l= new Safe_Line3("马可波罗");//创建了一个线程对象
         //提高优先级  优先级的范围是1-10
         l.setPriority(10);//只是提高了优先执行的概率,不能保证一直比主线程优先级高
        //System.out.println("自定义线程的优先级:"+l.getPriority());//线程的优先级默认是5,优先级越大执行概率越高
        l.start();
        //System.out.println("主线程的优先级:"+Thread.currentThread().getPriority());
         for (int i = 0; i < 100; i++) {
             System.out.println(Thread.currentThread().getName() + ":" + i);
         }


         // l.sleep(1000);//主线程睡眠
         // System.out.println("l:"+l);//l:Thread[马可波罗,5,main]
         //l.start();
         // l.setName("狗蛋");
         //System.out.println("线程的名字:"+l.getName());//    线程的名字马可波罗           线程的名字Thread-0
         //Safe_Line3 l2= new Safe_Line3("圣光游侠");
         //System.out.println("线程的名字："+l2.getName());//  线程的名字圣光游侠         线程的名字Thread-1
        // l.start();
         //Thread main=Thread.currentThread();
         //System.out.println("主线程的名字:"+main.getName());//主线程的名字main

    }
}
