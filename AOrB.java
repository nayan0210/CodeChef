//Question 728
public class AOrB {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    
		    int diffAB= (500-2*x)+(1000-(x+y)*4);
		    int diffBA= (1000-(4*y))+(500-(x+y)*2);
		    
		    if(diffBA>diffAB){
		        System.out.println(diffBA);
		    }
		    else{
		        System.out.println(diffAB);
		    }
		}
	}
}
