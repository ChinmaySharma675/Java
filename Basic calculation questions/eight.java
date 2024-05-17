
import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        double r, A,C;
        double n = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("enter radius of circle : ");
        r=input.nextFloat();
         A= n*Math.pow(r,2) ;
         C= 2*n*r ;
        System.out.println("area of circle is : " + A);
        System.out.println("circumference of circle is : " + C);


    }
    
}
