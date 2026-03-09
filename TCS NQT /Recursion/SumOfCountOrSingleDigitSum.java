// Count digits in a number SumOfCountOrSingleDigitSum.java
import java.util.*;
class Main {
    static int getSubOfDigit(int num){
        if(num==0)
            return 0;
        return num%10 + getSubOfDigit(num/10);
    }
    static int getCountDigits(int num){
        if (num==0)
            return 0;
        return 1+getCountDigits(num/10);
    }
    static int getSignleDigitSum(int num){
        if (num<=9)
            return num;
        return  getSignleDigitSum(getSubOfDigit(num));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = Math.abs(sc.nextInt());
        System.out.println("Count of number - " + getCountDigits(num));
         System.out.println("Final single digit - " + getSignleDigitSum(num));
    }
}
