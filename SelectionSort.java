
public class SelectionSort {

	public static void main(String[] args) {
		int[] a= {30,20,40,98,2,8,90};
		
		
		for(int i=0;i<a.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int tempVar=a[min];
			a[min]=a[i];
			a[i]=tempVar;
			
		}
		System.out.println("after sorted the elements are :");
		for(int ele:a)
		{
			System.out.print(ele+" ");
		}

	}

}
