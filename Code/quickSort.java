import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class quickSort {

	public static void swap(int arr[], int low, int high)
	{
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
	}
	
	public static int partition(int arr[], int low, int high)
	{
		
		//pivot 
		int pivot = arr[high];
		
		/* Index of smaller element and indicates the right position of pivot 
		 * found so far
		 */
		int i = (low - 1);
		
		for(int j = low; j <= high - 1; j++)
		{
			
			//If current element is smaller than pivot
			if(arr[j] < pivot)
			{
				
				//increment index of smaller element
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i+1, high);
		return (i + 1);
	}
	
	public static void quickSort(int[] arr, int low, int high)
	{
		if(low < high)
		{
			//pi is partioning index, arr[p]
			//is now at right place
			int pi = partition(arr, low, high);
			//Seperately sort elements before
			//partition and after partition
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	
	//Function to print array
	public static void printArray(int[] arr, int size)
	{
		for(int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> x = new ArrayList<>(Arrays.asList(5, 6, 4, 2, 1, 7, 8, 0, 9));
		int[] x = {5, 6, 4, 2, 1, 7, 8, 0, 9};
		int n = x.length;
		
		quickSort(x, 0, n - 1);
		System.out.println("Sorted array: ");
		printArray(x, n);
	}

}
