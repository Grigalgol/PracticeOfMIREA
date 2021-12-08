package prac12;

public class PhoneNum {
    private String countryCode;
    private String num1;
    private String num2;
    private String num3;

    public PhoneNum(String pn) {
        try {
            if (pn.matches("(\\+{1})([0-9]{10,})")) {
                int i = pn.length() - 10;
                countryCode = pn.substring(0, i);
                num3 = pn.substring(pn.length() - 4, pn.length());
                num2 = pn.substring(pn.length() - 7, pn.length() - 4);
                num1 = pn.substring(i, pn.length() - 7);
            } else if (pn.matches("8([0-9]{10})")) {
                countryCode = "+7";
                num3 = pn.substring(7, 11);
                num2 = pn.substring(4, 7);
                num1 = pn.substring(1, 4);
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Unavailable phone number");
            return;
        }
    }

    @Override
    public String toString() {
        return countryCode + num1 + "-" + num2 + "-" + num3;
    }
}
