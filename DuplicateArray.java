
public class DuplicateArray {

	public static void main(String[] args) {
		int[] a= {5,7,3,4,6,9,5,7,1,9,3};
		System.out.println("Array Of Elements");
		for(int i=0;i<a.length;i++)
			System.out.print(" "+a[i]);
		System.out.println();
		
		System.out.println("Duplicate Array elements");
		
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]==a[j])
					
				 System.out.print(" "+a[j]);
			 }
		 }

	}

}
