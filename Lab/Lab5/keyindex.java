public class keyindex{
	public void key(int a[]){
		int R=5;
		int N = a.length;
 		int[] aux = new int[N];
 		int[] count = new int[R+1];
 		// Compute frequency counts.
 		for (int i = 0; i < N; i++){
 			count[a[i]+ 1]++;
 		}
 		
 		// Transform counts to indices.
 		for (int r = 0; r < R; r++){
 			count[r+1] += count[r];
 		}
 		
 		// Distribute the records.
		for (int i = 0; i < N; i++){
			aux[count[a[i]]++] = a[i];
		}
		
 		// Copy back.
 		for (int i = 0; i < N; i++){
 			a[i] = aux[i];
 		}
 		for(int i :a){
 			System.out.print(i +" ");
 		}
	}
	public static void main(String[] args) {
		keyindex obj = new keyindex();
 		int a[] = {2,3,1,1,1,0,4};
        obj.key(a);
    }   
}