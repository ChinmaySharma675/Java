
import java.util.Scanner;

public class program3 {
    public static void main(String [] args) {
        try (Scanner in = new Scanner(System.in)) {
            float tempC = in.nextFloat();
            float tempF = (tempC * 9/5) + 32;
            System.out.println(tempF);
        }
    }
}