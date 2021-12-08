package prac13;

import prac14.IStudent;

import java.text.Format;
import java.util.Formatter;

public class Student implements IStudent {
    private String name;
    private int course;
    private int group;
    private int avg;

    public Student(String name, int course, int group, int avg) {
        this.name = name;
        this.course = course;
        this.group = group;
        this.avg = avg;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        Formatter formatter = new Formatter();
        formatter.format("Student %10s | Course %d | Group %2d | Average mark %3d", name, course, group, avg);
        return formatter.toString();
    }
}
