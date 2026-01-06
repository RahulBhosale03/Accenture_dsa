package array;

import java.util.HashMap;
import java.util.Map;

public class Frequency_count02 {
    public static void main(String[] args) {
        int[]arr={1, 2, 2, 3, 1, 4, 2};

        Map<Integer,Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        System.out.println("The Frequency of Number :");
        for (Map.Entry<Integer,Integer>entry: map.entrySet()){
            System.out.println(entry.getKey()+"->"+ entry.getValue());
        }
    }
}
