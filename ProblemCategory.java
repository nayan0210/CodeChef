import java.util.Scanner;

public class ProblemCategory {
    public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++){
	    int x=sc.nextInt();
	    if(x<100 && x>=1){
	        System.out.println("Easy");
	    }
	    else if(x<200 && x>=100){
	        System.out.println("Medium");
	    }
	    else{
	        System.out.println("Hard");
	    }
	}

	}
}
