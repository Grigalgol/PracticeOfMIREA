package prac10;

public interface AbstractChairFactory {
    public VictorianChair createVictorianChair(int age);
    public MagicanChair createMagicanChair();
    public FunctionalChair createFunctionalChair();
}
