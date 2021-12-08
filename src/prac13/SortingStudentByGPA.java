package prac13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentByGPA implements Comparator<Student> {

    private ArrayList<Student> IDNumber = new ArrayList<>();

    public void setIDNumber(ArrayList<Student> idNumber) {
        IDNumber = idNumber;
    }

    public Student setRandStudent() {
        Student temp = new Student();
        String[] names = {"Grisha", "Ilya", "Kirill", "Denis", "Danil", "Igor", "Masha", "Katya", "Sveta", "Dasha", "Olya"};
        temp.setName(names[(int) (Math.random() * names.length)]);
        temp.setGroup((int) (Math.random() * 29 + 1));
        temp.setCourse((int) (Math.random() * 4 + 1));
        temp.setAvg((int) (Math.random() * 50 + 51));
        return temp;
    }

    public void setArray() {
        for (int i = 0; i < 10; i++) {
            IDNumber.add(this.setRandStudent());
        }
    }

    public void outArray() {
        for (Student student : IDNumber) {
            System.out.println(student);
        }
    }

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAvg(), o2.getAvg());
    }

    public void quicksort(int low, int high) {
        if (IDNumber.size() == 0) return;
        if (low >= high) return;
        Student average = IDNumber.get(low + (high - low) / 2);
        int i = low, j = high;
        while (i<=j) {
            while (compare(IDNumber.get(i), average) > 0) i++;
            while (compare(IDNumber.get(j), average) < 0) j--;
            if(i<=j) {
                Collections.swap(IDNumber, i, j);

                i++;
                j--;
            }
        }
        if(low < j)
            quicksort(low, j);
        if(high > i)
            quicksort(i, high);
    }
}
