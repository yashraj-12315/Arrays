
public class Update {

	public static void update(int marks[]) {
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=marks[i]+10;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks[]= {70,80,90};
		update(marks);
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i]+" ");
		}
		System.out.println();
		
		
		
	}

}
