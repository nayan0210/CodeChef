import java.util.*;
public class Motivation{
public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   for(int i=0;i<t;i++){
	       int n=sc.nextInt();
	       int x=sc.nextInt();
	      
	       
	       int rating=0;
	       for(int j=0;j<n;j++){
	            int s=sc.nextInt();
	            int r=sc.nextInt();
	           if(s<=x && r>rating){
	               rating=r;
	           }
	          
	       }
	        System.out.println(rating);
	   }

	}
}