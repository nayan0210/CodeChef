//Question 752
import java.util.Scanner;

public class EndlessAppetizers {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int x=sc.nextInt();
	        int y=sc.nextInt();
	        int r=sc.nextInt();
	        
	        int extra=r/30;
	        int totalPlate=x+extra;
	        
	        if(totalPlate%y==0){
	            System.out.println(totalPlate/y);
	        }
	        else{
	            System.out.println((totalPlate/y)+1);
	        }
	    }

	}
}
