//Question 730
public class SecondLargest {
    public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++){
	    int arr[]=new int[3];
	    for(int j=0;j<3;j++){
	        arr[j]=sc.nextInt();
	        
	    }
	    Arrays.sort(arr);
	    System.out.println(arr[1]);
	}

	}
}
