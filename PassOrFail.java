//Question 730
import java.util.Scanner;

public class PassOrFail {
    public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++){
	    int n=sc.nextInt();
	    int x=sc.nextInt();
	    int p=sc.nextInt();
	    
	    int wrong=n-x;
	    int marks=3*x-wrong;
	    
	    if(marks>=p){
	        System.out.println("pass");
	    }
	    else{
	        System.out.println("fail");
	    }
	}

	}
}
