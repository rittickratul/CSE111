public class Shape {
    public String shape;
    public double area;
    public void setParameters(String a, int r) {
        this.shape = a;
        this.area = Math.PI * r * r;
    }
    public void setParameters(String sh, int a, int b) {
        this.shape = sh;
        this.area = .5 * a * b;
    }
    public void setParameters(String sh, double a, double b) {
        this.shape = sh;
        this.area = a * b;
    }
    public String details() {
        return "Shape: " + shape + "\n" + "Area: " + area;
    }
}
