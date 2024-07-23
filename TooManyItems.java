//Question 738
import java.util.Scanner;

public class TooManyItems {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		
		if(n%10!=0){
		    System.out.println((n/10)+1);
		}
		else{
		    System.out.println(n/10);
		}
		}
	}
}
