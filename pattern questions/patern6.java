import java.util.Scanner;

public class patern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        int space = n-3;
        n--;

        while(n>0){
            System.out.print("* ");
            int curr=space;
            while(curr>0){
                System.out.print("  ");
                curr--;
            }
            if(n>1){
                System.out.println("* ");
            }
            space--;
            n--;
        }
        
     
    }
}
        
    

