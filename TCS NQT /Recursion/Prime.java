// Check whether a number is Prime or not
import java.util.*;
class Main {
    static boolean isPrime(int num, int i){
        if ( num <= 2 )
            return (num==2);
        if ( num % i == 0 )
            return false;
        if ( i * i > num )
            return true;
        return isPrime(num,i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num + " is Prime number => " + isPrime(num, 2));
    }
}
