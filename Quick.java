
public class Quick {
	int partition (int a[], int low, int high)  
	{  
	    int pivot = a[high];  
	    int i = (low - 1);  
	  
	    for (int j = low; j <= high - 1; j++)  
	    {  
	       
	        if (a[j] < pivot)  
	        {  
	            i++;   
	            int t = a[i];  
	            a[i] = a[j];  
	            a[j] = t;  
	        }  
	    }  
	    int t = a[i+1];  
	    a[i+1] = a[high];  
	    a[high] = t;  
	    return (i + 1);  
	}  
	  
                                        	// function to implement quick sort  
	void quick(int a[], int start, int end)  
	{  
	    if (start < end)  
	    {  
	        int p = partition(a, start, end);  //p is partitioning index  
	        quick(a, start, p - 1);  
	        quick(a, p + 1, end);  
	    }  
	}  
	  
	// function to print an array 
	void printArr(int a[], int n)  
	{  
	    int i;  
	    for (i = 0; i < n; i++)  
	        System.out.print(a[i] + " ");  
	}  
	    public static void main(String[] args) {  
	    int a[] = { 190, 85 , 189, 27, 2, 19, 25 };  
	    int n = a.length;  
	    System.out.println();
	    System.out.println("Before sorting array elements are :: ");  
	    Quick q1 = new Quick();  
	    q1.printArr(a, n);  
	    q1.quick(a, 0, n - 1); 
	    System.out.println();
	    System.out.println("After sorting array elements are - ");  
	    q1.printArr(a, n);  
	    System.out.println();  
	    }  
	}  


