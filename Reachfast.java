//Question 777

import java.util.Scanner;

public class Reachfast {
     public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            
            int distance = a - b;
            if (distance < 0) {
                distance = -distance;
            }
            
            int steps = (distance + k - 1) / k;  
            System.out.println(steps);  
        }
    }
}
