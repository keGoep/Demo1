package Day15;

import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

/**
 * @Author LinQ
 * Date:2020/11/24
 * Weather：Rainy
 */
/*
需求：使用LinkedList存储扑克牌，实现洗牌功能
提示：
    54-2=52张牌

    扑克牌的属性：花色，点数，

    设计一个pork类


 */

class Pork{

   String color;
   String number ;

   public Pork(String color,String number){
       this.color=color;
       this.number=number;
   }

    @Override
    public String toString() {
        return "{花色："+this.color+"号码:"+this.number+"}";
    }
}


public class test_3 {
    public static void main(String[] args) {

        LinkedList porks = CreatPork();
        /*System.out.println(porks.size());//验证扑克牌的个数
        System.out.println(porks);*/

        WishPorkers(porks);
        Display(porks);







    }

      public static LinkedList CreatPork(){
          //该集合存储扑克对象
          LinkedList list = new LinkedList();
          //定义一个数组存储所有的花色与点数
          String[] colors={"黑桃","草花","方块","红桃"};
          String[] num={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
          for(int i=0;i<num.length;i++){
              for (int a=0;a<colors.length;a++){
               list.add(new Pork(colors[a],num[i]));
              }
          }
          
         return  list;
      }

      //显示一幅扑克牌
      public  static void   Display(LinkedList porks){
        for(int i=0;i<porks.size();i++){
            System.out.println(porks.get(i));
            //没十张为一行
            if(i%4==3){//每四张为一组
                System.out.println();
            }
        }
      }

      //洗牌功能
      public static  void WishPorkers(LinkedList porkers){
          Random random = new Random();
          for(int i=0;i<100;i++) {
              //随机产生索引值
              int index1 = random.nextInt(porkers.size());
              int index2 = random.nextInt(porkers.size());
              //根据索引值取出两张牌
              Pork pork = (Pork) porkers.get(index1);
              Pork pork1 = (Pork) porkers.get(index2);
              porkers.set(index1, pork1);
              porkers.set(index2, pork);
          }
      }


}
