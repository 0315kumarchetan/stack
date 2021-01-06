public class stack {
    private int[] arr;
    private int tos;
    private int Element_count;


    private void initializeValues(int size){
        this.arr=new int[size];
        this.tos=-1;
        this.Element_count=0;
    }
    private int capacity(){
        return this.arr.length;
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
    public void push(int data) throws Exception{
        if(this.size()==capacity()){
            throw new Exception("Stack is full");
        }
        this.arr[++tos]=data;
        Element_count++;
    }
    public int peek()throws Exception{
        if(this.tos==-1){
            throw new Exception("stack is Empty");
        }
        return this.arr[tos];
    }
    public int pop()throws Exception{
        if(this.Element_count==0){
            throw new Exception("stack is Empty");
        }
        int ele = arr[tos];
        tos--;
        Element_count--;
        return ele;
    }
}