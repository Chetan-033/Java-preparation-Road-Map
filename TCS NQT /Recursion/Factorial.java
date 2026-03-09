// get Factorial of number
import java.util.*;
class Main {
    static int getFactorial(int num){
        if (num==0)
        {
            return 1;
        }
        return num * getFactorial(num-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num + " Factorial = " + getFactorial(num));
    }
}
