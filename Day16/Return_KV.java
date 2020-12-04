package Day16;

/**
 * @Author LinQ
 * Date:2020/11/27
 * Weather：~~
 */
//返回单列结合返回一个单列结合返回键与值的数据，而不能破坏键值之间的关系
//思路：自定义类
class Entry<K,V>{
    K key;
    V value;

    public Entry(K key, V value){
        this.key=key;
        this.value=value;
    }

    @Override
    public String toString() {
        return "键："+this.key+"  值："+this.value;
    }
}

public class Return_KV {
    public static void main(String[] args) {

        Entry<String,String> entry  = new Entry<String,String>("hello","nice to meet to");
        System.out.println(entry);

    }
}
