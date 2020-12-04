package Day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author LinQ
 * Date:2020/11/~~
 * Weather：~~
 */
public class Practise {
    public static void main(String[] args) {
        String str="da  wa jiao wo lai xun shang  wo ba renjian guang yi guang  aaa  bbb cccd";
        String reg="\\b[a-z]{3}\\b";
        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()==true){
          System.out.println(matcher.group());
        }


    }

}
