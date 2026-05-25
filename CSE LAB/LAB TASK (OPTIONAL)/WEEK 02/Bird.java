public class Bird {
    public String name;
    public void flyUp(int n1){
        System.out.println(name+" has flown up "+ n1 +" feet");
    }
    public void makeNoise(){
        if(name.equals("Parrot")){
            System.out.println("Squak");
        }
        else{
            System.out.println("Squee");
        }
    }
    public void flyDown(int n2){
        if(name.equals("Parrot")){
            if(n2>=1&&n2<2){
                System.out.println(name+" has flown down "+ n2 +" feet and landed");
            }
            else if(n2>=2&&n2<5){
                System.out.println(name+" has flown down "+ n2 +" feet" );
            }
            else{
                System.out.println(name+" can't fly down  "+ n2 +" feet" );
            }
        }
        else{
                System.out.println(name+" has flown down "+ n2 +" feet and landed");
        }
    }
}
