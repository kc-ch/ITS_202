public class selection{
	public static void main(String[] args) {
		int arr[]={7,1,4,2,6,3};//array 
		int n=arr.length;//giving the variable
		System.out.println("The unsorted array is:");
		for(int k=0; k<n; k++){
			System.out.print(arr[k]+" ");
		}
		System.out.println(" ");
		System.out.print("Now the sorted array is: ");
		//looping through the array
		for(int i=0; i<=n-1;i++){
			int smallest=i;//storing i in the smallest variable
			for(int j=i+1; j<n; j++){
				// comparing and finding smallest value
				if(arr[j]<arr[smallest]){
					smallest = j; 
				}	
			}
			//swaping the smallest value with i'th term
			int temp=arr[smallest];
			arr[smallest] = arr[i];
			arr[i]=temp;
			
			System.out.print(arr[i]+" ");
		}
		
	}
}