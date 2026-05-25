import java.util.Scanner;
public class CSE111LabAssignment01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int counter = 0;
        int i=0;
        int j=0;
        for (i = n1 ; i <= n2 ; i++) {  
            
            for ( j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i==j) {
                counter++;
            }
        }
        System.out.println("There are " + counter + " prime numbers between " + n1 + " and " + n2);
    }
}
