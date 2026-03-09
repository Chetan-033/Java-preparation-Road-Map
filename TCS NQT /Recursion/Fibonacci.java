// Print Fibonacci series up to N terms
import java.util.*;
class Main {
    static void getFibonacci(int a,int b,int num){
        if (num == 0)
            return;
            
        System.out.println(a);
        getFibonacci(b, a+b, num-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // String str = sc.nextLine();
        getFibonacci(0,1,5);
    }
}
