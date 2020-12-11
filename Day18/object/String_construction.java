package Day18.object;

public class String_construction {

  public  static void main(String []arg){
    String str = new String();
    //byte[]buf={97,98,99};
    //char[]bud={'明','天','是','圣','诞','节'};
    int[]buc={65,66,67};
    str=new String(buc,0,3);

    String str2=new String("a,b,c");
    //str=new String(buf,2,1) ;
    //str=new String(bud,3,3);

    System.out.println("字符串的内容："+str+str2);

  }

}
/*

 */
