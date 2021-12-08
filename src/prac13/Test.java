package prac13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        SortingStudentByGPA students = new SortingStudentByGPA();
        students.setArray();
        System.out.println("============Task2============");
        System.out.println("Массив без сортировки:");
        students.outArray();
        System.out.println("============Task3============");

        List<Student> l1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l1.add(students.setRandStudent());
        }

        List<Student> l2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            l2.add(students.setRandStudent());
        }

        List<Student> l12 = new ArrayList<>(l1);
        l12.addAll(l2);
        System.out.println("Массив без сортировки:");
        for (Student s : l12) {
            System.out.println(s);
        }

        l12.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGroup() - o2.getGroup();
            }
        });

        System.out.println("Массив с сортировкой по группам");
        for(Student s: l12) {
            System.out.println(s);
        }
    }
}
