// Two strings are anagrams if they contain the same characters with the same frequency.
// input - s1 = listen, s2 = silent
// output - anagrams

import java.util.*;
class Main {
    public static void main(String[] args) {
        // String str="chetan nerkar";
        String s1 = "listen", s2 = "silentjj";
        boolean isAnagram = true;
        int count[]=new int[26];
        for (int i=0;i<s1.length();i++){
            Character ch = s1.charAt(i);
            count[ch-'a']++;
        }
        for (int i=0;i<s2.length();i++){
            Character ch = s2.charAt(i);
            count[ch-'a']--;
        }
        for (int i: count){
            if (i!=0)
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
