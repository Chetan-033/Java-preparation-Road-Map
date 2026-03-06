// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class ArrayList{
    int arr[];
    int size;
    int capacity;
    ArrayList(){
        arr = new int[5];
        capacity = 5;
    }
    public void add(int value){
        if(size == capacity){
            reasignCapacity();
        }
        boolean flag=false;
        for(int i:arr){
            if (i==value)
            {
                flag = true;
            }
        }
        if(!flag){
        arr[size]=value;
        size++;}
    }
    public void reasignCapacity(){
        capacity+=5;
        int newArr[]= new int[capacity];
        for(int i =0;i<size;i++)
        {
            newArr[i]= arr[i];
        }
        arr=newArr;
    }
    public void print(){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
class Main {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(23);
        list.add(21);
        list.add(1);
        list.add(15);
        list.add(30);
        list.add(23); // duplicate element not allow as per practice aim
        list.add(100);
        list.add(24);
        // print method
        list.print();
    }
}

// Output
// 23
// 21
// 1
// 15
// 30
// 100
// 24
