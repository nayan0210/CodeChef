//Qestion 712
import java.util.Scanner;

public class Airlines {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(); 
            int n = sc.nextInt(); 
            
            int totalPlaneNeeded = (n + 99) / 100;
            int requiredPlane = totalPlaneNeeded - x;
            
            if (requiredPlane < 0) {
                requiredPlane = 0;
            }
            
            System.out.println(requiredPlane);
            System.out.println(requiredPlane);
            System.out.println(requiredPlane);
        }
        sc.close(); // Close the Scanner object
    }
}
