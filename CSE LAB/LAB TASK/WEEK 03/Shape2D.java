public class Shape2D {
    public String shape;
    public double area;
    public Shape2D() {
        shape = "Square";
        int l = 5;
        System.out.println("A " + shape + " has been created with length " + l);
        area = l * l;
    }
    public Shape2D(int a, int b) {
        shape = "Rectangle";
        System.out.println("A " + shape + " has been created with length " + a + " and " + b);
        area = a * b;
    }
    public Shape2D(int a, int b, String shape) {
        this.shape = shape;
        System.out.println("A " + shape + " has been created with length " + a + " and " + b);
        area = .5 * a * b;
    }
    public Shape2D(int a, int b, int c) {
        shape = "Triangle";
        System.out.println("A " + shape + " has been created with length " + a + " , " + b + " and" + c);
        double s = .5 * (a + b + c);
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public void area() {
        System.out.println("The area of the " + shape + " is: " + area);
    }
}
