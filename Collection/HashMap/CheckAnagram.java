// Two strings are anagrams if they contain the same characters with the same frequency.
// input - s1 = listen, s2 = silent
// output - anagrams

import java.util.*;
class Main {
    public static void main(String[] args) {
        // String str="chetan nerkar";
        String s1 = "listen", s2 = "silent";
        boolean isAnagram = true;
        HashMap<Character, Integer> map=new HashMap<>();
        for(Character s:s1.toCharArray()){
            map.put(s, map.getOrDefault(s, 0) +1);
        }
        for (Character s:s2.toCharArray()){
            map.put(s, map.getOrDefault(s, 0) -1);
        }
        for (int i:map.values()){
            if (i>0)
            {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram)
            System.out.println("is Anagram");
        else
            System.out.println("Is Not Anagram");
    }
}
