class A {
  public static int temp = 4;
  public static int x = -10;
  public int sum = 0;
  public int y = 0;
  public A() {
    y = temp - 2;
    sum = temp + 1;
    temp -= 2;
  }
  public void methodA(int m, int n) {
    int x = 0;
    y = y + m + (temp++);
    x = x + 1 + n;
    sum = sum + x + y;
    System.out.println(x + " " + y + " " + sum);
  }
}
class B extends A {
  public static int x = 0;
  public int sum = -6;
  public B() {
    sum = 0;
    y = temp + 3;
    super.sum = 3 + temp + 2;
    temp -= 2;
  }
  public B(B b) {
    sum = b.sum + super.sum;
    x = b.x + 1;
    b.methodB(2, 3);
  }
  public void methodB(int m, int n) {
    int y = 0;
    y = y + this.y;
    x = y + 2 + (++temp);
    methodA(x, y);
    sum = x + y + sum;
    System.out.println(x + " " + y + " " + sum);
  }
}
public class CSE111Week07LabTask05 {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        B b2 = new B(b1);
        b1.methodA(2, 3);
        b2.methodB(3, 8);
    }
}
