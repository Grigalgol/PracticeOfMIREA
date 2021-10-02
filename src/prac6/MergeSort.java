package prac6;

public class MergeSort {
    public static Student[] mergeArray(Student[] studentA, Student[] studentB)
    {
        Student[] studentC = new Student[studentA.length + studentB.length];
        int positionA = 0;
        int positionB = 0;

        for(int i = 0; i < studentC.length; i++)
        {
            if (positionA == studentA.length)
            {
                studentC[i] = studentB[positionB];
                positionB++;
            }
            else if (positionB == studentB.length)
            {
                studentC[i] = studentA[positionA];
                positionA++;
            }
            else if (studentA[positionA].getScore() < studentB[positionB].getScore())
            {
                studentC[i] = studentA[positionA];
                positionA++;
            }
            else
            {
                studentC[i] = studentB[positionB];
                positionB++;
            }
        }
        return studentC;
    }

    public static Student[] sortArray(Student[] student)
    {
        if(student == null) return null;
        if(student.length < 2) return student;

        Student[] studentA = new Student[student.length / 2];
        System.arraycopy(student, 0, studentA, 0, student.length / 2);

        Student[] studentB = new Student[student.length - student.length / 2];
        System.arraycopy(student, student.length / 2, studentB, 0, student.length - student.length / 2);

        studentA = sortArray(studentA);
        studentB = sortArray(studentB);

        return mergeArray(studentA, studentB);
    }
}
