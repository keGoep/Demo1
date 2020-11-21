package Day13;

/*test:有一个水池，水池的容量是固定的500L。一边进水一边出水，要求，进水与放水不能同时，
水池一旦满了就不能继续注水，应当放空了，不可以继续注入水，进水的速度为5L/S，放水的速度为2L/S



 */

class Pool{

    int capacity=500;


    int water=490;

     boolean flag=false;
}


class PutInWater  extends Thread{

    Pool p;

    public PutInWater(Pool p ){
        this.p=p;
    }

    @Override
    public void run() {
       while(true){
           synchronized (p){
               if(p.flag==false) {
                   if (p.water <= p.capacity) {
                       p.water += 5;
                       try {
                           Thread.sleep(1000);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   } else {
                       p.flag=true;
                   }
                   System.out.println("注入水5升");
                   p.notify();
               }else{
                   System.out.println("水已经住满了，要开始放水");
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

class  PutOutWater extends Thread {
    Pool p;

    public PutOutWater(Pool p) {
        this.p = p;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (p){
                if(p.flag==true) {
                    if (p.water == p.capacity) {
                        p.water-=2;
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    p.flag=false;
                    System.out.println("排水2升");
                    p.notify();
                }else{
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


public class test3 {
    public static void main(String []arg){
      Pool p = new Pool();
      PutOutWater putOutWater= new PutOutWater(p);
      PutInWater putInWater=new PutInWater(p);
      putInWater.start();
      putOutWater.start();

    }
}
