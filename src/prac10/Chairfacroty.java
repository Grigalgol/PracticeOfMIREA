package prac10;

public class Chairfacroty implements AbstractChairFactory{
    @Override
    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(age);
    }

    @Override
    public MagicanChair createMagicanChair() {
        return new MagicanChair();
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
