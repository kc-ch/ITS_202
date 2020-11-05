public class Quick {

    /**
     * Rearranges the array in ascending order, using the natural order.
     * @param a the array to be sorted
     */
    public static void sort(int[] a) {
        int n = a.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(a[i]); 
        System.out.println(); 
    }

    // quicksort the subarray from a[lo] to a[hi]
    private static void sort(int[] a, int lo, int hi) { 
        if (lo < hi) 
        { 
            /* index is partitioning index, a[index] is  
              now at right place */
            int index = partition(a, lo, hi); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(a, lo, index-1); 
            sort(a, index+1, hi); 
        } 
    }

    // partition the subarray a[lo..hi] so that a[lo..j-1] <= a[j] <= a[j+1..hi]
    // and return the index j.
    private static int partition(int[] a, int lo, int hi) {
        int pivot = a[hi];  
        int i = (lo-1); // index of smaller element 
        for (int j=lo; j<hi; j++) 
        { 
            // If current element is smaller than the pivot 
            if (a[j] < pivot) 
            { 
                i++; 
  
                // swap a[i] and a[j] 
                int temp = a[i]; 
                a[i] = a[j]; 
                a[j] = temp; 
            } 
        } 
  
        // swap a[i+1] and a[hi] (or pivot) 
        int temp = a[i+1]; 
        a[i+1] = a[hi]; 
        a[hi] = temp; 
  
        return i+1; 
    }



   /***************************************************************************
    *  Helper sorting functions.
    ***************************************************************************/
    
    // is v < w ?
    private static boolean less(Comparable v, Comparable w) {
         return v.compareTo(w) < 0;
    }
        
    // exchange a[i] and a[j]
    private static void exch(int[] a, int i, int j) {
        int exch = a[i];
        a[i] = a[j];
        a[j]=exch;  
    }


   // // /***************************************************************************
   // //  *  Check if array is sorted - useful for debugging.
   // //  ***************************************************************************/
    private static boolean isSorted(int[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    private static boolean isSorted(int[] a, int lo, int hi) {
         for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) {
                return false;
            }
        return true;
    }


   //  // print array to standard output
    private static void show(int[] a) {
         for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /**
     * Reads in a sequence of values ; quicksorts them; 
     * and prints them to standard output in ascending order. 
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int[] a = {2,1,0,9,1,20};
        int n = a.length;

        Quick obj = new Quick();
        obj.sort(a,0,n-1);

        System.out.println("sorted array are: ");
        show(a);
        assert isSorted(a);

    }

} 