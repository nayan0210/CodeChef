//Ouestion number 711.
import java.util.Scanner;

public class MinimumNumberOfCoins
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
        
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    
		    if(x%10==0){
		        System.out.println(x/10);
		    }
		    else if(x%10!=0 && x%5==0){
		        System.out.println((x/10)+1);
		    }
		    else{
		        System.out.println(-1);
		    }
		}
	}
}