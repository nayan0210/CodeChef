//Question 718
import java.util.Scanner;
public class SpeedLimitTest{
public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    float a=sc.nextInt();
		    float x=sc.nextInt();
		    float b=sc.nextInt();
		    float y=sc.nextInt();
		    
		    float speedA=x/a;
		    float speedB=y/b;
		    
		    if(speedA==speedB){
		        System.out.println("Equal");
		    }
		    else if(speedA>speedB){
		        System.out.println("Bob");
		    }else{
		        System.out.println("Alice");
		    }		    
		}
	}
    }

    