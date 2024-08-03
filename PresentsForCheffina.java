//Question 757
import java.util.Scanner;

public class PresentsForCheffina {
    public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++){
	    int n=sc.nextInt();
	    int discount=(n/5);
	    if(n<=4){
	        System.out.println(n);
	    }
	    else{
	        
	        System.out.println(n-discount);
	    }
	}

	}
}
