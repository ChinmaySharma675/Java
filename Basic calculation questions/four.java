
import java.util.Scanner;



public class four {
    public static void main(String[] args) {
        int x,y,z;
        Scanner input = new Scanner(System.in);
        System.out.println("type a number:");
        x=input.nextInt();
        System.out.println("type another number");
        y=input.nextInt();
        z=x-y;
        System.out.println("difference is " + z);
    }
}