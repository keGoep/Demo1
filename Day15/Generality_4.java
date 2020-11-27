package Day15;

/**
 * @Author LinQ
 * Date: 2020/11/26
 * Weather：Rainy
 */
/*
  泛型接口：
  泛型接口的定义格式：
      interface 接口名<声明自定义泛型>{


      }

泛型接口要注意的事项：
    1.接口上自定义的泛型的具体类型是在实现一个接口的时候指定的。
    2.在接口上自定义的泛型如果在实现接口的时候没有指定具体的数据类型，那么默认为Object类型


    需求：实现接口的时候，还不明确要操作的数据类型，要等到创建接口实现类的时候才能指定泛型的具体的数据类型。

   如果要延迟接口自定义泛型的具体数据类型，那么格式如下：
    public class  Generality_4<T> implements Dao<T>{

    }

 */

interface Dao<T>{

    public void add(T o);

}


public class  Generality_4<T> implements Dao<T>{
    public static void main(String[] args) {
        Generality_4<String> generality_4 = new Generality_4<String>();

    }

    public void add(T t){

    }
}
