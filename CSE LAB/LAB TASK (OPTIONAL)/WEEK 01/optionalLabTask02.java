import java.util.Scanner;
public class optionalLabTask02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex=0,maxIndex=0;
        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is: ");
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
         for(int i = 0; i<arr.length;i++){
           if(max<arr[i]){
            max = arr[i];
            maxIndex=i;
           }
           if(min>arr[i]){
            min = arr[i];
            minIndex=i;
           }
        }
        System.out.println("The largest number "+max+ " was found at location "+ maxIndex);
        System.out.println("The smallest number "+min+ " was found at location "+ minIndex);
    }
}
