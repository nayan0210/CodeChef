import java.util.Scanner;

public class CupFinals {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int d=sc.nextInt();
		    
		    if((x-y)<=d && (y-x)<=d){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}

	}
}
