class TracingX {
    public int x, y = 1;
    public int metA(int y) {
        y += x + 3;
        int temp = y + this.y;
        if (temp % 2 == 0) {
            return temp;
        }
        TracingX t = new TracingX();
        t.y = this.x - (++x) + t.x;
        this.y = y + t.metA(t.x);
        System.out.println(x + " " + y + " " + temp);
        return temp + this.y;
    }
}
public class CSE111Week04LabTask06 {
    public static void main(String[] args) {
        TracingX t1 = new TracingX();
        t1.y = t1.x = 5;
        TracingX t2 = new TracingX();
        t2.x = t1.metA(2);
        t2.y = t2.metA(4);
        System.out.println(t1.y + t1.x + " " + t2.x + " " + t2.y);
    }
}
