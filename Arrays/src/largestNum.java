import java.util.*;
public class largestNum {
	
	public static int largestNum(int[] numbers) {
		
		int smallest=Integer.MAX_VALUE;
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}
			if(smallest>numbers[i])
			{
				smallest=numbers[i];
			}
		}
		System.out.println("Smallest element is "+smallest);
		return largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers= {23,45,67,89,120,54};
		System.out.println("The largest element is "+largestNum(numbers));
		
	}

}
