package Day18.object;

//需求：编写一个函数随机产生四位的验证码

import java.util.Random;

public class test2 {
    public static void main(String[]arg){
        Random random = new Random();
        char[]arr={'陈','杰','没','了','o'};
        StringBuilder sb=new StringBuilder();
//需要四个随机数，通过随机数获取字符数组中的字符;
        for (int i=0;i<4;i++){
            int index = random.nextInt(arr.length);//参数的随机数必须是数组的索引值范围内的
            sb.append(arr[index]);
        }
        System.out.println("验证码: "+sb);
    }
}
/*


 */