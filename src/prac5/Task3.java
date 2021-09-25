package prac5;

public class Task3 {
    //упр 8 палиндром
    public static void main(String[] args) {
        System.out.println(palindrom("шалаш"));
        System.out.println(palindrom("мяч"));
        System.out.println(palindrom("и"));
    }

    private static String palindrom(String s) {
        if (s.length() == 1) return "YES";
        else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if(s.length()==2) return "YES";
                return palindrom(s.substring(1, s.length()-1));
            }
            else return "NO";
        }
    }
}
