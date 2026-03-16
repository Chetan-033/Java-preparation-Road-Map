// character frequency - using HashMap - Collection
// input - chetan nerkar
// output - 
// a - 2
// c - 1
// e - 2
// h - 1
// k - 1
// n - 2
// r - 2
// t - 2
import java.util.*;
class Main {
    public static void main(String[] args) {
        String str="chetan nerkar";
        HashMap<String, Integer> map=new HashMap<>();
        for(String s:str.split("")){
            if (!s.equals(" "))
            map.put(s, map.getOrDefault(s, 0) +1);
        }
        System.out.println(map);
    }
}
