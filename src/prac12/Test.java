package prac12;

public class Test {
    public static void main(String[] args) {
        Person person = new Person("Grigoriy", "Golubev", "Alexsandrovich");
        System.out.println(person.getPerson());
        Person nedoperson = new Person("Golubev");
        System.out.println(nedoperson.getPerson());

        Address address = new Address("Russia, 77, Moscow, Kommunarka, 118, 4, 4", false);
        System.out.println(address);
        Address address1 = new Address("USA, 13, LosAngeles, BaconStreet, 15, 3, 2", false);
        System.out.println(address1);
        Address address2 = new Address("Russia; 21; Novocheboksarsk; Pervomayskaya; 29; 21; 2", true);
        System.out.println(address2);

        String shirts[] = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S0010,Grange T-Shirt,Grange,S";
        shirts[10] = "S0011,Maroon Polo Shirt,Black,S";
        Shirt shirt[] = new Shirt[11];
        for (int i = 0; i < 11; i++) {
            shirt[i] = new Shirt(shirts[i]);
            System.out.println(shirt[i]);
        }
        PhoneNum num = new PhoneNum("+104289652211");
        System.out.println(num);
        PhoneNum num1 = new PhoneNum("+79131234561");
        System.out.println(num1);
        PhoneNum num2 = new PhoneNum("89876543210");
        System.out.println(num2);
    }
}
