//Question 739
import java.util.Scanner;

public class ChefFantasy11 {
    	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int possibilities=n*(n-1);
		    System.out.println(possibilities);
		}

	}
}
