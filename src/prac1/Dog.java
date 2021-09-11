package prac1;

public class Dog {
    private String name;
    private int age;
    private String owner;

    public Dog() {
        name = "dog";
        age = 0;
        owner = "";
    }
    public Dog(String name, int age) {
        this.name=name;
        this.age=age;
        owner = "";
    }

    public Dog(String name, int age, String owner) {
        this.name=name;
        this.age=age;
        this.owner=owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Собака по кличке " + name + ". Ей " + age + "лет.";
    }
}
