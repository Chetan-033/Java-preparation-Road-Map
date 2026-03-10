import java.util.*;
class Main {
    public static void main(String[] args) {
        // upcasting inmportant used in spring boot...
        List<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(20);
        // 1️⃣ Find duplicate elements
        // HashSet<Integer> set= new HashSet<>();
        // for(int i:arr){
        //     if(!set.add(i)){
        //         System.out.println("Duplicate - " + i);
        //     }
        // }
        
        // 2️⃣ Find Maximum Number
        // System.out.println(Collections.max(arr));
        
        // 3️⃣ Reverse ArrayLis
        // Collections.reverse(arr);
        // System.out.println(arr);
        
        // 4️⃣ Sort ArrayList
        // Collections.sort(arr);
        // System.out.println(arr);
        
        // Iterator with ArrayLisy...
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        // Array to ArrayList conversion
        // Integer[] list = {1,4,2,5,7};
        // ArrayList<Integer> arr1=new ArrayList<>(Arrays.asList(list));
        // System.out.println(arr1);
    }
}
