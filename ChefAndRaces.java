//Question 745
import java.util.Scanner;

public class ChefAndRaces {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    
		     int count = 0;
            
            if (x == a || x == b) {
                count++;
            }
            if (y == a || y == b) {
                count++;
            }
            
            int result = 2 - count;
            System.out.println(result);
        }
	}
}
