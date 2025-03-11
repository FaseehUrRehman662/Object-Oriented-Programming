public class Code11 {
    public static void main(String[] args) {
        int limit = 10;
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        for (int i = 3; i <= limit; i++) {
            int sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
        }
    }
}
