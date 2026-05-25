// Not finnished
public class Triangle {
    public Triangle name;
    public int a;
    public int b;
    public int c;
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void triangleDetails() {
        System.out.printf("Three sides of the triangle are: %d, %d ,%d\n", a, b, c);
        System.out.println("Perimeter: " + (a + b + c));
    }
    public String printTriangleType() {
        if (a == b && b == c && c == a) {
            return "This is an Equilateral Triangle.";
        } else if (a == b || b == c || c == a) {
            return "This is an Isosceles Triangle.";
        } else {
            return "This is an Scalene Triangle.";
        }
    }
    public void compareTriangles(Triangle t){
       if (this == t) {
            System.out.println("These two triangle objects have the same address.");
        } else if (this.a == t.a && this.b == t.b && this.c == t.c) {
            System.out.println("Addresses are different but the sides of the triangles are equal."); 
        } else if ((this.a + this.b + this.c) == (t.a + t.b + t.c)) {
            System.out.println("Only the perimeter of both triangles is equal."); 
        } else {
            System.out.println("Addresses, length of the sides and perimeter all are different.");
        }
    }
}
