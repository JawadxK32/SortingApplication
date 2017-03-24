/**
 * Main Class Assignment 
 * @author Jawad Khudadad #500526749, Ievgeni Krupchenko #500567156
 *
 */
import java.util.*;

public class Assignment {
	
	final static int N = 100;			// Size of the array
	final static int MAXVALUE = 10*N;	// maximum value in the array
	final static int AVERAGEOVER = 1000000 / N;	//Number of iterations over which to average performance

	public static void main(String[] args) {

		Sort sort = new Sort();
		
		Random rand = new Random();
		int[] array = new int[N];
		int[] aCopy = new int[N];
	
		//System.out.println("Original Array:");
		//System.out.println(Arrays.toString(array));
		
		//System.out.println("Identical Copy of the Array:");
		//System.out.println(Arrays.toString(aCopy));
		
		long fastSortTime=0;
		long slowSortTime=0;
		long startTime=0;
		long stopTime=0;
		
		for(int x=0; x<AVERAGEOVER; x++){
		for(int i=0; i<array.length; i++){
				array[i]=rand.nextInt(MAXVALUE);
				aCopy[i]=array[i];
		}
		
		startTime = System.nanoTime();
		sort.fastsort(array);
		stopTime = System.nanoTime();
		fastSortTime = fastSortTime+(stopTime - startTime);
		
		startTime = System.nanoTime();
		sort.slowsort(aCopy);
		stopTime = System.nanoTime();
		slowSortTime = slowSortTime+(stopTime - startTime);
		}
		long avgFastSortTime = fastSortTime / AVERAGEOVER;
		long avgSlowSortTime = slowSortTime / AVERAGEOVER;
		
		System.out.println("fastSorting: "+avgFastSortTime+" Nanoseconds"); // In nanoseconds
	
		//System.out.println("Array after Fast Sorting:");
		//System.out.println(Arrays.toString(array));
		
		System.out.println("slowSorting: "+avgSlowSortTime+" Nanoseconds"); // In nanoseconds
		
		//System.out.println("Array after Slow Sorting:");
		//System.out.println(Arrays.toString(array));
	}
}
