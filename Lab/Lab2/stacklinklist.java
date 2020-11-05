class Node{
	int data;
	Node next;

	public Node(int data){
		this.data = data;
		this.next = null;
	}
}
public class stacklinklist{
	
	Node head; 
	int size;
	public stacklinklist(){
		Node head = null; 
		int size = 0;;	
	}

	public void push(int data){
		
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		System.out.println(data);

		if(isEmpty()){
      		System.out.print("stack underflow");
    	}
    	else{
    		size += 1;

    	}
	}
	public boolean isEmpty(){
		if(head == null){
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
		if (head == null) {
			System.out.println("The stack is empty");
		}
		return head.data;
	}
	public void pop(){
		Node tem = head;
		this.head = this.head.next;
		System.out.println("The pop data is ="+tem.data);

		if(isEmpty()){
      		System.out.print("stack underflow");
    	}
    	else{

		size -= 1;
    	}
	}
}