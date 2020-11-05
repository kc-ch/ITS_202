public class linearSearch{
	public void search(int []a){
		int n = a.length;
		int value = 8;
		for (int i=0;i<n;i++ ) {
			if(a[i]==value){
				System.out.println("The value " +value+ " is in index: "+i);
				return;
			}
			
		}
		System.out.println("The value is not in an array");
	}
			
	public static void main(String[] args) {
		int a[] = {2,8,3,9,8,0};
		linearSearch k =new linearSearch();
		k.search(a);
	}
}