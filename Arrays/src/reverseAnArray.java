
public class reverseAnArray {
	public static void reverse(int[] num) {
		int start=0;
		int last=num.length-1;
		
		while(start <= last)
		{
			int temp = num[last];
			num[last]=num[start];
			num[start]=temp;
			
			start++;
			last--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {2,4,6,8,10};
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		System.out.println('\n');
		reverse(num);
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
		}
		

	}

}
