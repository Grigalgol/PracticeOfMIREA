package prac12;

public class Person {
    protected String name;
    protected String surname;
    protected String oname;

    public Person(String name, String surname, String oname) {
        this.name = name;
        this.surname = surname;
        this.oname = oname;
    }

    public Person(String surname) {
        this.surname = surname;
    }

    public String getPerson() {
        if ((this.oname != null) && (this.name != null)) {
            return (this.surname + " " + this.name.charAt(0) + "." + this.oname.charAt(0) + ".");
        }
        return this.surname;
    }
}
