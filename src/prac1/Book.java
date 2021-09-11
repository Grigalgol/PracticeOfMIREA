package prac1;

public class Book {
    private int pageCount;
    private String author;
    private int age;
    private String title;

    public Book(int pageCount, String author, int age, String title) {
        this.pageCount = pageCount;
        this.author = author;
        this.age = age;
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Книга называется "+ title + ". Её написал " + author + ". В ней " + pageCount + " страниц.";
    }
}
