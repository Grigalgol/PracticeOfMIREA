package prac5;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(reverse(228, 0));
    }

    private static int reverse(int n, int i) {
        return (n == 0) ? i : reverse(n / 10, i * 10 + n % 10);
    }
}
