
public class linearSearch {
	
	public static int linearSearch(int numbers[],int key) {
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==key) {
				return i;
			}
				
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers= {2,4,8,12,24,56,78};
		int key=40;
		
		int index=linearSearch(numbers,key);
		if(index == -1) {
			System.out.println("Number not found");
		}
		else {
			System.out.println("Key is at index " + index);
		}
		
	}

}
