import java.util.Scanner;

public class ProgrammimgLanguage {
    	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int  i=0;i<t;i++){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int a1=sc.nextInt();
		    int b1=sc.nextInt();
		    int a2=sc.nextInt();
		    int b2=sc.nextInt();
		    
		    if((a==a1 && b==b1) || (a==b1 && b==a1)){
		        System.out.println(1);
		    }
		    else if(a==a2 && b==b2 || (a==b2 && b==a2)){
		        System.out.println(2);
		    }
		    else{
		        System.out.println(0);
		    }
		}
	}
}
