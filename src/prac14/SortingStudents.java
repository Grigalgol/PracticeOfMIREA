package prac14;

import prac13.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortingStudents implements Comparator<IStudent> {
    static ArrayList<IStudent> IDNumber = new ArrayList<>();

    public SortingStudents() {
        for (int i = 0; i < 10; i++) {
            Student temp = new Student();
            String[] names = {"Grisha", "Ilya", "Kirill", "Denis", "Danil", "Igor", "Masha", "Katya", "Sveta", "Dasha", "Olya"};
            temp.setName(names[(int) (Math.random() * names.length)]);
            temp.setGroup((int) (Math.random() * 29 + 1));
            temp.setCourse((int) (Math.random() * 4 + 1));
            temp.setAvg((int) (Math.random() * 50 + 51));
            IDNumber.add(temp);
        }
    }

    public void outArray() {
        System.out.printf("| %10s | %6s | %5s | %3s | \n", "Name", "Course", "Group", "AVG");
        IDNumber.stream().forEach(s -> {
            System.out.printf("| %10s | %6s | %5s | %3s | \n", s.getName(), s.getCourse(), s.getGroup(), s.getAvg());
        });
    }

    @Override
    public int compare(IStudent o1, IStudent o2) {
        return Integer.compare(o1.getAvg(), o2.getAvg());
    }

    public void quicksort(int low, int high) {
        if (IDNumber.size() == 0) return;
        if (low >= high) return;
        IStudent average = IDNumber.get(low + (high - low) / 2);
        int i = low, j = high;
        while (i <= j) {
            while (compare(IDNumber.get(i), average) > 0) i++;
            while (compare(IDNumber.get(j), average) < 0) j--;
            if (i <= j) {
                Collections.swap(IDNumber, i, j);

                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(low, j);
        if (high > i)
            quicksort(i, high);
    }

    public static IStudent Linearfind(int res) {
        for (IStudent p : IDNumber)
            if (p.getAvg() == res)
                return p;
        return null;
    }

    public static IStudent Binarfind(int res, int i) {
        if (IDNumber.get(i) != null && ((IDNumber.get(i)).getAvg() == res))
            return IDNumber.get(i);
        else if (IDNumber.get(i + i / 2) != null && IDNumber.get(i + i / 2).getAvg() >= res)
            return Binarfind(res, i + i / 2);
        else if (IDNumber.get(i - i / 2) != null && IDNumber.get(i - i / 2).getAvg() <= res)
            return Binarfind(res, i - i / 2);
        else
            return null;
    }

    public static void main(String[] args) {
        SortingStudents students = new SortingStudents();
        System.out.println("Массив без сортировки");
        students.outArray();
        System.out.println("Массив с сортировкой");
        students.quicksort(0, 9);
        students.outArray();
        System.out.print("Поиск элемента с помощью линейного поиска - ");
        Scanner scanner = new Scanner(System.in);
        Integer find = scanner.nextInt();
        if (Linearfind(find) != null) System.out.println(Linearfind(find).getName() + " " + Linearfind(find).getAvg());
        else System.out.println("Такого элемента не существует");
        System.out.print("Поиск элемента с помощью бинарного поиска - ");
        Integer find2 = scanner.nextInt();
        if (Linearfind(find2) != null) System.out.println(Linearfind(find2).getName() + " " + Linearfind(find2).getAvg());
        else System.out.println("Такого элемента не существует");
    }
}
