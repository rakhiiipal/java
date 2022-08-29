package function;

public class fun1 {
    static int add(int x, int y) {
        int z;
        if (x < y) {
            z = x + y;

        } else {
            z = (x + y) * 6;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 60;
        int b = 40;
        int c = add(a, b);
        System.out.println(c);

    }

}
