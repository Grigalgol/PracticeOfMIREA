package prac6;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    private static SortingStudentsByGPA cmp = new SortingStudentsByGPA();

    @Override
    public int compare(Student student1, Student student2) {
        if(student1.getScore()<student2.getScore()) return -1;
        else if(student1.getScore()>student2.getScore()) return 1;
        else return 0;
    }

    public static void quickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        Student support = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (cmp.compare(array[i],support) == 1) {
                i++;
            }

            while (cmp.compare(array[i],support) == -1) {
                j--;
            }

            if (i <= j) {
                Student temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
}
