package Day18.object;

class Person{

    int id;

    String name;



    public Person(int id,String name) {
        this.id = id;
        this.name=name;
    }
    //目前需要直接输出一个对象的时候，输出的格式：编号：110 姓名：狗娃
    //toString方法无法瞒住子类的需求，那么这时候我们就应该对Object的类的toString 进行重写


    public String toString(){
        return "编号"+this.id+"姓名"+this.name;
    }

    //Object的equals方法默认比较的是两个对象的内存的地址，目前需要比较的是两个对象的身份证，所以Object类的equals不符合现在的需求
    public boolean equals(Object obj){//obj指向了Person运用了多态的技术
        Person p = (Person)obj;//强制类型转换
        return this.id==p.id;
    }
    public int hashCode(){
        return this.id;
    }
}

public class Demo1 {
    public static void main(String []arg){
       /*
         Demo1 d = new Demo1();
         Object o = new Object();
         System.out.println("hashcode："+o.toString());
        System.out.println("hashcode："+o);

     Person p = new Person(110,"狗娃");
     System.out.println(p);
     //如果能输出一个p对象的时候，输出的格式是：编号：110 姓名：狗娃
        Person p1= new Person(111,"狗蛋");
        System.out.println(p1);
   */

       Person p = new Person(110,"狗娃");
       Person p2 = new Person(110,"陈大富");
       //需求：在现实生活中只要同一个人的身份证一致就是同一个人

        System.out.println("p与p2是同一个对象吗？"+p.equals(p2));//false
        System.out.println("p与p2是同一个对象吗？"+p.hashCode());
        System.out.println("p与p2是同一个对象吗？"+p2.hashCode());


    }
}
