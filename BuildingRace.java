//Question 739
import java.util.Scanner;

public class BuildingRace {
    	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    double a=sc.nextDouble();
		    double b=sc.nextDouble();
		    double x=sc.nextDouble();
		    double y=sc.nextDouble();
		    
		    if((x/a)==(y/b)){
		        System.out.println("Both");
		    }
		    else if((x/a)>(y/b)){
		        System.out.println("Chef");
		    }
		    else{
		        System.out.println("Chefina");
		    }

		}

	}
}
