import java.util.Scanner ;
public class CSE111LabTask02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter 2nd String: ");
        String str2 = sc.nextLine();
        String result = str1+" "+str2;
        System.out.println(result);
        int sum = 0;
        for (int i =0;i<result.length();i++){
            char ch = result.charAt(i);
            int d = (int)ch;
           if((ch>=65&&ch<=90)||(ch>=97&&ch<=122)){
                sum+=d;
           }
        }
        System.out.println(sum);
    }
}