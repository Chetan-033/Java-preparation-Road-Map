// Reverse a number
import java.util.*;
class Main {
    static int getReverse(int num,int rev){
        if (num==0)
            return rev;
        return  getSumOfDigitRec(num/10, rev * 10 + num % 10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = Math.abs(sc.nextInt());
        System.out.println("Reverse a number - " + getReverse(num,0));
    }
}
