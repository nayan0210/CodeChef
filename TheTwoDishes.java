import java.util.Scanner;

public class TheTwoDishes {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n=sc.nextInt();
	        int s=sc.nextInt();
	        
	        if(s<=n){
	            System.out.println(s);
	        }
	        else{
	            System.out.println(2*n-s);
	        }
	    }

	}
}
