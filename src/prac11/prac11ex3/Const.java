package prac11.prac11ex3;

public class Const implements Complete{
    int number;
    Const(int number) {
        this.number = number;
    }

    @Override
    public int evaluate(int number) {
        return this.number;
    }
}
