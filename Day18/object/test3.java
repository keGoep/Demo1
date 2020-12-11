package Day18.object;
/*
   需求：一个银行账户有5000元，两夫妻一个拿着存折，一个拿着卡，开始取钱比赛，每次只能取1000块要求不能出现线程安全问题


 */
class BankThread extends Thread{

    static int count =5000;

    static Object o = new Object();
    public BankThread(String name){
        super(name);
    }

    @Override
    public void run() {
        while(true){
            synchronized (o) {
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
}
public class test3 {
    public static void main(String []args) {
        //创建两个线程对象
        BankThread b = new BankThread("老公");
        BankThread b1=new BankThread("老婆");
        b1.setPriority(10);
        b.start();
        b1.start();

    }
}
