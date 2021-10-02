package prac6;

public class Student {
    protected int idNumber;
    protected String name;
    protected int score;

    public Student(int idNumber, String name, int score) {
        this.idNumber = idNumber;
        this.name = name;
        this.score = score;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
