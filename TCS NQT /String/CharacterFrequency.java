// character frequency 
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
        int[] count=new int[26];
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if (' ' != ch)
            count[ch - 'a']++;
        }
        for (int i=0;i<count.length;i++){
            if (count[i]>0)
            System.out.println((char)(i + 'a') +" - "+count[i]);
        }
    }
}
