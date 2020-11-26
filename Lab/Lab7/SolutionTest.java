public class SolutionTest{
	public static void main(String[] args) {
		Solution <Integer, String> obj = new Solution<Integer, String>();
		System.out.println(obj.isEmpty());
		obj.put(1,"Karma"); 
		obj.put(5,"Choden"); 
		obj.put(3,"Pema"); 
		obj.put(10,"Dorji"); 
		System.out.println(obj.isEmpty());
		System.out.println(obj.floor(7)); 
		System.out.println(obj.min());
		System.out.println(obj.get(10));
		System.out.println(obj.select(2));

		assert(obj.isEmpty() == false);
		assert(obj.floor(7) == 5);
		assert(obj.min() == 1);

		System.out.println("ALL THE FUNCTION ARE WORKING");
	}
}