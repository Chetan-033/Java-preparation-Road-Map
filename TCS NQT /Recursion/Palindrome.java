// Check whether a number is Palindrome
import java.util.*;
class Main {
    static boolean isPalindrome(String str, int start, int end){
        System.out.println(str.charAt(start) + " " + str.charAt(end));
        if (start>=end && str.charAt(start) == (str.charAt(end)))
            return true;
        if (str.charAt(start)!=str.charAt(end))
            return false;
        return isPalindrome(str, start+1, end-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str + " is Palindrome => " + isPalindrome( str, 0, str.length()-1));
    }
}
