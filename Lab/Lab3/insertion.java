public class insertion {  

    public static void insertionSort(int arr[]) {  
        int n = arr.length;  

        for (int i = 0; i < n-1; i++) {  

            for (int j = i + 1; j>0 && Compare(j-1, j, arr) ;j-- ) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
                
            }
        } 
        public static boolean Compare(int i, int j, int[] arr){
            if (arr[i] > arr[j]) {
                return true;  
            }
            return false;   
        }  
       
    public static void main(String[] args) {    
        int[] arr1 = {1,9,2,5,0};    
        insertion obj = new insertion();
        System.out.println("Before the insertionSort:");    
        for(int i = 0; i < arr1.length; i++){    
            System.out.print(arr1[i]+" ");    
        }    
        System.out.println("");
        obj.insertionSort(arr1);

        System.out.println("After Insertion Sort"); 
          for(int i = 0; i < arr1.length; i++){    
            System.out.print(arr1[i]+" ");    
        }   
    }
}