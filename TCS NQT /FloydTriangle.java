import java.util.*;
class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row Count");
        int rowCount = sc.nextInt();
        int num=1;
        for(int i = 0;i<rowCount;i++){
            for(int j = 0;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
// Output
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
// 16 17 18 19 20 21 
