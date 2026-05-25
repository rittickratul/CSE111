
class Trace {

    public int x, y = 5, temp = -4, sum = 3;

    public Trace() {
        y = temp + 3;
        sum = 3 + temp + 2;
        temp -= 2;
    }

    public Trace(Trace t) {
        sum = t.sum++;
        x = t.x + 2;
        t.methodB(2, 3);
    }

    public void methodA(int m, int n) {
        int x = 2;
        y = y + m + (temp++);
        x = x + 5 + n;
        sum = sum + x + y;
        System.out.println(x + " " + y + " " + sum);
    }

    public void methodB(int m, int n) {
        int y = 0;
        y = y + this.y;
        x = this.y + 2 + temp;
        methodA(x, y);
        sum = x + y + sum;
        System.out.println(x + " " + y + " " + sum);
    }
}

public class CSE111Week04OptionalLabTask06 {

    public static void main(String[] args) {
        Trace t1 = new Trace();
        Trace t2 = new Trace(t1);
        t1.methodA(1, 2);
        t2.methodB(3, 2);

    }
}
