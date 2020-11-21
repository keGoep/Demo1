package Day14;

//接口不能new，这样子就可以调用接口的obj
import com.sun.corba.se.spi.orbutil.threadpool.Work;

interface Money{

    void makeMoney();

}

class worker implements  Money{

    @Override
    public void makeMoney() {
    System.out.println("工人在赚钱");
    }

}

public class skill {

    public static void main(String []args){


        Money m = test();//Money m = new worker();
        m.makeMoney();//worker.makeMoney();

    }
    //利用多态加强了拓展性
    public static Money test(){
        return new worker();
    }//返回Money接口的实现类对象

}
