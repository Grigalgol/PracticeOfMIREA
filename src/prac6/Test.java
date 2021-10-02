package prac6;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student[] idNumbers = new Student[10];
        idNumbers[0] = new Student(1000, "Nikita", 4);
        idNumbers[1] = new Student(984, "Artem", 3);
        idNumbers[2] = new Student(1032, "Vasya", 1);
        idNumbers[3] = new Student(1001, "Sveta", 8);
        idNumbers[4] = new Student(101, "Katya", 3);
        idNumbers[5] = new Student(777, "Grisha", 8);
        idNumbers[6] = new Student(932, "Daniil", 4);
        idNumbers[7] = new Student(645, "Maksim", 6);
        idNumbers[8] = new Student(1103, "Artem", 7);
        idNumbers[9] = new Student(1234, "Nastya", 6);
        System.out.println("Изначальный массив:");
        for (Student student : idNumbers) {
            System.out.println(student);
        }

        for (int left = 0; left < idNumbers.length; left++) {
            // Вытаскиваем значение элемента
            Student value = new Student(idNumbers[left].getIdNumber(), idNumbers[left].getName(), idNumbers[left].getScore());
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.getIdNumber() < idNumbers[i].getIdNumber()) {
                    idNumbers[i + 1] = idNumbers[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            idNumbers[i + 1] = value;
        }

        System.out.println("\nОтсортированный массив");
        for (Student student : idNumbers) {
            System.out.println(student);
        }
    }
}
