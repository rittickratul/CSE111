
class TraceA {

    public int x = 0, y = 8, sum = 0;

    public void methodA(int y, int x) {
        int[] arr = {4, 7};
        this.x += x;
        arr[0] = y++;
        arr[1] += arr[1] % arr[0] * x;
        if (y % 2 == 0) {
            sum = x + methodB(arr[0]++, arr[1], y) + this.x;
        } else {
            sum = this.y + methodB(++arr[0], arr[1], x) + this.y;
        }
        System.out.println(x + " " + arr[0] + " " + sum);
    }

    public int methodB(int a, int b, int x) {
        sum = sum % x;
        if (a % b == x) {
            return this.y--;
        }
        this.x = a * b / x;
        y += this.x % this.y;
        System.out.println(a + " " + this.x + " " + y);
        return y;
    }
}

public class CSE111Week02LabTaskOptional04 {

    public static void main(String[] args) {
        TraceA t1 = new TraceA();
        t1.methodA(4, 7);
        int x = t1.methodB(3, 2, 1);
        System.out.println(t1.y + " " + t1.sum + " " + x);
    }

}
