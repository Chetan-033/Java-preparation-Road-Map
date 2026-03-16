// Online Java Compiler
// Input
// "chetan nerkar"
// Output
// {a=2, r=2, c=1, t=1, e=2, h=1, k=1, n=2}
import java.util.*;
class Main {
    public static void main(String[] args) {
        String str="chetan nerkar";
        HashMap<String, Integer> map = new HashMap<>();
        for(String s:str.split("")){
            if("aeiou".contains(s)){
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        System.out.println(map);
    }
}
