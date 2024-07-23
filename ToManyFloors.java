//Question 717
import java.util.Scanner;

public class ToManyFloors {
    	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++){
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	    
	    int xFloor= (x-1)/10+1;
	    int yFloor= (y-1)/10+1;
	    
	    int travel;
	    if(xFloor>yFloor){
	        travel=xFloor-yFloor;
	    }
	    else{
	        travel=yFloor- xFloor;
	    }
	    System.out.println(travel);

	}

	}
}
