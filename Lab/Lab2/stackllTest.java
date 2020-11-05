public class stackllTest{
	public static void main(String[] args) {
		stacklinklist k =new stacklinklist();
  		k.push(1);
  		k.push(2);
  		k.push(4);
  		System.out.println("The stack is empty ="+k.isEmpty());
  		System.out.println("The size is = "+k.size());
  		System.out.println("The top is = "+k.top());
  		k.pop();
  		System.out.println("The size is = "+k.size());

  		assert(k.isEmpty() == false);
    	assert(k.size() == 2);
    	assert(k.top() == 2);
    	System.out.println("All the functions are working");

	}
}