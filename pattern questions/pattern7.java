
import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n; i++){
            System.out.print("* ");
        }
        System.out.println();
        
        int space1 =1;
        int space2=n-3;
       n--;
       while(n>0){
       
        int t = 1;
        while(t<=space1){
            System.out.print("  ");
            t++;
        }
        

        
        System.out.print("* ");
    
        int s=1;
       while(s<=space2){
            System.out.print("  ");
            s++;
        }
        if(n>1){

      
        System.out.println("*");
    }
       space1++;
       space2--;
       n--;
    }



        
    }
    
}
