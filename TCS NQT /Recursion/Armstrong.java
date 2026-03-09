// Check Armstrong number
import java.util.*;
class Main {
    static int isArmstrong(int num){
        int temp=num;
        int sum=0;
        int digit=0;
        while(temp!=0){
            digit++;
            temp=temp/10;
        }
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
        if(isArmstrong(num) == num)
        {
            System.out.println("Armstrong number");   
        }
        else {
            System.out.println("Not Armstrong number");
        }
    }
}
