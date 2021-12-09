package prac16;

public class Address {
    protected final String cityName;
    protected final String zipCode;
    protected final String streetName;
    protected final String buildingNumber;
    protected final String buildingLetter;
    protected final String apartamentNumber;

    public Address(String cityName, String zipCode, String streetName, String buildingNumber, String buildingLetter, String apartamentNumber) {
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.buildingNumber = buildingNumber;
        this.buildingLetter = buildingLetter;
        this.apartamentNumber = apartamentNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public String getBuildingLetter() {
        return buildingLetter;
    }

    public String getApartamentNumber() {
        return apartamentNumber;
    }
}
