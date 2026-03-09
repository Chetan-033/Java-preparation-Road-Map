// Check Armstrong number
import java.util.*;
class Main {
    static int isArmstrong(int num){
        int digit = String.valueOf(num).length();
        System.out.println(digit);
        int temp=0;
        int sum=0;
        while(num!=0){
            temp = num%10;
            sum += Math.pow(temp,digit);
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = Math.abs(sc.nextInt());
        System.out.println(isArmstrong(num));
    }
}
