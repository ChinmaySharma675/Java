
import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        int l,b,A,P;
        Scanner input = new Scanner(System.in);
        System.out.println("enter length:");
        l=input.nextInt();
        System.out.println("enter breadth:");
        b=input.nextInt();
        A=l*b;
        P=2*(l+b);

        System.out.println("Area of reactangle is : " + A);
        System.out.println("perimeter of rectangle is : " + P);

    }
    
}
