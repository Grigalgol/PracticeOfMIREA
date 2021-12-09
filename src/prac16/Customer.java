package prac16;

public class Customer extends Address{
    protected final String firstName;
    protected final String secondName;
    protected final int fage;
    protected final Address address;
    protected Customer MATURE_UNKNOWN_CUSTOMER;
    protected Customer NOT_MATURE_CUSTOMER;

    public Customer(String cityName, String zipCode, String streetName, String buildingNumber, String buildingLetter, String apartamentNumber, String firstName, String secondName, int fage, Address address) {
        super(cityName, zipCode, streetName, buildingNumber, buildingLetter, apartamentNumber);
        this.firstName = firstName;
        this.secondName = secondName;
        this.fage = fage;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getFage() {
        return fage;
    }

    public Address getAddress() {
        return address;
    }
}
