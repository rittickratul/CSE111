public class ComplexNumber extends RealNumber {
    public double imaginary = 1;
    public ComplexNumber(){
        super.realValue = 1;
    }
    public ComplexNumber(Double d1,Double d2){
        super(d1);
        imaginary =d2; 
    }
    public String details(){
        return getReal()+"\nImaginary Part: "+imaginary;
    }
}
