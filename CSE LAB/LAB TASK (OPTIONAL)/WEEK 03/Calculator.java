public class Calculator {
    public void add(int a ,int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public void add(int a ,int b,int c){
    int sum = a+b+c;
    System.out.println(sum);
    }
    public void multiply(int a ,int b){
        int multi = a*b;
        System.out.println(multi);
    }
    public void multiply(int a ,int b,int c){
        int multi = a*b*c;
        System.out.println(multi);
    }
    public void multiply(String a ,int b){
        for(int i = 1;i<=b;i++){
           if(i!=b){
             System.out.print(a+"-");
           }
           else{
            System.out.print(a+"\n");
           }
        }
    }
}
