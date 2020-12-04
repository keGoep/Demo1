package Day17;

/**
 * @Author LinQ
 * Date:2020/12/2
 * Weather：Sunny
 */
/*
jdk1.5------枚举


问题：某些方法所接收的范围是在一定范围之内的
解决方案：这时候我们的解决方法就是自定义一个类，然后私有化构法方法，在自定义类中创建本类的对象来解决问题

jdk1.5对以上问题提出了解决方法，就是用枚举类解决
包下对应的类文件，可知道  枚举类是一个特殊的类
   枚举类的关键字：enum  类名{
                    //枚举值
                 }

反编译：  javap -c  -l -private

枚举值要注意的细节：
    1.枚举值是一种特殊的类
    2.枚举值默认的修饰符是 public static final
    3.枚举值的数据类型是枚举所属的类的数据类型，然后的枚举值是指向了本类的对象的
    4.枚举类的构造方法默认的修饰符是  private
    5.枚举类可以定义自己的成员变量和成员函数
    6.枚举类可以自定义构造函数，但是构造函数的修饰符是private
    7.枚举值可以存在抽象的方法，但是枚举值必须要实现抽象的方法
    8.枚举值必须要位于枚举类的第一个语句否则报错
 */
enum Sex {

    man("男"){
        @Override
        public void run() {
            System.out.println("男人在跑");
        }
    }, woman("女"){
        @Override
        public void run() {
            System.out.println("女人在跑");
        }
    };//为类的对象
    // public static final Sex man = new  Sex();//这里的man和woman都是Sex这个类的对象
    // public static final Sex woman=new Sex();
    String value;//成员变量

    //构造函数   代参的构造方法取代了无参的构造方法
    private Sex(String value){
        this.value=value;
    }

    public void getValue(){
        System.out.println("value:"+value);
    }

    public  abstract void run();


}


class Enum_yr {
    public static void main(String[] args) {
    Sex sex = Sex.man;//获取枚举类的对象
    sex.getValue();
    sex.run();

    }
}
