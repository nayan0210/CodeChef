//Question 760
import java.util.Scanner;
public class SmallFactorial{
public static void main (String[] args) throws java.lang.Exception
{
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;i++){
        int n=sc.nextInt();
        int temp=1;
        for(int j=1;j<=n;j++){
            temp=temp*j;
        }
        System.out.println(temp);
    }

}
}