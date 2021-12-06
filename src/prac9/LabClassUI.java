package prac9;

import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LabClassUI {
    LabClassUI(LabClass c) throws EmptyStringException {
        int n;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Программа для работы со студентами. Список команд:");
            System.out.println("1) Вывод списка студентов");
            System.out.println("2) Вывод списка студентов (с сортировкой по имени)");
            System.out.println("3) Вывод списка студентов (с сортировкой по ID)");
            System.out.println("4) Поиск студента по имени");
            System.out.println("5) Завершить работу");
            System.out.print("Введите номер команды: ");
            try {
                n = scanner.nextInt();
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Неправильный формат воода");
            }
            Scanner scanner1 = new Scanner(System.in);
            switch (n) {
                case 1: {
                    System.out.println("Класс:");
                    c.getStudents();
                    break;
                }
                case 3: {
                    System.out.println("Класс (сортировка по ID):");
                    c.sortById();
                    c.getStudents();
                    break;
                }
                case 2: {
                    System.out.println("Класс (сортировка по имени:");
                    c.sortByName();
                    c.getStudents();
                    break;
                }
                case 4: {
                    try {
                        System.out.print("Введите имя для поиска: ");
                        String name = scanner1.nextLine();
                        if (name.length() == 0) {
                            throw new EmptyStringException();
                        }
                        Student student = c.find(name);
                        System.out.println(student.name + ": " + student.id);
                    } catch (NullPointerException e) {
                        throw new NullPointerException("Student not found");
                    } catch (EmptyStringException e) {
                        throw new EmptyStringException("String is empty");
                    }
                    break;
                }
                case 5: {
                    System.out.println("Завершение");
                    return;
                }

            }
        }
    }
}
