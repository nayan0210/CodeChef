//Question 777
import java.util.Scanner;

public class MutatedMinions {
    public static void main (String[] args) throws java.lang.Exception
	{
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        int minion[]=new int[n];
        int count=0;
        
        for(int j=0;j<n;j++){
            minion[j]=sc.nextInt();
            minion[j]=minion[j]+k;
            
            if(minion[j]%7==0){
                count++;
            }
        }
        System.out.println(count);
    }
	}
}
