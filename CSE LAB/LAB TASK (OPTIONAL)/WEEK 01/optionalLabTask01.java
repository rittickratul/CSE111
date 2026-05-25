import java.util.Scanner;
public class optionalLabTask01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int N = sc.nextInt();
        int [] arr = new int[N];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt(); 
        }
        System.out.println("Input array: ");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" "); 
        }
        System.out.print("\n Removed Element = ");
        int removed = sc.nextInt();
        int count = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==removed){
                count++;
            }
        }
        if(count==0){
            System.out.println("Element not found");
        }
        else{
            int newArray [] = new int[N-count];
            int indx = 0;
            for(int i = 0;i<N;i++){
                if(removed!=arr[i]){
                    newArray[indx]= arr[i];
                    indx++;
                }
            }
            arr = newArray;
        }
        System.out.println("New array: ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
}