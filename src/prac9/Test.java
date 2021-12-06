package prac9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws EmptyStringException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ИНН (4 цифры)");
        try {
            int inn = scanner.nextInt();
            if(inn>=10000 || inn<=999) {
                System.out.println("Неправильный ИНН");
            }
            else System.out.println(inn);
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Неправилльный формат ввода");
        }


        System.out.println("Введите размер списка: ");
        int n = scanner.nextInt();
        LabClass c = new LabClass(n);
        LabClassUI menu = new LabClassUI(c);

    }
}
