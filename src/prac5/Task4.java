package prac5;

public class Task4 {
    public static void main(String[] args) {
        //упр 9
        System.out.println(count(2, 3));
    }

    private static int count(int a, int b) {
        if (a > b + 1) return 0;
        if(a == 0 || b == 0) return 1;
        return count(a, b-1) + count(a-1, b-1);
    }

}
