//Question 769

import java.util.Scanner;

public class PossibleVictory{
public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int r=sc.nextInt();
	    int o=sc.nextInt();
	    int c=sc.nextInt();
	    int required=(20-o)*36;
	    
	    if(r<c+required){
	        System.out.println("yes");
	    }
	    else{
	        System.out.println("no");
	    }

	}
}