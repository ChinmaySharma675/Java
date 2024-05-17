import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        int x,y;

        Scanner input = new Scanner(System.in);
        System.out.println("Type a number: ");
        x = input.nextInt();

        System.out.println("Type another number");
        y = input.nextInt();
       
         System.out.println(Math.pow(x,y));

    }
    
}
