public class Book extends Product{
    public String isbn ;
    public String publisher;
    public Book(int i,String b,int p,String is,String pu){
        super(i, b, p);
        isbn = is;
        publisher = pu;

    }
    public String printDetail(){
        return getIdTitlePrice()+" ISBN: "+ isbn + "  Publisher: "+publisher;
    }
}
