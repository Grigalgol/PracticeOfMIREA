package prac5;

public class Task2 {
    //упр 7 вывести все простые множители числа в порядке неубывания
    public static void main(String[] args) {
        recursion(750, 2);
    }

    private static void recursion(int n, int k) {
        if (k > n / 2) {
            System.out.println(n);
            return;
        }
        if (n % k == 0) {
            System.out.println(k);
            recursion(n/k, k);
        }
        else recursion(n, ++k);
    }
}
