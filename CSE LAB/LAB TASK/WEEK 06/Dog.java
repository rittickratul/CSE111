public class Dog  extends Animal {
    public String br;
    public Dog(String n, int a,String c,String b){
        super(n,a,c);
        br = b;
    }
    public String  dogInfo(){
        return "Name: "+name+"\nAge: "+age+"\nColor:"+color+"\nBreed: "+br;
       }
       public void makeSound(){
        System.out.println(color+"  color "+name+" is barking");
       }
}