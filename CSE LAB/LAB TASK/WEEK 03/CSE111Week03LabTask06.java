 
 
 
 class A {
    public int temp = 3, sum = 9, y = 4, x = 0;
    public A() {
        int sum = 7;
        y = temp - 5;
        sum = temp + 2;
        temp -= 2;
        this.x = sum + temp + y;
    }
    public A(int y, int temp) {
        y = temp - 1 + x;
        sum = temp + 2 - x;
        temp -= 2;
    }
    public void methodB(int m, int[] n) {
        int x = 0;
        y = y + m + this.methodB(x, m);
        x = this.x + 2 + (++n[0]);
        sum = sum + x + y;
        n[0] = sum + 2;
        System.out.println(n[0] + " " + y + " " + sum);
    }
    public int methodB(int m, int n) {
        int[] y = {10};
        this.y = y[0] + this.y + m;
        x = this.y + 2 + temp - n;
        sum = x + y[0] + this.sum;
        System.out.println(y[0] + " " + temp + " " + sum);
        return y[0];
    }
}
public class CSE111Week03LabTask06 {
    public static void main(String[] args) {
        int[] x = {35};
        A a1;
        a1 = new A();
        A a2 = new A(-5, -7);
        a1.methodB(1, x);
        a2.methodB(1, x);
    }
}
