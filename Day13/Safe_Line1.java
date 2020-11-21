package Day13;
/*
  模拟QQ视频与聊天同时在执行





 */
class Video extends Thread{


    @Override
    public void run() {
        while(true){
            System.out.println("视频..");
        }
    }
}

class Talk extends  Thread{

    @Override
    public void run() {
        while(true){
            System.out.println("你好..");
        }
    }
}

public class Safe_Line1 {
    public static void main(String[]args){

        Talk t = new Talk();
        t.start();
        Video v= new Video();
        v.start();




    }
}
