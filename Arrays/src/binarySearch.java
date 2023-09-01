
public class binarySearch {
	
	public static int binarySearch(int[] numbers,int key) {
		int start=0;
		int end=numbers.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(numbers[mid] == key) {
				return mid;
			}
			if(numbers[mid]<key) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers= {2,4,8,12,15,18};
		int key=12;
		System.out.println("Index for the key is "+binarySearch(numbers,key));
	}

}
