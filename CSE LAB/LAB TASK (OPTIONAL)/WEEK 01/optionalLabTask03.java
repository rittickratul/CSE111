import java.util.Scanner;
public class optionalLabTask03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];
        for(int i =0;i<N;i++){
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        int l = arr.length;
        if(l%2!=0){
            System.out.println("The median is "+(arr[(l-1)/2]));
        }
        else{
            System.out.println("The median is "+(arr[l/2]+arr[l/2-1])/2);
        }
    }
}
