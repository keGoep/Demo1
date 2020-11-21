package Day13;
/*

join方法
     加入


 */
class Mon extends  Thread{


    @Override
    public void run() {
        System.out.println("mon洗菜");
        System.out.println("mon炒菜");
        System.out.println("mon发现没酱油");
        System.out.println("mon叫儿子打酱油");
        //叫儿子打酱油
        Son son=new Son();
        son.start();
        try {
            son.join();//加入   一个线程如果执行了join语句那么就有新的线程加入，执行该语句的线程必须要让步给新加入的线程先完成任务，然后才继续执行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("mon继续炒菜");
        System.out.println("mon和全家一起吃饭");
    }



}

class Son extends Thread{


    @Override
    public void run() {
        System.out.println("son下楼");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("son一直往前走");
        System.out.println("son打完酱油");
        System.out.println("son上楼给mon酱油");
    }
}



public class Line_join {
    public static void main(String[]args){
        Mon mon=new Mon();

        mon.start();



    }
}
