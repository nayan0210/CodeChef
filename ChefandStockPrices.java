import java.util.Scanner;

public class ChefandStockPrices {
    public static void main(String[] args) {
        
    
     Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int s=sc.nextInt();
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        
	        double newPrice=s*(1+c/100.0);
	        
	        if((newPrice>=a)&&(newPrice<=b)){
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("No");
	        }

      }      
   }
}
