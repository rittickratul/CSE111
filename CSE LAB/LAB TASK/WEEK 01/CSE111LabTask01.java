import java.util.Scanner;
public class CSE111LabTask01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total inputs");
        int n = sc.nextInt();
        int sum = 0;
        double avg = 0;
        int min = -10000000;
        int max = 10000000;
        double validInput = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter input no" + i + ": ");
            int num = sc.nextInt();
            if (num >= 0 && num % 2 != 0) {
                sum += num;
                validInput++;
                if (num > min) {
                    min = num;
                }
                if (num < max) {
                    max = num;
                }
            } else {
                System.out.println("NO odd positive number found");
            }
        }
        avg = sum / validInput;
        System.out.println("Sum= " + sum);
        System.out.println("Maximum= " + min);
        System.out.println("Average= " + avg);
        System.out.println("Minimum= " + max);
    }
}
