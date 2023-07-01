package lecture11;
import java.util.*;

public class _1_product_of_array_execpt {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] arr = new int[n]; 
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		
		
//		int [] arr = {2,3,4,5};
		
		int [] ans = product(arr);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print( arr[i]  + " ");
		}
		
		
	}
	
	public static int[] product(int [] arr) {
		
		int n = arr.length;
		int [] left = new int[n];
		int	[] right = new int[n];
		
		left[0] = 1;
		
		for (int i = 1; i < n; i++) {
			
			left[i] = left[i-1] * arr[i-1];
		}
		
		
		
		right [n-1] = 1;
		for (int i = n-2; i >= 0; i--) {
			right[i] = right[i+1] * arr[i+1];
		}
		
		for (int i = 0; i < right.length; i++) {
			arr [i]=left[i] * right[i]; 
		}
		
		return arr;
	}
	
	

}
