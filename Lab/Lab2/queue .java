public class queue {
	int max;
	int rear;
	int size;
	int front;
	int array[];
	public queue(){
		max = 10;
		rear = 1;
		size = 0;
		front = 1;
		array = new int[max];
	}
	public boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}
	public int len() {
		if(isEmpty()) {
			return 1;
		}
		return size;
	}
	public void enqueue(int a) {
		if(rear > max) {
			System.out.println("Queue OverFlow");
		}
		else{
		array[rear] = a;
		rear++;
		size++;
		System.out.println("The value is = " + a);
		}
	}
	public int dequeue() {
		if(rear > max) {
			System.out.println("Queue UnderFlow");
		}
		else {
			int a;
			a = array[front];
			front++;
			size--;
			return a;
		}
		return front;
	}
	public int first() {
		if(isEmpty()) {
			return 1;
		}
		else {
		int a;
		a = array[front];
		return a;
		}
	}
	public static void main(String[] args) {
		queue obj = new queue();
		obj.enqueue(1);
		obj.enqueue(4);
		obj.enqueue(6);
		obj.enqueue(8);
		obj.enqueue(10);

		System.out.println("The data that is dequeue is = " +obj.dequeue());
		System.out.println("The queue is empty = "+ obj.isEmpty());
		System.out.println("The first data in the queue is = " + obj.first());
		System.out.println("The length of a queue elements is : " + obj.len());
		
		assert(obj.isEmpty() == false);
		assert(obj.first() == 4);
		assert(obj.len() == 4);
		System.out.println("All the test passed");
	 }
}