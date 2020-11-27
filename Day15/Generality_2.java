package Day15;

/**
 * @Author LinQ
 * Date: 2020/11/26
 * Weather： Rainy
 */
/*

 定义一个方法可以接收任意类型的参数,返回值类型可以和实参保持一致

  自定义泛型：自定义泛型就是一个数据类型的占位符  或者是一个数据类型的变量

  方法上自定义泛型：


                      修饰符 <声明自定义泛型>返回值类型 函数名(使用自定义泛型){

                       }

在泛型中不能使用基本的数据类型，如果需要使用基本数据类型，那么就使用基本数据对应的    包装类型。
  byte -------> Byte
  short ------>Short
  long ------->Long
  int   ----->  integer

  double---->Double
  float ---->Float
  boolean---->Boolean
  char------>Character

  方法泛型注意的事项：
  1.在方法自定义泛型，这个自定义泛型的具体数据类型是调用该方法的时候  传入实参确定具体的数据类型的。
  2.自定义泛型只要符合标识符的命名规则即可，但是自定义泛型我们一般都习惯使用一个  大写字母表示。 T type E element











 */
public class Generality_2 {
    public static void main(String[] args) {

        String  str=getData("123");
        Integer in=getData(1223);


    }

    public static <T>T getData(T o) {

        return o;
    }
}
