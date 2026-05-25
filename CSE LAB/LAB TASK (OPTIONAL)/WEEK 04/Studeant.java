public class Studeant {
    public String name;
    private int id;
    public double cg;
    public Studeant(String n , int i,double c){
        name = n;
        id = i;
        cg = c;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id ;
    }
}
