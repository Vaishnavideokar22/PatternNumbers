import java.util.Scanner;

public class PatternNumbers {
    public static void main(String[] args) {

        int n;

        System.out.println("Enter the value for n");

        Scanner sc = new Scanner (System.in);

       n = sc.nextInt();
       
          for( int i = 1; i<= n ; i++){
            for(int j = i; j<=n ; j++){
                System.out.print(j);
}
            
          for(int k = 1; k<=i-1; k++){
                System.out.print(k);
            }
            System.out.print("\n");
            

          
    }
}
    
}
