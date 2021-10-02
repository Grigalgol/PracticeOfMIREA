package prac5;

public class Task1 {
    //упр 6 Проверка чисел на простоту
    public static void main(String[] args) {
        int i = 2;
        int n = 47;
        System.out.println(n + " - " + (isSimple(n, i) ? "простое число" : "составное число"));
    }

    private static boolean isSimple(int n, int i) {
        if (n < i) return false;
        else if (n == i) return true;
        else if (n % i == 0) return false;
        else return isSimple(n, i+1);
    }
}
