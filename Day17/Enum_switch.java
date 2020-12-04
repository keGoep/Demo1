package Day17;

/**
 * @Author LinQ
 * Date:2020/12/2
 * Weather：Rainy
 */
/*
Switch 适用的数据类型： byte/short/char/int/String/enum

注意：在switch语句中后面跟的枚举值，只需要单鞋枚举值即可，不需要在声明该枚举值是哪个枚举类的
 */

enum Season {

    Spring, Summer, Autumn, Winter;


}

public class Enum_switch {
    public static void main(String[] args) {
        Season season = Season.Spring;
        switch (season) {//已经确定枚举类型了 防止别人再写一个枚举类来混淆
            case Spring:
                System.out.println("春天");
                break;
            case Summer:
                System.out.println("夏天");
                break;
            case Autumn:
                System.out.println("秋天");
                break;
            case Winter:
                System.out.println("冬天");
                break;


        }
    }
}
