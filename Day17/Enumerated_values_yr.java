package Day17;

import Day15.Generality_4;

/**
 * @Author LinQ
 * Date:12/2
 * Weather：Rainy
 */
/*

某些方法所接收的数据必须是在固定范围之内的
解决方案： 这时候我们的解决方案是：自定义一个类解决，然后私有化构造函数，在自定义类中创建本类的对象对外使用

jdk1.5以上 问题提出了新的解决方案：就是使用枚举解决。

一些方法在运行的时候，他需要的数据不能是任意的，而必须是一定范围的值。
比如说：方向，性别，季节，星期等...
jdk1.5前采用自定义带有枚举功能的类解决，java5以后可以直接使用枚举予以解决


 */
//自定义一个性别类
/* class Gender{

   String value;

   public static final Gender man = new Gender("男");

   public static final Gender woman = new Gender("女");

  private Gender(String value){
      this.value=value;
  }

}*/

enum Gender {

    man("男"), woman("女");

    String value;

    private Gender(String value) {
        this.value = value;
    }

}

class Per {


    private String name;

    private Gender sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }
}


class Enumerated_values_yr {
    public static void main(String[] args) {
        Per per = new Per();
        per.setName("陈旭");
        per.setSex(Gender.man);//or  Gender.woman
        System.out.println("名字：" + per.getName() + "  性别：" + per.getSex().value);
    }
}
