import java.util.Scanner;
public class CSE111LabTask03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("N= ");
        int N = sc.nextInt();
        double [] arr1 = new double[N];
        int removed = 0;
        System.out.println("Please enter the elements of the array: ");
        for (int i = 0;i<N;i++ ){
          arr1[i] =sc.nextDouble();
        }
        for(int i = 0 ;i<N-1;i++){
            if(arr1[i]==arr1[i+1]){
                removed ++;
            }
        }
        if(removed == 0){
            System.out.println("No consequte dublicates found");
        }
        else{
            double [] newArray = new double[N-removed];
            int indx = 0;
            for(int i = 0;i<newArray.length;i++){
                if(arr1[i]!=arr1[i+1]){
                    newArray[indx] = arr1[i];
                    indx++;
                }
            } 
            arr1 = newArray;
        }
        System.out.print("New Array: ");
        for(int i = 0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\nRemoved element: "+removed);
    }
}