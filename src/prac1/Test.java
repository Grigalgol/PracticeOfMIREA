package prac1;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Бобик", 6);
        Dog dog2 = new Dog("Никита", 18, "Гриша");

        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        Book book = new Book(467, "А.С. Пушкин", 3, "Сказки");
        System.out.println(book.toString());

        Ball ball = new Ball("синий", 21);
        System.out.println(ball.toString());
    }
}
