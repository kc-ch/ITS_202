public class stack {
  int max; 
  int arr[]; 
  int top;
  int size;

  //constructor to assign values to the variables
  public stack(){
    max = 10;
    top=-1;
    arr=new int[max];
    size=0;
  }
  public boolean isEmpty(){
    if (size == 0){
      return true;
    }
    else{
      return false;
    }
  }
  public int size(){
    return size;
  }
  public int top(){
    if(isEmpty()){
      return 0;
    }
    else{
      return arr[top];
    }
  }
  public void push(int x){
    if(top>max){
      System.out.print("stack overflow");
    }
    else{
      top++;
      arr[top]=x;
      System.out.println(x);
    }

    size+=1;

    
  }
  public int pop(){
    if(isEmpty()){
      System.out.print("stack underflow");
    }
    else{
      top = top-1;
    }
    size = size-1;
    return arr[top+1];
    
    
  }
  // main method
  public static void main(String[] args) {

    stack obj=new stack(); // creating object of class stack
    obj.push(1);
    obj.push(2);
    obj.push(3);
    obj.push(10);
    System.out.println("The size is = "+obj.size());
    System.out.println("The popped value ="+obj.pop());
    System.out.println("The size is = "+obj.size());
    System.out.println("The top value is = "+obj.top());

    //checking whether all functions are working
    assert(obj.isEmpty() == false);
    assert(obj.size() == 3);
    assert(obj.top() == 3);
    System.out.println("All the functions are working");
    
  }

  
}