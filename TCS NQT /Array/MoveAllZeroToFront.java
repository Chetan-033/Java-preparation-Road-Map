// 2. Move All Zeros to Front
// Input
// 8
// 0 5 0 1 9 0 5 1
// Output
// [0,0,0,5,1,9,5,1]
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        int arr[]={0,5,0,1,9,0,5,1};
        int index=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i] != 0)
            {
                int temp = arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                index--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
