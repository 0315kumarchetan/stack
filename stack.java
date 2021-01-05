public class stack {
    private int[] arr;
    private int tos;
    private int Element_count;


    private void initializeValues(int size){
        this.arr=new int[size];
        this.tos=-1;
        this.Element_count=0;
    }

    public stack(){
        initializeValues(10);
    }
    public stack(int size){
        initializeValues(size);
    }
    
    public int size(){
        if(this.Element_count==0)return 0;
        return this.Element_count;  
    }
    public boolean isEmpty(){
        if(this.tos==-1) return true;
        return false;
    }
    public void push(int data){
        if(this.tos==arr.length-1){
            System.out.println("stack is full");
            return ;
        }
        this.arr[++tos]=data;
        Element_count++;
    }
    public int peek(){
        if(this.tos==-1){
            System.out.println("stack is Empty");
            return -1;
        }
        return this.arr[tos];
    }
    public int pop(){
        if(this.Element_count==0){
            System.out.println("stack is Empty");
            return -1;
        }
        int ele = arr[tos];
        tos--;
        Element_count--;
        return ele;
    }
}