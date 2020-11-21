package Day13;
/*
java中的同步机制解决了线程安全问题，但是引发了死锁现象

死锁现象：

死锁现象出现的根本原因：
 1.出现两个或者两个以上的线程
 2.存在两个或者两个以上的共享资源


 死锁现象的解决方案：无，只能尽量的避免发生


 */

class DeadLock extends Thread{

    public DeadLock(String name){
        super(name);
    }

    @Override
    public void run() {
        if("张三".equals(Thread.currentThread().getName())){
            synchronized ("遥控器"){
                System.out.println("张三拿到遥控器准备拿电池");
                synchronized ("电池"){
                    System.out.println("张三拿到了空调与电池,爽歪歪的吹空调");
                }
            }
        }else if("狗娃".equals(Thread.currentThread().getName())){
            synchronized ("电池"){
                System.out.println("狗娃拿到电池准备拿遥控器");
                synchronized ("遥控器"){
                    System.out.println("狗娃拿到了电池,开着空调爽歪歪的吹");
                }
            }
        }
    }
}


public class Dead_lock {
    public static void main(String []args) {
         DeadLock thread1 = new DeadLock("张三");
         DeadLock thread2 = new DeadLock("狗娃");
         thread1.start();
         thread2.start();





    }
}
