//Question 722
import java.util.Scanner;

public class IncrementOrDecrement {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%4==0){
		    n++;
		}
		else{
		 n--;
		}
		System.out.println(n);

	}
}
