
// Question 716

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
		    int n=sc.nextInt();
		    int eligible=0;

		    for(int j=0;j<n;j++){
		        
		    int a=sc.nextInt();
		    
		    if(a>=10 && a<=60){
		        eligible++;
		    }
		}
		    		    System.out.println(eligible);

		}
		

	}
}
