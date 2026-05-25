import java.util.Scanner;
public class CSE111LabAssignment02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result ="";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            int d = (int)ch;
            if(d>97&&d<=122){
                d--;
                ch = (char)d;
                result+=ch;
            }
            else{
                d+=25;
                ch = (char)d;
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
