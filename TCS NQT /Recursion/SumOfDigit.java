// Check Armstrong number
import java.util.*;
class Main {
    static int getSumOfDigit(int num){
        int sum=0;
        while(num!=0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
    static int getSumOfDigitRec(int num){
        if (num==0)
            return 0;
        return num%10 + getSumOfDigitRec(num/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = Math.abs(sc.nextInt());
        System.out.println("Sum Of Digit - " + getSumOfDigitRec(num));
    }
}
