import java.util.Scanner;
public class optionalLabTask04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int N = sc.nextInt();
        int [] arr = new int[N];
        for(int i = 0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =N-1;i>=0;i--){
            System.out.print(" "+arr[i]+" ");
        }
    }
}
