package prac11.prac11ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println(
                new Subtract(
                        new Multiply(
                                new Const(2),
                                new Variable("x")
                        ),
                        new Const(3)
                ).evaluate(x)
        );
    }
}
