// Find GCD of two numbers and Find LCM of two numbers
import java.util.*;
class Main {
    static int getGCD(int a,int b){
        if (b==0)
            return a;
        return getGCD(b,a%b);
    }
    static int getLCM(int a,int b){
        return (a*b)/getGCD(a,b);   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = Math.abs(sc.nextInt());
        int b = Math.abs(sc.nextInt());
        System.out.println("GCD =" + getGCD(a,b)); 
        System.out.println("LCM =" + getLCM(a,b)); 
    }
}
