package Day15;

import java.util.LinkedList;

/**
 * @Author LinQ
 * Date:2020/11/24
 * Weather：Rainy
 */
/*
   2.数据结构
            1；栈     :主要用于实现堆栈数据结构的存储方式
                先进后出
                push()
                pop()
            2.队列(双端队列)：主要为了让别人可以使用LinkedList模拟队列的数据结构的存储方式
                先进后出
                offer()
                poll()

机试题目：使用LinkedList实现堆栈数据结构的存储方式与队列的数据结构存储方式






 */

//使用LinkedList模拟堆栈的存储方式
class StackList{

  LinkedList list;

  public StackList(){
      list = new LinkedList();
  }
  //进栈
   public void add(Object obj){
      list.push(obj);
   }

   //弹栈:把元素删除并返回
   public Object  pop(){
      return list.pop();
   }

   //获取元素个数
   public int size(){
      return list.size();
   }

}

//使用LinkedList模拟队列的存储方式：
  class TeamList{

    LinkedList linkedList;

    public TeamList(){
        linkedList = new LinkedList();
    }

    //进入到队伍末尾处
    public void add(Object object){
        linkedList.offer(object);
    }

    //出队
    public Object remove(){
        return linkedList.poll();
    }

    public int size(){
        return  linkedList.size();
    }
}


public class LinkList_constr_ {
    public static void main(String[] args) {
       /* StackList stackList = new StackList();
        stackList.add("李嘉诚");
        stackList.add("马云");
        stackList.add("王健林");
       *//* int i=0;
        while(i<stackList.size()) {
            System.out.println(stackList.pop());
        }*//*
        int size=stackList.size();
        for(int i=0;i<size;i++){
            System.out.println(stackList.pop());//先进后出，后进先出
        }*/

          TeamList teamList = new TeamList();
         teamList.add("李嘉诚");
         teamList.add("马云");
         teamList.add("王健林");

        int size=teamList.size();
        for(int i=0;i<size;i++){
            System.out.println(teamList.remove());//先进先出，后进后出
        }
    }
}
