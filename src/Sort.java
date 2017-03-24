/**
 * Class Sort that sorts an array with bubblesort and quicksort algorithms  
 * @author Jawad Khudadad #500526749, Ievgeni Krupchenko #500567156
 *
 */
public class Sort {

	/**
	 * SlowSorting O(n2) algorithm that calls the bubblesort method
	 * @param array
	 */
	public void slowsort(int array[]){
		bubbleSort(array);
	}
    
	/**
	 * This method repeatedly steps through the list to be sorted 
	 * compares each pair of adjacent items and swaps them if they are in the wrong order
	 * @param arr
	 */
	public static void bubbleSort(int arr[]) {
		int tmp=0;
		for (int i=0; i<arr.length; i++){
			for(int j=1; j<(arr.length-i); j++){
				if(arr[j-1] > arr[j]){
					tmp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
	/**
	 * Fastsorting O(n logn) algorithm that calls the quickSort method
	 * @param array
	 */
	public void fastsort(int array[]){
		quickSort(array);
	}
	
   /**
    * This method uses divide and conquer to divide the list for subsequent calls to the quick sort in order to sort the array 
    * @param arr
    */
   public static void quickSort(int[ ] arr){
       quickSort( arr, 0, arr.length-1 );
   }

   /**
    * This Method swaps the elements in an array.
    * @param arr an array.
    * @param x the first int to be swapped.
    * @param y the second int to be swapped.
    */
   public static void swap(int[ ] arr, int x, int y){
       int temp = 0;
       temp = arr[x];
       arr[x] = arr[y];
       arr[y] = temp;
   }
   /**
    * @param arr     an integer array
    * @param left     left boundary of array
    * @param right     right boundary of array
    */
  private static void quickSort(int[] arr, int left, int right){
	  
	 int mid = 0;
     int low = left;
     int hi = right;
     
     if (right > left){
        swap(arr, left, (left + right)/2);
        mid = arr[ ( left + right ) / 2 ];
        
        while( low <= hi ){
	     while( ( low < right ) && ( arr[low] < mid )) {++low;}
	     while( ( hi > left ) && ( arr[hi] > mid )) {--hi;}
	     
           if( low <= hi ) {
              swap(arr, low, hi);
              ++low;
              --hi;
              }
        }
        if( left < hi ) { quickSort( arr, left, hi ); }
        if( low < right ) { quickSort( arr, low, right ); }
     }
  }
}
