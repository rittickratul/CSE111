public class Cat extends Animal{
    public String br;
    public Cat(String n, int a,String c,String b){
        super(n,a,c);
        br = b;
    }
   public String  catInfo(){
    return "Name: "+name+"\nAge: "+age+"\nColor:"+color+"\nBreed: "+br;
   }
   public void makeSound(){
    System.out.println(color+"  color "+name+" is meowing");
   }
}