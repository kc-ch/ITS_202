public class SequentialSearchSTTesting{
	public static void main(String[] args) {
		//creating object of the another class
		SequentialSearchST<Integer, String> obj = new SequentialSearchST<Integer, String>();
		//inserting the values and keys
		obj.put(1,"k");
		obj.put(2,"a");
		obj.put(3,"r");
		obj.delete(3);//deleting
		System.out.println("The keys are : "+obj.keys());
		System.out.println("The value in the given key is : "+obj.get(2));
		 
        System.out.println(obj.isEmpty());
        System.out.println("The size is : "+obj.size());

        // testing the functions
        assert(obj.isEmpty() == false);
		assert(obj.size() == 3);

		System.out.println("All the functions are working.");
	}
}