package prac10;

public class Client {
    Chair chair;

    void sit() {
        System.out.println("sit");
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public static void main(String[] args) {
        Chairfacroty test = new Chairfacroty();
        Client client = new Client();

        client.setChair(test.createVictorianChair(115));
        System.out.println(((VictorianChair)client.chair).getAge());

        client.setChair(test.createFunctionalChair());
        System.out.println(((FunctionalChair)client.chair).sum(1, 1));

        client.setChair(test.createMagicanChair());
        ((MagicanChair)client.chair).doMagic();


    }
}
