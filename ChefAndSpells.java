public class ChefAndSpells {
    import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		    Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    for(int i=0;i<t;i++){
		        int a=sc.nextInt();
		        int b=sc.nextInt();
		        int c=sc.nextInt();
		        
		        int sumAB=a+b;
		        int sumBC=b+c;
		        int sumCA=c+a;
		        
		        if(sumAB>=sumBC && sumAB>=sumCA){
		            System.out.println(sumAB);
		        }
		        else if(sumBC>=sumAB && sumBC>=sumCA){
		            System.out.println(sumBC);
		        }
		        else{
		            System.out.println(sumCA);
		        }
		    } 

	}
}

}
