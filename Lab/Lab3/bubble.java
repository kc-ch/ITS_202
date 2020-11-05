public class bubble{
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++ ) {
            for (int j = 0; j< n-1; j++ ) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
            
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,5,1,7,2,3};
        int n = arr.length;

        System.out.print("The unsorted array are : ");
        for (int i = 0; i < n; i++ ) {
            System.out.print(arr[i]+" ");
        }   
        bubbleSort(arr);    
        System.out.println("");
        System.out.print("The sorted array: ");
        for (int i = 0; i < n; i++ ) {
            System.out.print(arr[i]+" ");
        }   
        System.out.println(""); 
    }
}