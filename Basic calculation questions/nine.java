
import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        double B,P;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base value: ");
       
        B=input.nextDouble();
        System.out.println("Enter the perpendicular value: ");
        P=input.nextDouble();
      
        
         System.out.println("Hypotenuse of right angled triangle is : " + Math.hypot(B,P));

       


    }
    
}
