package prac9;

import java.util.Formatter;

public class Student {
    protected int id;
    protected String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        if (name == "") {
            throw new NullPointerException();
        }
        Formatter f = new Formatter();
        f.format("%10s: %2s", name, id);
        return f.toString();
    }
}
