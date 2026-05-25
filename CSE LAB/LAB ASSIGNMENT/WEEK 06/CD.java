public class CD extends Product {
    public String band;
    public int time;
    public String genre;
    public CD(int i,String b,int p,String ba,int t,String g){
        super(i, b, p);
        band = ba;
        time = t;
        genre =g;
    }
    public String printDetail(){
        return getIdTitlePrice() + " Band: "+ band +" Duration: "+time+" minutes Genre: "+genre;
    }
}
