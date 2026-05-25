public class CSEStudent extends Student {
    public static int count;
    public static String [] arr = {"CSE110", "CSE111", "CSE220", "CSE221"};
    public static void details(){
        System.out.println("Total CSE Students: "+count);
        System.out.println("Available Lab Based Courses:");
        for(int i  = 0;i<arr.length;i++){
            if(i==arr.length-1){
                System.out.println(arr[i]);
            }
            else{
                System.out.print(arr[i]+" ");
               
            }
        }
    }
   public CSEStudent(String n, int i){
    super(n, i);
    count++;
   }
   public void addLabBasedCourse(String c){
    boolean found = false;
    for(int i = 0;i<arr.length;i++){
        if(arr[i].equals(c)){
            found = true;
            break;
        }
    }
    if(!found){
        System.out.println("It is not a lab based course!");
    }
    else{
        courses += c +" ";
    }
   }
}
