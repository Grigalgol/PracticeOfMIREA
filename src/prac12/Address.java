package prac12;

import java.util.StringTokenizer;

public class Address {
    private String Country = "";
    private String Region = "";
    private String City = "";
    private String Street = "";
    private String House = "";
    private String Housing = "";
    private String Flat = "";

    public Address(String adr, boolean anotherToken) {
        if(!anotherToken) {
            Country = adr.split(",")[0];
            Region = adr.split(",")[1];
            City = adr.split(",")[2];
            Street = adr.split(",")[3];
            House = adr.split(",")[4];
            Housing = adr.split(",")[5];
            Flat = adr.split(",")[6];
        }
        else {
            StringTokenizer tok = new StringTokenizer(adr, ".,;");
            Country = tok.nextToken().trim();
            Region = tok.nextToken().trim();
            City = tok.nextToken().trim();
            Street = tok.nextToken().trim();
            House = tok.nextToken().trim();
            Housing = tok.nextToken().trim();
            Flat = tok.nextToken().trim();
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                 Country + ' ' +
                 Region + ' ' +
                 City + ' ' +
                 Street + ' ' +
                 House + ' ' +
                 Housing + ' ' +
                 Flat + ' ' +
                '}';
    }
}
